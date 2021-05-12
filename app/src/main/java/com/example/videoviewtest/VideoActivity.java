package com.example.videoviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView videoview = (VideoView)findViewById(R.id.video);

        Uri url= Uri.parse("android.resource://" + getPackageName() + "/raw/small");
        videoview.setVideoURI(url);

        videoview.setMediaController(new MediaController(this));
    }
}