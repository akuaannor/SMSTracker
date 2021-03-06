package app.sms.com.smstracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by jessicaannor on 17/03/2018.
 */
public class smsBroadcastReceiver extends BroadcastReceiver {
    public static final String SMS_BUNDLE = "pdus";



    public void onRecive(Context context, Intent intent) {
        Bundle intentExtras = intent.getExtras();
        if(intentExtras != null){
            Object[] sms = (Object[]) intentExtras.get(SMS_BUNDLE);
            String smsMessageStr = "";
            for(int i = 0; i< sms.length; ++i) {
                SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) sms[1]);

                String smsBody = smsMessage.getMessageBody().toString();
                String address = smsMessage.getOriginatingAddress();

                smsMessageStr += "SMS Form: " + address + "\n";
                smsMessageStr += smsBody + "\n";

            }
            Toast.makeText(context, smsMessageStr, Toast.LENGTH_LONG).show();

            MainActivity inst = MainActivity.instance().instance();
            inst.updateList(smsMessageStr);
        }
    }
    @Override
    public void onReceive(Context context, Intent intent) {

    }
}



