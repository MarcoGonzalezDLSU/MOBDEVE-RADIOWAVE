package com.mobdeve.radiowave;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.ImageView;
import android.widget.TextView;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private AMradiostationsClass[] amradiostations;

    public MyAdapter(Context context, AMradiostationsClass[] amradiostations) {
        this.context = context;
        this.amradiostations = amradiostations;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.amlistpagerecyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return amradiostations.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvAMstationname;
        TextView tvAMstationlink;
        ImageView imageView; // Add ImageView

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAMstationname = itemView.findViewById(R.id.tvAMstationname);
            tvAMstationlink = itemView.findViewById(R.id.tvAMstationlink);
            imageView = itemView.findViewById(R.id.imageView); // Initialize ImageView
        }

        public void bind(int position) {
            AMradiostationsClass station = amradiostations[position];
            // Set the station name
            tvAMstationname.setText(station.getstationname());
            // Set the station link
            tvAMstationlink.setText(station.getstationlink());

            // Set the image resource
            imageView.setImageResource(R.drawable.rvimgstationcontainer);
        }
    }
}