package com.svazinskas.youtubeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnSingleVideo;
    private Button btnStandaloneMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSingleVideo = (Button) findViewById(R.id.btnPlaySingle);
        btnStandaloneMenu = (Button) findViewById(R.id.btnStandalone);

        btnSingleVideo.setOnClickListener(this);
        btnStandaloneMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.btnPlaySingle:
                intent = new Intent(MainActivity.this, YoutubeActivity.class);
                break;
            case R.id.btnStandalone:
                intent = new Intent(MainActivity.this, StandaloneActivity.class);
                break;

            default:
        }

        if(intent !=null)
            startActivity(intent);
    }
}
