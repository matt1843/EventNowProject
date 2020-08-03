package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Movies extends AppCompatActivity {

    Button Children;
    Button Comedy;
    Button Horror;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        Children = findViewById(R.id.childrens_btn);
        Comedy = findViewById(R.id.horror_btn);
        Horror = findViewById(R.id.comedy_btn);

    }

    public void onButtonClick (View v) {
        if (v.getId() == R.id.childrens_btn) {
            Intent i = new Intent(Movies.this, ChildrensMovies.class);
            startActivity(i);
        }

        if (v.getId() == R.id.comedy_btn) {
            Intent i = new Intent(Movies.this, ComedyMovies.class);
            startActivity(i);
        }
        if (v.getId() == R.id.horror_btn) {
            Intent i = new Intent(Movies.this, HorrorMovies.class);
            startActivity(i);
        }

    }
}
