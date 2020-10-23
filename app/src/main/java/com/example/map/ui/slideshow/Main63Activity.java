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

public class Main63Activity extends FragmentActivity implements OnMapReadyCallback {
GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main63);
        SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;
        LatLng mech=new LatLng(9.882313,78.081359);
        MarkerOptions option20=new MarkerOptions();
        option20.position(mech).title("Mechanical block");
        map.addMarker(option20);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(mech, 15f));
        map.setMapType(map.MAP_TYPE_SATELLITE);


    }
}
