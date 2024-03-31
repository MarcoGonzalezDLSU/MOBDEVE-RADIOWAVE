package com.mobdeve.radiowave;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;

public class MyAdapterFM extends RecyclerView.Adapter<ViewHolderFM> {
    Context context;
    public FMradiostationsClass[] fmradiostations;
    public MyAdapterFM(Context context, FMradiostationsClass[] fmradiostations) {
        this.context = context;
        this.fmradiostations = fmradiostations;
    }


    @NonNull
    @Override
    public ViewHolderFM onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(context).inflate(R.layout.fmlistpagerecyclerview,parent,false);
        return new ViewHolderFM(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolderFM holder, int position) {
        holder.tvFMstationname.setText(fmradiostations[position].getstationname());
        holder.tvFMstationlink.setText(fmradiostations[position].getstationlink());
    }


    @Override
    public int getItemCount() {
        return fmradiostations.length;
    }
}

