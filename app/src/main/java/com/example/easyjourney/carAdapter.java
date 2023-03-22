package com.example.easyjourney;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class carAdapter extends RecyclerView.Adapter<carAdapter.Viewholder>{

    private final Context context;
    private final ArrayList<carsName> carsNameArrayList;

    public carAdapter(Context context, ArrayList<carsName> carsNameArrayList) {
        this.context = context;
        this.carsNameArrayList = carsNameArrayList;
    }

    @NonNull
    @Override
    public carAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull carAdapter.Viewholder holder, int position) {
        carsName model = carsNameArrayList.get(position);
        holder.car.setText(model.getCar());
        holder.fuel.setText(model.getFuel());
        holder.year.setText(model.getYear());
        holder.price.setText(model.getPrice());
        holder.seat.setText(model.getSeat());
        holder.image.setImageResource(model.getImage());
    }

    @Override
    public int getItemCount() {
        return carsNameArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private final ImageView image;
        private final TextView car;
        private final TextView fuel;
        private final TextView year;
        private final TextView price;
        private final TextView seat;



        public Viewholder(@NonNull View itemView) {
            super(itemView);
            car = itemView.findViewById(R.id.textView);
            fuel = itemView.findViewById(R.id.textView3);
            year = itemView.findViewById(R.id.textView4);
            price = itemView.findViewById(R.id.textView6);
            seat = itemView.findViewById(R.id.textView5);
            image = itemView.findViewById(R.id.imageView5);
        }
    }
}

