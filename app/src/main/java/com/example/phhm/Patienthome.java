package com.example.phhm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Patienthome extends AppCompatActivity implements View.OnClickListener {

    private CardView medicineReminder, bloodSugar, bloodPressure, advice, dietPlan, prescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setLogo(R.drawable.menu);
        setContentView(R.layout.activity_patienthome);
       // this.setTitle("Homepage");
        medicineReminder = findViewById(R.id.medicineReminderId);
        bloodSugar = findViewById(R.id.bloodSugarId);
        bloodPressure = findViewById(R.id.bloodPressureId);
        advice = findViewById(R.id.adviceId);
        dietPlan = findViewById(R.id.dietPlanId);
        prescription = findViewById(R.id.prescriptionId);
        medicineReminder.setOnClickListener(this);
        bloodPressure.setOnClickListener(this);
        bloodSugar.setOnClickListener(this);
        advice.setOnClickListener(this);
        dietPlan.setOnClickListener(this);
        prescription.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.medicineReminderId)
        {
            Intent intent=new Intent(getApplicationContext(),MedicineReminder.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.bloodPressureId)
        {Intent intent=new Intent(getApplicationContext(),BloodPressure.class);
            startActivity(intent);

        }
        else if (v.getId() == R.id.bloodSugarId)
        {Intent intent=new Intent(getApplicationContext(),BloodSugar.class);
            startActivity(intent);

        }
        else if (v.getId() == R.id.adviceId)
        {Intent intent=new Intent(getApplicationContext(),Advice.class);
            startActivity(intent);

        }
        else if (v.getId() == R.id.prescriptionId)
        {
            Intent intent=new Intent(getApplicationContext(),Retrievedata.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.dietPlanId)
        {
            Intent intent=new Intent(getApplicationContext(),DietPlan.class);
            startActivity(intent);
        }
    }

}