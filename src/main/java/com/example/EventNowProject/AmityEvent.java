package com.example.EventNowProject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class AmityEvent extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amity_event);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.half);
        mapFragment.getMapAsync(this);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng foyleArena = new LatLng(55.0011,-7.3055);
        mMap.addMarker(new MarkerOptions().position(foyleArena).title("Foyle Arena Derry"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(foyleArena));

        //Puts camera at location of event
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(foyleArena ,14));
    }
}


