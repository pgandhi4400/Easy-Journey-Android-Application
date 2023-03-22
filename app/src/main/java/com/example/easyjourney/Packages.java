package com.example.easyjourney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Packages extends AppCompatActivity {

    private RecyclerView vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packages);

        vp = findViewById(R.id.pv);

        // Here, we have created new array list and added data to it
        ArrayList<carsName> carsNameArrayList = new ArrayList<carsName>();
        carsNameArrayList.add(new carsName(R.drawable.shimla,"Chandigarh to Shimla","  1 Night","Traveller","5000/Adult","2 Day"));
        carsNameArrayList.add(new carsName(R.drawable.goldentemple,"Chandigarh to Amritsar","  1 Night","Bus    ","4000/Adult","2 Day"));
        carsNameArrayList.add(new carsName(R.drawable.manali,"Chandigarh to Manali","  3 Night","Traveller","8000/Adult","4 Day"));
        carsNameArrayList.add(new carsName(R.drawable.chandigarh,"Chandigarh Day Tour","       Enjoyable","Bus    ","2000/Adult","Day"));
        carsNameArrayList.add(new carsName(R.drawable.himachal,"Chandigarh to Himachal","  9 Night","Traveller","38000/Adult","10 Day"));
        carsNameArrayList.add(new carsName(R.drawable.manali,"Chandigarh to Manali","  5 Night","Traveller","18000/Adult","6 Day"));

        carAdapter cadapter = new carAdapter(this, carsNameArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);


        vp.setLayoutManager(linearLayoutManager);
        vp.setAdapter(cadapter);
    }
    public void formlink (View v){
        Uri uri = Uri.parse("https://forms.gle/RW6ajVpFfTRFiq5XA");
        Intent in = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(in);
    }
}