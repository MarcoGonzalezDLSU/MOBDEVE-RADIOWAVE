package com.mobdeve.radiowave;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView tvAMstationname, tvAMstationlink;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAMstationname = itemView.findViewById(R.id.tvAMstationname);
        tvAMstationlink = itemView.findViewById(R.id.tvAMstationlink);
    }
}
