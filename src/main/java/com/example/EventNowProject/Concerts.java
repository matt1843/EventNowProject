package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Concerts extends AppCompatActivity {

    Button Pop;
    Button Metal;
    Button Rap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concerts);

        Pop = findViewById(R.id.pop_btn);
        Metal = findViewById(R.id.metal_btn);
        Rap = findViewById(R.id.rap_btn);
    }

    public void onButtonClick (View v) {
        if (v.getId() == R.id.pop_btn) {
            Intent i = new Intent(Concerts.this, PopConcerts.class);
            startActivity(i);
        }
        if (v.getId() == R.id.metal_btn) {
            Intent i = new Intent(Concerts.this, MetalConcerts.class);
            startActivity(i);
        }
        if (v.getId() == R.id.rap_btn) {
            Intent i = new Intent(Concerts.this, RapConcerts.class);
            startActivity(i);
        }
    }


}
