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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amlistpage);//CHANGE THIS TO activity_main once menu page is done

        RecyclerView AMrecyclerview = findViewById(R.id.AMrecyclerview);

        AMradiostationsClass[] amradiostations = new AMradiostationsClass[]{
                new AMradiostationsClass("TeleRadyo","www.link1.com"),
                new AMradiostationsClass("Super Radyo DZBB","www.link2.com"),
                new AMradiostationsClass("Radio Veritas","www.link3.com"),
                new AMradiostationsClass("Radyo La Verdad","www.link4.com"),
        };

        AMrecyclerview.setLayoutManager(new LinearLayoutManager(this));
        AMrecyclerview.setAdapter(new MyAdapter(getApplicationContext(),amradiostations));
    }

}