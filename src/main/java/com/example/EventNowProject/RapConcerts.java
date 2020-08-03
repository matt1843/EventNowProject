package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RapConcerts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rap_concerts);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.suicideboysbutton) {
            Intent i = new Intent(RapConcerts.this, SuicideBoysEvent.class);
            startActivity(i);
        }
        if (v.getId() == R.id.roddybutton) {
            Intent i = new Intent(RapConcerts.this, RoddyEvent.class);
            startActivity(i);
        }
        if (v.getId() == R.id.dababybutton) {
            Intent i = new Intent(RapConcerts.this, DaBabyEvent.class);
            startActivity(i);
        }
    }
}
