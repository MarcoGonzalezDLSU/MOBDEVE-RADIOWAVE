package com.mobdeve.radiowave;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AMListActivity extends AppCompatActivity {
    ImageButton btnfm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amlistpage);

        RecyclerView AMrecyclerview = findViewById(R.id.AMrecyclerview);
        AMradiostationsClass[] amradiostations = new AMradiostationsClass[]{
                new AMradiostationsClass("TeleRadyo","www.link1.com"),
                new AMradiostationsClass("Super Radyo DZBB","www.link2.com"),
                new AMradiostationsClass("Radio Veritas","www.link3.com"),
                new AMradiostationsClass("Radyo La Verdad","www.link4.com"),
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
