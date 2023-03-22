package com.example.easyjourney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Bus extends AppCompatActivity {

    private RecyclerView vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        vp = findViewById(R.id.busl);

        // Here, we have created new array list and added data to it
        ArrayList<carsName> carsNameArrayList = new ArrayList<carsName>();
        carsNameArrayList.add(new carsName(R.drawable.hisar,"Hisar to Chandigarh","Bus Stand","BUS    ","550/Adult","5:00AM"));
        carsNameArrayList.add(new carsName(R.drawable.delhi,"Hisar to Delhi","Bus Stand","BUS    ","500/Adult","4:00AM"));
        carsNameArrayList.add(new carsName(R.drawable.hisar,"Chandigarh to Hisar","Sector-47","BUS    ","550/Adult","4:00PM"));
        carsNameArrayList.add(new carsName(R.drawable.amritsar,"Chandigarh to Amritsar","Sector-17","BUS    ","650/Adult","5:00PM"));
        carsNameArrayList.add(new carsName(R.drawable.delhi,"Chandigarh to Delhi","Sector-17","BUS    ","600/Adult","6:00AM"));
        carsNameArrayList.add(new carsName(R.drawable.delhi,"Delhi to Chandigarh","Peeragarhi","BUS    ","600/Adult","3:00PM"));

        carAdapter cadapter = new carAdapter(this, carsNameArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);


        vp.setLayoutManager(linearLayoutManager);
        vp.setAdapter(cadapter);
    }
    public void formlink (View v){
        Uri uri = Uri.parse("https://forms.gle/o28UQgG6hGWfQbuz5");
        Intent in = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(in);
    }
}