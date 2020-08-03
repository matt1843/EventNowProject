package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PopConcerts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_concerts);
    }


    public void onButtonClick(View v) {
        if (v.getId() == R.id.weekendbutton) {
            Intent i = new Intent(PopConcerts.this, WeekendEvent.class);
            startActivity(i);
        }
        if (v.getId() == R.id.billiebutton) {
            Intent i = new Intent(PopConcerts.this, BillieEvent.class);
            startActivity(i);
        }
        if (v.getId() == R.id.hasleybutton) {
            Intent i = new Intent(PopConcerts.this, HasleyEvent.class);
            startActivity(i);
        }
    }

}
