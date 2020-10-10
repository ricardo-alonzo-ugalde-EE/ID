package org.electricuniverse.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    TextView textViewID;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = (EditText) findViewById(R.id.editTextNumber); // find view by by with "edittext cas"
        textViewID = (TextView) findViewById(R.id.textViewID);
    }

    /**
     * Method to make the le button work. grayed out methods are not being used
     * */
    public void buttonSubmit_OnClick(View v)
    {
        String sGender = "none";
        String data =  editTextNumber.getText().toString(); // gets  numbers and converts to string
        String DOB = data.substring(0, 5); // passes only the first 6 characters of the string
        int gender = Integer.parseInt(data.charAt(6) + ""); // selects the character at position 6 converted to int
        if (gender >= 5)
        {
            sGender = "Male";
        }
        else
        {
            sGender = "Female";
        }

        int nationality = Integer.parseInt(data.charAt(10)+ "");
        String sNationality;
        if (nationality == 0)
        {
            sNationality = "South African";
        }
        else
        {
            sNationality = "Permanent Resident";
        }

        textViewID.setText("Your information from your ID number: \n" +
                            "Date of Birth: \n" + DOB +"\n" + "Gender: " + sGender + "\n"
                             + "Nationality: " + sNationality);  

    }
}