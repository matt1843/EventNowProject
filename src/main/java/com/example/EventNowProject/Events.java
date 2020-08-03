package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

    }

    public void onButtonClick (View v) {
        if (v.getId() == R.id.movies_btn) {
            Intent i = new Intent(Events.this, Movies.class);
            startActivity(i);
        }
        if (v.getId() == R.id.concerts_btn) {
            Intent i = new Intent(Events.this, Concerts.class);
            startActivity(i);
        }
        if (v.getId() == R.id.food_btn) {
            Intent i = new Intent(Events.this, Food.class);
            startActivity(i);
        }

    }
}
