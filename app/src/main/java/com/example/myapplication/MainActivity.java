package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MSG="com.example.myapplication.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeOrder(View view){
        //we will handle the click on button here
        //Build an intent to open another activity
        Intent intent= new Intent(this, OrderActivity.class);
        EditText editText1=findViewById(R.id.editTextText1);
        EditText editText2=findViewById(R.id.editTextText2);
        EditText editText3=findViewById(R.id.editTextText3);

        String message;
        if(!editText1.getText().toString().isEmpty()&&!editText2.getText().toString().isEmpty()
                &&!editText3.getText().toString().isEmpty()) {
            message = "Order for " + editText1.getText().toString() + "," + editText2.getText().toString()
                    + " & " + editText3.getText().toString() + " has been successfully placed" + "\n\nPlease Wait...";
            intent.putExtra(MSG, message);
        } else if (editText2.getText().toString().isEmpty()&&!editText1.getText().toString().isEmpty()
                &&!editText3.getText().toString().isEmpty()) {
            message = "Order for " +editText1.getText().toString() +" & " + editText3.getText().toString()
                    + " has been successfully placed" + "\n\nPlease Wait...";
            intent.putExtra(MSG, message);
        }else if(editText3.getText().toString().isEmpty()&&!editText1.getText().toString().isEmpty()
                &&!editText2.getText().toString().isEmpty()){
            message = "Order for " +editText1.getText().toString() +" & " + editText2.getText().toString()
                    + " has been successfully placed" + "\n\nPlease Wait...";
            intent.putExtra(MSG, message);
        }else if(!editText2.getText().toString().isEmpty()&&!editText3.getText().toString().isEmpty()
                &&editText1.getText().toString().isEmpty()){
            message = "Order for " +editText2.getText().toString() +" & " + editText3.getText().toString()
                    + " has been successfully placed" + "\n\nPlease Wait...";
            intent.putExtra(MSG, message);
        }
        else if(!editText1.getText().toString().isEmpty()&&editText2.getText().toString().isEmpty()
                &&editText3.getText().toString().isEmpty()){
            message = "Order for " +editText1.getText().toString()+ " has been successfully placed" + "\n\nPlease Wait...";
            intent.putExtra(MSG, message);
        }else if(!editText2.getText().toString().isEmpty()&&editText1.getText().toString().isEmpty()
                &&editText3.getText().toString().isEmpty()){
            message = "Order for " + editText2.getText().toString()
                    + " has been successfully placed" + "\n\nPlease Wait...";
            intent.putExtra(MSG, message);
        }else if(!editText3.getText().toString().isEmpty()&&editText2.getText().toString().isEmpty()
                &&editText1.getText().toString().isEmpty()){
            message = "Order for " + editText3.getText().toString()
                    + " has been successfully placed" + "\n\nPlease Wait...";
            intent.putExtra(MSG, message);
        }else{
            message = "No Order Placed!";
            intent.putExtra(MSG, message);
        }
        startActivity(intent);
    }
}