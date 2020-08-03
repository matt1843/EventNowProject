package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InternationalFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international_food);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.mexicanbutton) {
            Intent i = new Intent(InternationalFood.this, MexicanEvent.class);
            startActivity(i);
        }

        if (v.getId() == R.id.vietnamessebutton) {
            Intent i = new Intent(InternationalFood.this, VietnameseEvent.class);
            startActivity(i);
        }
        if (v.getId() == R.id.chineasebutton) {
            Intent i = new Intent(InternationalFood.this, ChineseEvent.class);
            startActivity(i);
        }
    }




}
