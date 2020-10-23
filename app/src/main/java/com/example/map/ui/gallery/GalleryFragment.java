package com.example.map.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.map.R;
import com.example.map.ui.slideshow.Main9Activity;
import com.example.map.ui.tools.Main40Activity;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView textView=root.findViewById(R.id.text_tools);


        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                Button b=(Button) root.findViewById(R.id.button13);
                Button b1=(Button) root.findViewById(R.id.button14);
                Button b2=(Button) root.findViewById(R.id.button15);
                Button b3=(Button) root.findViewById(R.id.button16);
                Button b4=(Button) root.findViewById(R.id.button17);
                Button b5=(Button) root.findViewById(R.id.button18);
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main16Activity.class);
                        startActivity(i);
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main15Activity.class);
                        startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main14Activity.class);
                        startActivity(i);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main13Activity.class);
                        startActivity(i);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main12Activity.class);
                        startActivity(i);
                    }
                });
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(), Main40Activity.class);
                        startActivity(i);
                    }
                });
            }
        });
        return root;
    }
}