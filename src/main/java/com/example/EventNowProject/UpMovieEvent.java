package com.example.EventNowProject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class UpMovieEvent extends AppCompatActivity implements OnMapReadyCallback {


    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up_event);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.half);
        mapFragment.getMapAsync(this);
    }

        public void onMapReady(GoogleMap googleMap) {
            mMap = googleMap;
            LatLng savoyCinema = new LatLng(53.3513,-6.2605);
            mMap.addMarker(new MarkerOptions().position(savoyCinema).title("Savoy Cinema"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(savoyCinema));

            //Puts camera at location of event
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(savoyCinema,14));
        }


}
