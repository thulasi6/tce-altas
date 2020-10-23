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

public class Main59Activity extends FragmentActivity implements OnMapReadyCallback {
GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main59);
        SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;
        LatLng it=new LatLng(9.882405,78.083633);
        MarkerOptions option13=new MarkerOptions();
        option13.position(it).title("IT");
        map.addMarker(option13);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(it,15f));
        map.setMapType(map.MAP_TYPE_SATELLITE);

    }
}
