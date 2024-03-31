package com.mobdeve.radiowave;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class AMListActivity extends AppCompatActivity {
    ImageButton btnfm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amlistpage);

        RecyclerView AMrecyclerview = findViewById(R.id.AMrecyclerview);
        AMradiostationsClass[] amradiostations = new AMradiostationsClass[]{
                new AMradiostationsClass("TeleRadyo","https://28103.live.streamtheworld.com/DZMM_SC"),
                new AMradiostationsClass("Super Radyo DZBB","https://28103.live.streamtheworld.com/DZMM_SC"),
                new AMradiostationsClass("Radio Veritas","http://28103.live.streamtheworld.com/DZMM_SC"),
                new AMradiostationsClass("Radyo La Verdad","http://radio.abc.net.au/live/rnmp3"),
        };
        AMrecyclerview.setLayoutManager(new LinearLayoutManager(this));
        AMrecyclerview.setAdapter(new MyAdapter(getApplicationContext(),amradiostations));

        btnfm = (ImageButton) findViewById(R.id.btnToFM);
        btnfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( AMListActivity.this, FMListActivity.class);
                startActivity(intent);
            }
        });

    }
}
