package com.example.map;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;

import java.security.Permission;

public class GPS_tracker extends Service implements LocationListener {

    private final Context context;
    boolean isGPSEnabled = false;
    boolean isNtworkEnabled = false;
    boolean canGetLocation = false;
    Location location;
    protected LocationManager locationManager;

    public GPS_tracker(Context context){
        this.context=context;
    }
    public Location getLocation(){
        try {
            locationManager=(LocationManager)context.getSystemService(LOCATION_SERVICE);
            isGPSEnabled=locationManager.isProviderEnabled(locationManager.GPS_PROVIDER);
            isNtworkEnabled=locationManager.isProviderEnabled(locationManager.NETWORK_PROVIDER);

            if (ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED
            || ContextCompat.checkSelfPermission(context,Manifest.permission.ACCESS_COARSE_LOCATION)==PackageManager.PERMISSION_GRANTED){
            if (isGPSEnabled) {
                if (location == null) {
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 10000, 10, this);
                    if (locationManager != null) {
                        location=locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                    }
                    }
                }
            if (location==null){
                if (isGPSEnabled) {
                    if (location == null) {
                        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 10000, 10, this);
                        if (locationManager != null) {
                            location=locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        }
                    }
                }
            }
            }
        }catch (Exception e){

        }
        return location;
    }
    public void onLocationChanged(Location location){

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    public void onStatusChangd(String Provider,int status,Bundle extras){

   }
   public void onProviderEnabled(String Provider){

   }
   public void onProviderDisabled(String Provider){

   }
   public IBinder onBind(Intent arg0){
        return null;
   }
}
