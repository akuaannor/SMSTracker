package app.sms.com.smstracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by jessicaannor on 23/03/2018.
 */

public class addTransaction extends AppCompatActivity{

    FirebaseDatabase transactionDatabase;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_addcash);

        Spinner transtype = findViewById(R.id.typeSpinner);
        EditText amount = findViewById(R.id.amountEditText);
        EditText purpose = findViewById(R.id.purposeEditText2);
        Button add = findViewById(R.id.addButton);

    }

    public void onClick(){

    }

    public void addTransaction(String type, String purpose, double amount){
        DatabaseReference myRef = transactionDatabase.getReference();
        String key = myRef.push().getKey();
        Cash transactiondetails = new Cash( type,  purpose,  amount);
        myRef.child("transactiondetails").child(key).setValue(transactiondetails);
    }

//    const db = firebase.database();
//    const transactions = db.ref().child("transactions");
}

