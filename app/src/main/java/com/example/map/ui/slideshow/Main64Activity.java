package com.example.map.ui.slideshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.map.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Main64Activity extends FragmentActivity implements OnMapReadyCallback {
GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main64);
        SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;
        LatLng science=new LatLng(9.881837,78.082809);
        MarkerOptions option19=new MarkerOptions();
        option19.position(science).title("Mechatronics Department");
        map.addMarker(option19);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(science,15f));
        map.setMapType(map.MAP_TYPE_SATELLITE);


    }
}
