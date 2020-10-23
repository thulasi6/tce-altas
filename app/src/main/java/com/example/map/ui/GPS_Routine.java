package com.example.map.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentSender;
import android.os.Bundle;

import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public class GPS_Routine  {
AppCompatActivity ctx;
final int RC_SETTINGS = 101;
boolean canGETLocation = false;
LocationRequest mLocationRequest;
    private OnSuccessListener<? super LocationSettingsResponse> onSuccessListenerLocationSetting;
    private OnFailureListener onFailureListenerLocationSetting;

    public GPS_Routine(AppCompatActivity context){
    ctx=context;
    lastLocationRequest();
}
public LocationRequest getmLocationRequest(){
    return this.mLocationRequest;
}
protected void lastLocationRequest(){
    this.mLocationRequest=new LocationRequest();
    mLocationRequest.setInterval(5000);
    mLocationRequest.setFastestInterval(2500);
    mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    LocationSettingsRequest.Builder builder=new LocationSettingsRequest.Builder()
            .addLocationRequest(mLocationRequest);
    SettingsClient client= LocationServices.getSettingsClient(ctx);
    Task<LocationSettingsResponse> task=client.checkLocationSettings(builder.build());
    task.addOnSuccessListener(onSuccessListenerLocationSetting);
    task.addOnFailureListener(onFailureListenerLocationSetting);
    OnSuccessListener<LocationSettingsResponse> onSuccessListenerLocationSetting=new OnSuccessListener<LocationSettingsResponse>() {
        @Override
        public void onSuccess(LocationSettingsResponse locationSettingsResponse) {
            canGETLocation=true;
        }
    };
    OnFailureListener onFailureListenerLocationSetting =new OnFailureListener() {
        @Override
        public void onFailure(@NonNull Exception e) {
            if (e instanceof ResolvableApiException) {
                try {
                    ((ResolvableApiException) e).startResolutionForResult(ctx, RC_SETTINGS);
                } catch (IntentSender.SendIntentException sendEx) {
                }
            }
        }


    };

    }}

