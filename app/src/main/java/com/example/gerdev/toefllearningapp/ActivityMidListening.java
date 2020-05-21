package com.example.gerdev.toefllearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.djakaumbarawurung.persipantestcept.R;

public class ActivityMidListening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid_listening);
        this.setTitle("Listening");
    }

    public void tampilkanMaterialListening(View view) {
        Intent intent = new Intent(ActivityMidListening.this, ActivityMaterialGrammar.class);
        startActivity(intent);
    }

    public void tampilkanSoalListening(View view) {
        Intent intent = new Intent(ActivityMidListening.this, ActivityListening.class);
        startActivity(intent);
    }

    public void tampilkanSoalListening2(View view) {
        Intent intent = new Intent(ActivityMidListening.this, ActivityListeningPartB.class);
        startActivity(intent);
    }


}
