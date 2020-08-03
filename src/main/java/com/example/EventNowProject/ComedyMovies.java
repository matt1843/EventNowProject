package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ComedyMovies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedy_movies);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.myspybutton) {
            Intent i = new Intent(ComedyMovies.this, MySpyMovieEvent.class);
            startActivity(i);
        }
        if (v.getId() == R.id.dolittlebutton) {
            Intent i = new Intent(ComedyMovies.this, DooLittleMovieEvent.class);
            startActivity(i);
        }
        if (v.getId() == R.id.badforlifebutton) {
            Intent i = new Intent(ComedyMovies.this, BadBoysForLifeMovieEvent.class);
            startActivity(i);
        }
    }
}
