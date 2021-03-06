package com.example.EventNowProject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class BadBoysForLifeMovieEvent extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_boys_for_lifemovie_event);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.half);
        mapFragment.getMapAsync(this);
    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng charlestown = new LatLng(53.4049594,-6.3048164);
        mMap.addMarker(new MarkerOptions().position(charlestown).title("Odeon Charlestown"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(charlestown));

        //Puts camera at location of event
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(charlestown,14));
    }
}
