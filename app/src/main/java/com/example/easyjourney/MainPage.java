package com.example.easyjourney;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;


public class MainPage<ActivityMainBinding> extends AppCompatActivity {
    private SurfaceView src;
    private MediaPlayer mp;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private RecyclerView recyclerview;
    private carAdapter caradapter;

    public MainPage() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        src = findViewById(R.id.surfaceView);
        img1 = findViewById(R.id.imageView);
        img2 = findViewById(R.id.imageView2);
        img3 = findViewById(R.id.imageView3);
        img4 = findViewById(R.id.imageView4);
        mp = MediaPlayer.create(this, R.raw.car);
        src.setKeepScreenOn(true);
        SurfaceHolder cd = src.getHolder();
        cd.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mp.setDisplay(cd);
                mp.start();
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.setLooping(true);
                    }
                });
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });
    }
    public void rental(View v){
        Intent ab1 = new Intent(this,Rental.class);
        startActivity(ab1);
    }

    public void bus(View v){
        Intent ab2 = new Intent(this,Bus.class);
        startActivity(ab2);
    }

    public void driver(View v){
        Intent ab3 = new Intent(this,Driver.class);
        startActivity(ab3);
    }

    public void packages(View v){
        Intent ab4 = new Intent(this,Packages.class);
        startActivity(ab4);
    }
}
