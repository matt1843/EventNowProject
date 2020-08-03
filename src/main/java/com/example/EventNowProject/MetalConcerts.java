package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MetalConcerts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metal_concerts);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.thyartbutton) {
            Intent i = new Intent(MetalConcerts.this, ThyArtEvent.class);
            startActivity(i);
        }
        if (v.getId() == R.id.amitybutton) {
            Intent i = new Intent(MetalConcerts.this, AmityEvent.class);
            startActivity(i);
        }
        if (v.getId() == R.id.ofmicebutton) {
            Intent i = new Intent(MetalConcerts.this, MiceAndMenEvent.class);
            startActivity(i);
        }

    }
}
