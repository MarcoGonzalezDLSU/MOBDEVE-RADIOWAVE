package com.mobdeve.radiowave;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MyAdapterFM extends RecyclerView.Adapter<MyAdapterFM.ViewHolder> {
    private Context context;
    private FMradiostationsClass[] fmradiostations;
    private Executor executor = Executors.newCachedThreadPool();

    public MyAdapterFM(Context context, FMradiostationsClass[] fmradiostations) {
        this.context = context;
        this.fmradiostations = fmradiostations;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fmlistpagerecyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterFM.ViewHolder holder, int position) {
        holder.bind(position);
        FMradiostationsClass station = fmradiostations[position];
        holder.tvFMstationname.setText(station.getstationname());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                executor.execute(new PlayAudioTask(station.getstationlink()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return fmradiostations.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvFMstationname;
        TextView tvFMstationlink;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvFMstationname = itemView.findViewById(R.id.tvFMstationname);
            tvFMstationlink = itemView.findViewById(R.id.tvFMstationlink);
        }

        public void bind(int position) {
            FMradiostationsClass station = fmradiostations[position];
            // Set the station name
            tvFMstationname.setText(station.getstationname());
            // Set the station link
            tvFMstationlink.setText(station.getstationlink());
            // Set the station image
            imageView.setImageResource(R.drawable.rvimgstationcontainer); // Assuming you have a default image in your drawable folder
        }
    }
}
