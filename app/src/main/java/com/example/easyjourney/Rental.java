package com.example.easyjourney;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.easyjourney.databinding.ActivityRentalBinding;

import java.util.ArrayList;

public class Rental extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRentalBinding binding=ActivityRentalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_rental);

        recyclerView = findViewById(R.id.recyclerView);

        // Here, we have created new array list and added data to it
        ArrayList<carsName> carsNameArrayList = new ArrayList<carsName>();
        carsNameArrayList.add(new carsName(R.drawable.fortuner,"Toyota Fortuner","2022","Diesel","10000/Day","7 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.thar_red,"Mahindra Thar","2022","Diesel","5000/Day","4 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.scorpio,"Mahindra Scorpio","2021","Diesel","4000/Day","7 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.fortuner_black,"Toyota Fortuner","2022","Petrol","11000/Day","7 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.creta,"Hyundai Creta","2022","Petrol","3500/Day","5 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.grandi_10,"Hyundai Grand i10","2020","Petrol","2000/Day","5 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.i_20,"Hyundai Elite i20","2021","Diesel","2300/Day","5 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.swift,"Maruti Swift","2021","Diesel","1900/Day","5 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.alto,"Maruti Alto","2022","Petrol","1600/Day","5 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.activa,"Honda Activa 125","2021","Petrol","500/Day","2 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.jupiter,"TVS Jupiter","2022","Petrol","550/Day","2 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.apache,"TVS Apache RTR 160","2021","Petrol","900/Day","2 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.standard,"Royal Enfield Bullet 350","2021","Petrol","1000/Day","2 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.bullet,"Royal Enfield Classic 350","2021","Petrol","1200/Day","2 Seater"));
        carsNameArrayList.add(new carsName(R.drawable.himalyan,"Royal Enfield Himalayan","2021","Petrol","1100/Day","2 Seater"));

        carAdapter cadapter = new carAdapter(this, carsNameArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);


        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(cadapter);

    }
    public void formlink (View v){
        Uri uri = Uri.parse("https://forms.gle/9CGq5DoCXP7rjJae8");
        Intent in = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(in);
    }
}