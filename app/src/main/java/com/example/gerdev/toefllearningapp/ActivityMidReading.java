package com.example.gerdev.toefllearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.djakaumbarawurung.persipantestcept.R;

public class ActivityMidReading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid_reading);
        this.setTitle("Reading");
    }

    public void tampilkanSoalReading(View view) {
        Intent intent = new Intent(ActivityMidReading.this, ActivityKuisReading2.class);
        startActivity(intent);
    }

    public void tampilkanMaterialReading(View view) {
        Intent intent = new Intent(ActivityMidReading.this, ActivityKuisReading2.class);
        startActivity(intent);
    }

}
