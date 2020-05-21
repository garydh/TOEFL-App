package com.example.gerdev.toefllearningapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.djakaumbarawurung.persipantestcept.R;

public class ActivityQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        this.setTitle("TOEFL Learning App");
    }

    public void tampilkanMidGrammar(View view) {
        Intent intent = new Intent(ActivityQuiz.this, ActivityMidGrammar.class);
        startActivity(intent);
    }

    public void tampilkanMidReading(View view) {
        Intent intent = new Intent(ActivityQuiz.this, ActivityMidReading.class);
        startActivity(intent);
    }

    public void tampilkanMidListening(View view) {
        Intent intent = new Intent(ActivityQuiz.this, ActivityMidListening.class);
        startActivity(intent);
    }

}
