package com.mobdeve.radiowave;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class FMListActivity extends AppCompatActivity {
    ImageButton btnam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fmlistpage);

        RecyclerView FMrecyclerview = findViewById(R.id.FMrecyclerview);
        FMradiostationsClass[] fmradiostations = new FMradiostationsClass[]{
                new FMradiostationsClass("Monster Radio RX","www.link1.com"),
                new FMradiostationsClass("RJFM","www.link2.com"),
                new FMradiostationsClass("DW FM2","www.link3.com"),
                new FMradiostationsClass("99.5 Play FM","www.link4.com"),
        };
        FMrecyclerview.setLayoutManager(new LinearLayoutManager(this));
        FMrecyclerview.setAdapter(new MyAdapterFM(getApplicationContext(),fmradiostations));

        btnam = (ImageButton) findViewById(R.id.btnToAM);
        btnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( FMListActivity.this, AMListActivity.class);
                startActivity(intent);
            }
        });

    }
}
