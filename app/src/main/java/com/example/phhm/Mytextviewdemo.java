package com.example.phhm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class  Mytextviewdemo extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mytextviewdemo);
        Log.e("key", "hellow");
        TextView name = (TextView) findViewById(R.id.name);
        TextView email = (TextView) findViewById(R.id.email);
        TextView number = (TextView) findViewById(R.id.phone);
        TextView address = (TextView) findViewById(R.id.address);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        TextView confirm = (TextView) findViewById(R.id.confirm_password);

        Log.e("key", "hellow");
        EditText nameedit = (EditText) findViewById(R.id.name_field);
        EditText emailedit = (EditText) findViewById(R.id.email_field);
        EditText numberedit = (EditText) findViewById(R.id.phone_field);
        EditText addressedit = (EditText) findViewById(R.id.address_field);
        EditText usernameedit = (EditText) findViewById(R.id.username_field);
        EditText passwordedit = (EditText) findViewById(R.id.password_field);
        Log.e("key", "hellow");
        EditText confirmedit = (EditText) findViewById(R.id.confirm_password_field);
        Log.e("key", "hellow");
        Button patient = (Button) findViewById(R.id.button_1);
        Log.e("key", "hellow");
        Button doctor = (Button) findViewById(R.id.button_2);
        Log.e("key", "hellow");
        patient=findViewById(R.id.button_1);
        patient.setOnClickListener(this);
         doctor=findViewById(R.id.button_2);
         doctor.setOnClickListener(this);

    }


        //.setOnClickListener(this);

        //doctor.setOnClickListener(this);


    public void onClick(View v) {

        switch (v.getId()){



            case R.id.button_1:
                 Intent intent=new Intent(getApplicationContext(),Patienthome.class);
                startActivity(intent);
                break;
            case R.id.button_2:
                Intent intent1=new Intent(getApplicationContext(),Doctorhome1.class);
                startActivity(intent1);
                break;



        }

    }


}

