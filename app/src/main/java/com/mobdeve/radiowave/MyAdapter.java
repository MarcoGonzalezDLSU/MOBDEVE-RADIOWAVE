package com.mobdeve.radiowave;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
    Context context;
    public AMradiostationsClass[] amradiostations;
    public MyAdapter(Context context, AMradiostationsClass[] amradiostations) {
        this.context = context;
        this.amradiostations = amradiostations;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(context).inflate(R.layout.amlistpagerecyclerview,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvAMstationname.setText(amradiostations[position].getstationname());
        holder.tvAMstationlink.setText(amradiostations[position].getstationlink());
    }


    @Override
    public int getItemCount() {
        return amradiostations.length;
    }
}


