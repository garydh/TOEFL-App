package com.example.gerdev.toefllearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.djakaumbarawurung.persipantestcept.R;

public class ActivityMidGrammarTopic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid_grammar_topic);
        this.setTitle("Grammar Topics");
    }

    public void tampilkanMaterialAdjectives(View view) {
        Intent intent = new Intent(ActivityMidGrammarTopic.this, ActivityMaterialGrammar.class);
        startActivity(intent);
    }

    public void tampilkanMaterialNouns(View view) {
        Intent intent = new Intent(ActivityMidGrammarTopic.this, ActivityMaterialGrammar.class);
        startActivity(intent);
    }

    public void tampilkanMaterialTenses(View view) {
        Intent intent = new Intent(ActivityMidGrammarTopic.this, ActivityMaterialGrammar.class);
        startActivity(intent);
    }

    public void tampilkanMaterialPrepositions(View view) {
        Intent intent = new Intent(ActivityMidGrammarTopic.this, ActivityMaterialGrammar.class);
        startActivity(intent);
    }

}
