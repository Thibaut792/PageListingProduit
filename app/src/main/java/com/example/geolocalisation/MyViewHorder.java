package com.example.geolocalisation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHorder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, quantiteView;

    public MyViewHorder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        nameView = itemView.findViewById(R.id.nom);
        quantiteView = itemView.findViewById(R.id.quantite);

    }
}
