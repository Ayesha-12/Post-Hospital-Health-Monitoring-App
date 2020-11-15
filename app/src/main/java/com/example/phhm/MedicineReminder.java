package com.example.phhm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MedicineReminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_reminder);
        this.setTitle("Medicine Reminder");
    }
}
