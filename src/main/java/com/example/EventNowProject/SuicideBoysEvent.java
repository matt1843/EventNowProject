package com.example.EventNowProject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SuicideBoysEvent extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suicideboys_event);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.half);
        mapFragment.getMapAsync(this);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng avivaStadium = new LatLng(53.3352,-6.2285);
        mMap.addMarker(new MarkerOptions().position(avivaStadium).title("Aviva stadium"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(avivaStadium));

        //Puts camera at location of event
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(avivaStadium ,14));
    }
}
