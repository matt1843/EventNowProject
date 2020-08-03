package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HorrorMovies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror_movies);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.cabinbutton) {
            Intent i = new Intent(HorrorMovies.this, CabinMovie.class);
            startActivity(i);
        }

        if (v.getId() == R.id.itbutton) {
            Intent i = new Intent(HorrorMovies.this, ItMovie.class);
            startActivity(i);
        }
        if (v.getId() == R.id.paranormalbutton) {
            Intent i = new Intent(HorrorMovies.this, ParanormalMovie.class);
            startActivity(i);
        }
    }
}
