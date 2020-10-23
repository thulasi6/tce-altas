package com.example.map.ui.home;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.map.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class HomeFragment extends Fragment implements OnMapReadyCallback {
   Location location;

    GoogleMap map;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
         SupportMapFragment mapFragment=(SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map);
         mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
       map=googleMap;
       LatLng ECE=new LatLng(9.882890,78.082550);
       LatLng parking=new LatLng(9.882751,78.080835);
       LatLng maincan=new LatLng(9.883208,78.079805);
       LatLng boyshostel=new LatLng(9.884765,78.078839);
       LatLng icici=new LatLng(9.883452,78.078839);
       LatLng library=new LatLng(9.882887,78.081347);
       LatLng open=new LatLng(9.882628,78.082164);
       LatLng Ks=new LatLng(9.882735,78.081967);
       LatLng EEE=new LatLng(9.882425,78.081970);
       LatLng Km=new LatLng(9.82590,78.082531);
       LatLng Civil=new LatLng(9.882281,78.082866);
       LatLng bus=new LatLng(9.882548,78.082973);
       LatLng cse=new LatLng(9.882804,78.083807);
       LatLng it=new LatLng(9.882405,78.083633);
       LatLng mca=new LatLng(9.882339,78.083840);
       LatLng girls=new LatLng(9.878872,78.082208);
       LatLng arch=new LatLng(9.880114,78.082828);
       LatLng navin=new LatLng(9.881217,78.082348);
       LatLng student=new LatLng(9.881278,78.083261);
       LatLng science=new LatLng(9.81837,78.082809);
       LatLng mech=new LatLng(9.882313,78.081359);
       LatLng Tce=new LatLng(9.883285,78.080723);
       MarkerOptions option=new MarkerOptions();
       MarkerOptions option1=new MarkerOptions();
       MarkerOptions option2=new MarkerOptions();
       MarkerOptions option3=new MarkerOptions();
       MarkerOptions option4=new MarkerOptions();
       MarkerOptions option5=new MarkerOptions();
       MarkerOptions option6=new MarkerOptions();
       MarkerOptions option7=new MarkerOptions();
       MarkerOptions option8=new MarkerOptions();
       MarkerOptions option9=new MarkerOptions();
       MarkerOptions option10=new MarkerOptions();
       MarkerOptions option11=new MarkerOptions();
       MarkerOptions option12=new MarkerOptions();
       MarkerOptions option13=new MarkerOptions();
       MarkerOptions option14=new MarkerOptions();
       MarkerOptions option15=new MarkerOptions();
       MarkerOptions option16=new MarkerOptions();
       MarkerOptions option17=new MarkerOptions();
       MarkerOptions option18=new MarkerOptions();
       MarkerOptions option19=new MarkerOptions();
       MarkerOptions option20=new MarkerOptions();
       MarkerOptions option21=new MarkerOptions();
       option.position(ECE).title("ECE");
       option1.position(parking).title("parking lot");
       option2.position(maincan).title("Main Canteen");
       option3.position(boyshostel).title("Boys Hostel");
       option4.position(icici).title("ICICI bank");
       option5.position(library).title("Library");
       option6.position(open).title("Open Auditorium");
       option7.position(Ks).title("Ks Auditorium");
       option8.position(EEE).title("EEE");
       option9.position(Km).title("KM Auditorium");
       option10.position(Civil).title("Civil");
       option11.position(bus).title("Bus shed");
       option12.position(cse).title("CSE");
       option13.position(it).title("IT");
       option14.position(mca).title("MCA");
       option15.position(girls).title("Girls Hostel");
       option16.position(arch).title("Architecture Department");
       option17.position(navin).title("Navin Xerox");
       option18.position(student).title("Student Xerox");
       option19.position(science).title("Science Block");
       option20.position(mech).title("Mechanical block");
       option21.position(Tce).title("TCE");
    map.addMarker(option);
       map.addMarker(option1);
       map.addMarker(option2);
       map.addMarker(option3);
       map.addMarker(option4);
       map.addMarker(option5);
       map.addMarker(option6);
       map.addMarker(option7);
       map.addMarker(option8);
       map.addMarker(option9);
       map.addMarker(option10);
       map.addMarker(option11);
       map.addMarker(option12);
       map.addMarker(option13);
       map.addMarker(option14);
       map.addMarker(option15);
       map.addMarker(option16);
       map.addMarker(option17);
       map.addMarker(option18);
       map.addMarker(option19);
       map.addMarker(option20);
       map.addMarker(option21);
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(ECE,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(parking,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(maincan,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(boyshostel,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(icici,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(library,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(open,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(Ks,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(EEE,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(Km,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(Civil,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(bus,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(cse,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(it,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(mca,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(girls,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(arch,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(navin,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(student,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(science,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(mech,15f));
       map.moveCamera(CameraUpdateFactory.newLatLngZoom(Tce,15f));
       map.setMapType(map.MAP_TYPE_SATELLITE);

    }
}