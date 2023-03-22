package com.example.easyjourney;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.textView2);
        btn=findViewById(R.id.button);
        Handler text_changer = new Handler();
        text_changer.postDelayed(new Runnable() {

            public void run() {

                if (txt.getText().equals("Travel is a Therapy.")) {
                    txt.setText("Travel is an Investment in yourself.");
                    text_changer.postDelayed(this, 3000);
                } else if (txt.getText().equals("Travel is an Investment in yourself.")) {
                    txt.setText("Life is Short, and the World is Wide.");
                    text_changer.postDelayed(this, 3000);
                }
                else if(txt.getText().equals("Life is Short, and the World is Wide."))
                {
                    txt.setText("Collect Moments, Not Things.");
                    text_changer.postDelayed(this, 3000);
                }
                else if(txt.getText().equals("Collect Moments, Not Things."))
                {
                    txt.setText("Work, Travel, Save, Repeat.");
                    text_changer.postDelayed(this, 3000);
                }
                else if(txt.getText().equals("Work, Travel, Save, Repeat."))
                {
                    txt.setText("Go where you feel most ALIVE.");
                    text_changer.postDelayed(this, 3000);
                }
                else if(txt.getText().equals("Go where you feel most ALIVE."))
                {
                    txt.setText("Travel is a Therapy.");
                    text_changer.postDelayed(this, 3000);
                }


            }
        }, 2000);
    }
    public void vp(View v){
        Intent ab = new Intent(this,MainPage.class);
        startActivity(ab);
    }
}