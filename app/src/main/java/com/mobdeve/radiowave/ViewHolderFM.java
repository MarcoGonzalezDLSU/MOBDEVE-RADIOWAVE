package com.mobdeve.radiowave;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderFM extends RecyclerView.ViewHolder {
    TextView tvFMstationname, tvFMstationlink;
    public ViewHolderFM(@NonNull View itemView) {
        super(itemView);
        tvFMstationname = itemView.findViewById(R.id.tvFMstationname);
        tvFMstationlink = itemView.findViewById(R.id.tvFMstationlink);
    }
}
