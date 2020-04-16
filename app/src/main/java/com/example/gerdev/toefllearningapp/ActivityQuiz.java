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

    public void tampilkanSoalGrammar(View view) {
        Intent intent = new Intent(ActivityQuiz.this, ActivityKuisGrammar.class);
        startActivity(intent);
    }

    public void paketSoalReading(View view) {
        Intent intent = new Intent(ActivityQuiz.this, ActivityKuisReading2.class);
        startActivity(intent);
    }

    public void paketSoalListening(View view) {
        Intent intent = new Intent(ActivityQuiz.this, ActivityListening.class);
        startActivity(intent);
    }

    public void paketSoalListeningB(View view) {
        Intent intent = new Intent(ActivityQuiz.this, ActivityListeningPartB.class);
        startActivity(intent);
    }


}
