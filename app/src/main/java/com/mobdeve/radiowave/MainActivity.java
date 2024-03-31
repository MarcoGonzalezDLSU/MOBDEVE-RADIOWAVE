package com.mobdeve.radiowave;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnam;
    Button btnfm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnam = (Button) findViewById(R.id.ambtn);
        btnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, AMListActivity.class);
                startActivity(intent);
            }
        });


        btnfm = (Button) findViewById(R.id.fmbtn);
        btnfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, FMListActivity.class);
                startActivity(intent);
            }
        });
    }
}
