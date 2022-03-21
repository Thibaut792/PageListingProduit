package com.example.geolocalisation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHorder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHorder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHorder(LayoutInflater.from(context).inflate(R.layout.item_view, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHorder holder, int position) {
        holder.nameView.setText(items.get(position).getNom());
        holder.quantiteView.setText((items.get(position).getQuantite()));
        holder.imageView.setImageResource(items.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
