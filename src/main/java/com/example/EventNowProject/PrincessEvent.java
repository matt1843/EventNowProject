package com.example.EventNowProject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class PrincessEvent extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princess_event);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.half);
        mapFragment.getMapAsync(this);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng pointSquare = new LatLng(53.3485,-6.2277);
        mMap.addMarker(new MarkerOptions().position(pointSquare).title("Point Square"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pointSquare));

        //Puts camera at location of event
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(pointSquare,14));
    }
}
