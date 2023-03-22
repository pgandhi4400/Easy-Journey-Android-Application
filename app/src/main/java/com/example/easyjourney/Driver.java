package com.example.easyjourney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Driver extends AppCompatActivity {

    private RecyclerView vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        vp = findViewById(R.id.mk);

        // Here, we have created new array list and added data to it
        ArrayList<carsName> carsNameArrayList = new ArrayList<carsName>();
        carsNameArrayList.add(new carsName(R.drawable.crsyta,"Toyota Innova","2022","Diesel","20रु/KM","6 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.dzire,"Maruti Swift Dzire","2020","Diesel","14रु/KM","4 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.etios,"Toyota Etios","2021","Petrol","15रु/KM","4 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.wagonrr,"Maruti Wagon R","2022","Petrol","10रु/KM","4 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.ertiga,"Maruti Ertiga","2022","Petrol+CNG","16रु/KM","5 Seater"));

        carAdapter cadapter = new carAdapter(this, carsNameArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);


        vp.setLayoutManager(linearLayoutManager);
        vp.setAdapter(cadapter);
    }
    public void formlink (View v){
        Uri uri = Uri.parse("https://forms.gle/9CGq5DoCXP7rjJae8");
        Intent in = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(in);
    }
}