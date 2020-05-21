package com.example.gerdev.toefllearningapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.djakaumbarawurung.persipantestcept.R;

public class ActivityMaterialGrammar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_grammar);
        this.setTitle("Grammar Material");

        VideoView videoView = (VideoView) findViewById(R.id.video);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videobasic;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
//    public void About (View view) {
//        Intent intent = new Intent(ActivityAbout.this, ActivityQuiz.class);
//        startActivity(intent);
//    }

}
