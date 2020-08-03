package com.example.EventNowProject;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker movie1;
    private Marker movie2;
    private Marker movie3;
    private Marker movie4;
    private Marker movie5;
    private Marker movie6;
    private Marker movie7;
    private Marker movie8;
    private Marker movie9;


    private Marker concert1;
    private Marker concert2;
    private Marker concert3;
    private Marker concert4;
    private Marker concert5;
    private Marker concert6;
    private Marker concert7;
    private Marker concert8;
    private Marker concert9;

    private Marker food1;
    private Marker food2;
    private Marker food3;


    private Button showAll;
    private Button showMovies;
    private Button showConcerts;
    private Button showFood;
    private Button infobutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        showAll = (Button) findViewById(R.id.showAll_btn);
        showMovies = (Button) findViewById(R.id.showMovies_btn);
        showConcerts = (Button) findViewById(R.id.showConcerts_btn);
        showFood = (Button) findViewById(R.id.showFood_btn);

        showAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAll();

            }

        });

        infobutton = (Button) findViewById(R.id.infobutton);


        showMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMovies();
            }
        });

        showConcerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showConcerts();
            }
        });

        showFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFood();
            }
        });

        infobutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                openDialog();


            }
        });
    }

    public void openDialog() {
        InformationDialog informationDialog = new InformationDialog();
        informationDialog.show(getSupportFragmentManager(), "informationDialog");

    }



    public void showAll(){
        movie1.setVisible(true);
        movie2.setVisible(true);
        movie3.setVisible(true);
        movie4.setVisible(true);
        movie5.setVisible(true);
        movie6.setVisible(true);
        movie7.setVisible(true);
        movie8.setVisible(true);
        movie9.setVisible(true);
        concert1.setVisible(true);
        concert2.setVisible(true);
        concert3.setVisible(true);
        concert4.setVisible(true);
        concert5.setVisible(true);
        concert6.setVisible(true);
        concert7.setVisible(true);
        concert8.setVisible(true);
        concert9.setVisible(true);
        food1.setVisible(true);
        food2.setVisible(true);
        food3.setVisible(true);


    }

    public void showMovies(){
        movie1.setVisible(true);
        movie2.setVisible(true);
        movie3.setVisible(true);
        movie4.setVisible(true);
        movie5.setVisible(true);
        movie6.setVisible(true);
        movie7.setVisible(true);
        movie8.setVisible(true);
        movie9.setVisible(true);
        concert1.setVisible(false);
        concert2.setVisible(false);
        concert3.setVisible(false);
        concert4.setVisible(false);
        concert5.setVisible(false);
        concert6.setVisible(false);
        concert7.setVisible(false);
        concert8.setVisible(false);
        concert9.setVisible(false);
        food1.setVisible(false);
        food2.setVisible(false);
        food3.setVisible(false);


    }

    public void showConcerts() {

        concert1.setVisible(true);
        concert2.setVisible(true);
        concert3.setVisible(true);
        concert4.setVisible(true);
        concert5.setVisible(true);
        concert6.setVisible(true);
        concert7.setVisible(true);
        concert8.setVisible(true);
        concert9.setVisible(true);
        movie1.setVisible(false);
        movie2.setVisible(false);
        movie3.setVisible(false);
        movie4.setVisible(false);
        movie5.setVisible(false);
        movie6.setVisible(false);
        movie7.setVisible(false);
        movie8.setVisible(false);
        movie9.setVisible(false);
        food1.setVisible(false);
        food2.setVisible(false);
        food3.setVisible(false);
    }

    public void showFood() {

        food1.setVisible(true);
        food2.setVisible(true);
        food3.setVisible(true);
        concert1.setVisible(false);
        concert2.setVisible(false);
        concert3.setVisible(false);
        concert4.setVisible(false);
        concert5.setVisible(false);
        concert6.setVisible(false);
        concert7.setVisible(false);
        concert8.setVisible(false);
        concert9.setVisible(false);
        movie1.setVisible(false);
        movie2.setVisible(false);
        movie3.setVisible(false);
        movie4.setVisible(false);
        movie5.setVisible(false);
        movie6.setVisible(false);
        movie7.setVisible(false);
        movie8.setVisible(false);
        movie9.setVisible(false);
    }



        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera. In this case,
         * we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to install
         * it inside the SupportMapFragment. This method will only be triggered once the user has
         * installed Google Play services and returned to the app.
         */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLngBounds boundsIreland = new LatLngBounds(new LatLng(50.999929, -10.854492), new LatLng(55.354135, -5.339355));
        int padding = 0; // offset from edges of the map in pixels
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngBounds(boundsIreland, padding);
        mMap.animateCamera(cameraUpdate);


        //Movies

        movie1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.2870, -6.3727)).title("IMC Tallaght").snippet("MYSPY").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        movie2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3919, -6.3910)).title("Odeon Blanchardstown").snippet("DOOLITTLE").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        movie3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.4049594, -6.3048164)).title("Odeon Charlestown").snippet("BAD BOYS FOR LIFE").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        movie4 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3485, -6.2277)).title("Point Square Cinema").snippet("PRINCESS AND THE FROG").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        movie5 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3935522, -6.3951932)).title("Savoy Cinema City Centre").snippet("UP").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        movie6 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3933, -6.2504)).title("IMC Santry Cinema").snippet("COCO").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        movie7 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3913, -6.1926)).title("Odeon Cinema Coolock").snippet("CABIN IN THE WOODS").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        movie8 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3522, -6.3936)).title("Vue Cinema").snippet("IT").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        movie9 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.2934189, -6.1398052)).title("IMC Dun Laoghaire Cinema").snippet("PARANORMAL ACTIVITY").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        //Concerts
        concert1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3475, -6.2285)).title("The Three Arena").snippet("THE WEEKEND").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        concert2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3718, -6.1793)).title("St Annes Park").snippet("BILLIE EILISH").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        concert3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.2733, -6.2689)).title("Marley Park").snippet("HASLEY").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        concert4 = mMap.addMarker(new MarkerOptions().position(new LatLng(54.6036, -5.9142)).title("SSE Arena Belfast").snippet("THY ART IS MURDER").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        concert5 = mMap.addMarker(new MarkerOptions().position(new LatLng(55.0011, -7.3055)).title("Foyle Arena Derry").snippet("THE AMITY AFFLICTION").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        concert6 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3607, -6.2512)).title("Croke Park").snippet("OF MICE AND MEN").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        concert7 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3352, -6.2285)).title("Aviva Stadium").snippet("SUICIDEBOYS").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        concert8 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3257, -6.2297)).title("RDS Arena").snippet("RODDY RICH").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        concert9 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3426, -6.2780)).title("Vicar Street").snippet("DABABY").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));


        //Food
        food1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3496, -6.2435)).title("Custom House Square").snippet("Mexican Food").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        food2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3530, -6.2610)).title("Parnell Street").snippet("Vietnamese Food").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        food3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.3462, -6.2589)).title("Westmoreland Street").snippet("Chinese Food").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));


        movie1.setVisible(false);
        movie2.setVisible(false);
        movie3.setVisible(false);
        movie4.setVisible(false);
        movie5.setVisible(false);
        movie6.setVisible(false);
        movie7.setVisible(false);
        movie8.setVisible(false);
        movie9.setVisible(false);
        concert1.setVisible(false);
        concert2.setVisible(false);
        concert3.setVisible(false);
        concert4.setVisible(false);
        concert5.setVisible(false);
        concert6.setVisible(false);
        concert7.setVisible(false);
        concert8.setVisible(false);
        concert9.setVisible(false);
        food1.setVisible(false);
        food2.setVisible(false);
        food3.setVisible(false);

    }

}
