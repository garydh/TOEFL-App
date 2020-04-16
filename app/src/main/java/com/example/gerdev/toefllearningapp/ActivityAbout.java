package com.example.gerdev.toefllearningapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.djakaumbarawurung.persipantestcept.R;

public class ActivityAbout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        this.setTitle("TOEFL Learning App");
    }
//    public void About (View view) {
//        Intent intent = new Intent(ActivityAbout.this, ActivityQuiz.class);
//        startActivity(intent);
//    }

}
