package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ChildrensMovies extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_childrens_movies);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.princessbttn) {
            Intent i = new Intent(ChildrensMovies.this, PrincessEvent.class);
            startActivity(i);
        }

        if (v.getId() == R.id.upbutton) {
            Intent i = new Intent(ChildrensMovies.this, UpMovieEvent.class);
            startActivity(i);
        }

        if (v.getId() == R.id.cocobutton) {
            Intent i = new Intent(ChildrensMovies.this, CocoMovieEvent.class);
            startActivity(i);
        }
    }
}
