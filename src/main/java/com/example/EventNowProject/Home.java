package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {


    Button Post;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Post = findViewById(R.id.post_btn);
    }

    public void onButtonClick (View v) {

        if (v.getId() == R.id.event_btn) {
            Intent i = new Intent(Home.this, Events.class);
            startActivity(i);
        }

        if (v.getId() == R.id.post_btn) {
            Intent i = new Intent(Home.this, Post.class);
            startActivity(i);
        }
        if (v.getId() == R.id.map_btn) {
            Intent i = new Intent(Home.this, MapsActivity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.chatbot_btn) {
            Intent i = new Intent(Home.this, ChatBot.class);
            startActivity(i);
        }
    }

}
