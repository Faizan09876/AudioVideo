package com.faizan.audiovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private VideoView myVideoView;
    private Button  btnplayvideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myVideoView = findViewById(R.id.myVideoView);
        btnplayvideo = findViewById(R.id.btnPlayVideo);

        btnplayvideo.setOnClickListener(MainActivity.this);
    }


    @Override
    public void onClick(View view) {

        Uri videoURI = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pexel);

    }
}