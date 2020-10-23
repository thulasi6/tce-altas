package com.example.map.ui.tools;

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

public class ToolsFragment extends Fragment implements OnMapReadyCallback  {
    GoogleMap map;

    private ToolsViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel =
                ViewModelProviders.of(this).get(ToolsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tools, container, false);
        final TextView textView = root.findViewById(R.id.text_tools);
        toolsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment=(SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;


        LatLng parking=new LatLng(9.882751,78.080835);
        LatLng maincan=new LatLng(9.883208,78.079805);
        LatLng boyshostel=new LatLng(9.884765,78.078839);
        LatLng icici=new LatLng(9.883452,78.078839);
        LatLng library=new LatLng(9.882887,78.081347);
        LatLng open=new LatLng(9.882628,78.082164);
        LatLng Ks=new LatLng(9.882735,78.081967);

        LatLng Km=new LatLng(9.82590,78.082531);

        LatLng bus=new LatLng(9.882548,78.082973);



        LatLng girls=new LatLng(9.878872,78.082208);

        LatLng navin=new LatLng(9.881217,78.082348);
        LatLng student=new LatLng(9.881278,78.083261);

        LatLng Tce=new LatLng(9.883285,78.080723);
        MarkerOptions option1=new MarkerOptions();
        MarkerOptions option2=new MarkerOptions();
        MarkerOptions option3=new MarkerOptions();
        MarkerOptions option4=new MarkerOptions();
        MarkerOptions option5=new MarkerOptions();
        MarkerOptions option6=new MarkerOptions();
        MarkerOptions option7=new MarkerOptions();

        MarkerOptions option9=new MarkerOptions();

        MarkerOptions option11=new MarkerOptions();

        MarkerOptions option15=new MarkerOptions();

        MarkerOptions option17=new MarkerOptions();
        MarkerOptions option18=new MarkerOptions();
        MarkerOptions option21=new MarkerOptions();

        option1.position(parking).title("parking lot");
        option2.position(maincan).title("Main Canteen");
        option3.position(boyshostel).title("Boys Hostel");
        option4.position(icici).title("ICICI bank");
        option5.position(library).title("Library");
        option6.position(open).title("Open Auditorium");
        option7.position(Ks).title("Ks Auditorium");
        option9.position(Km).title("KM Auditorium");

        option11.position(bus).title("Bus shed");

        option15.position(girls).title("Girls Hostel");

        option17.position(navin).title("Navin Xerox");
        option18.position(student).title("Student Xerox");
        option21.position(Tce).title("TCE");
        map.addMarker(option1);
        map.addMarker(option2);
        map.addMarker(option3);
        map.addMarker(option4);
        map.addMarker(option5);
        map.addMarker(option6);
        map.addMarker(option7);

        map.addMarker(option9);
        map.addMarker(option11);

        map.addMarker(option15);
        map.addMarker(option17);
        map.addMarker(option18);
        map.addMarker(option21);

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(parking,15f));
        map.moveCamera(CameraUpdateFactory.newLatLng(maincan));
        map.moveCamera(CameraUpdateFactory.newLatLng(boyshostel));
        map.moveCamera(CameraUpdateFactory.newLatLng(icici));
        map.moveCamera(CameraUpdateFactory.newLatLng(library));
        map.moveCamera(CameraUpdateFactory.newLatLng(open));
        map.moveCamera(CameraUpdateFactory.newLatLng(Ks));

        map.moveCamera(CameraUpdateFactory.newLatLng(Km));
        map.moveCamera(CameraUpdateFactory.newLatLng(bus));
        map.moveCamera(CameraUpdateFactory.newLatLng(girls));

        map.moveCamera(CameraUpdateFactory.newLatLng(navin));
        map.moveCamera(CameraUpdateFactory.newLatLng(student));

        map.moveCamera(CameraUpdateFactory.newLatLng(Tce));
        map.setMapType(map.MAP_TYPE_SATELLITE);




    }
}