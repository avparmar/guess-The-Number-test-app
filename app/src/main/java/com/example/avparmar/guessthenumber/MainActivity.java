package com.example.avparmar.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randNum;
    Random rand;

    public void clicked(View v) {

        System.out.println(randNum);


        EditText et =(EditText) findViewById(R.id.editText);
        int entry = Integer.parseInt(et.getText().toString());

        String message = "";

        if(entry == randNum) {
            message = "You've done it!!";
            randNum = rand.nextInt(21);
        }

        else if(randNum > entry) {
            message = "Higher!!";
        }

        else if(randNum < entry) {
            message = "Lower!!";

        }

        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rand = new Random();

        randNum = rand.nextInt(21);

    }
}
