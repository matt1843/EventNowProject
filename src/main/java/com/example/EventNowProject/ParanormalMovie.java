package com.example.EventNowProject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ParanormalMovie extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paranormalmovie_event);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.half);
        mapFragment.getMapAsync(this);
    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng dunLaoghaire = new LatLng(53.2934189,-6.1398052);
        mMap.addMarker(new MarkerOptions().position(dunLaoghaire).title("IMC Dun Laoghaire Cinema"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dunLaoghaire));

        //Puts camera at location of event
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dunLaoghaire,14));
    }
}
