package com.example.gerdev.toefllearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.djakaumbarawurung.persipantestcept.R;

public class ActivityMidGrammar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid_grammar);
        this.setTitle("Grammar");
    }

    public void tampilkanSoalGrammar(View view) {
        Intent intent = new Intent(ActivityMidGrammar.this, ActivityKuisGrammar.class);
        startActivity(intent);
    }

    public void tampilkanMaterialGrammar(View view) {
        Intent intent = new Intent(ActivityMidGrammar.this, ActivityMidGrammarTopic.class);
        startActivity(intent);
    }

}
