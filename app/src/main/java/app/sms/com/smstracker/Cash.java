package app.sms.com.smstracker;
import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by jessicaannor on 23/03/2018.
 */

public class Cash {

    public double amount;
    public String type, purpose, date;


    public Cash() {
        // Default constructor
    }

    public Cash(String type, String purpose, String date, double amount) {
        this.type = type;
        this.purpose = purpose;
        this.date = date;
        this.amount = amount;
    }

    public Cash(String type, String purpose, double amount) {
        this.type = type;
        this.purpose = purpose;
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }
}


