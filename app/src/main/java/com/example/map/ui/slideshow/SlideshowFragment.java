package com.example.map.ui.slideshow;

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

public class SlideshowFragment extends Fragment implements View.OnClickListener {

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        slideshowViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                Button b=(Button) root.findViewById(R.id.button5);
                Button b1=(Button) root.findViewById(R.id.button6);
                Button b2=(Button) root.findViewById(R.id.button7);
                Button b3=(Button) root.findViewById(R.id.button8);
                Button b4=(Button) root.findViewById(R.id.button9);
                Button b5=(Button) root.findViewById(R.id.button10);
                Button b6=(Button) root.findViewById(R.id.button11);
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main8Activity.class);
                        startActivity(i);
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main57Activity.class);
                        startActivity(i);
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main6Activity.class);
                    startActivity(i);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main5Activity.class);
                    startActivity(i);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main4Activity.class);
                    startActivity(i);
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main3Activity.class);
                        startActivity(i);
                    }
                });


                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getActivity(),Main2Activity.class);
                        startActivity(i);
                    }
                });
            }
        });
        return root;
    }

    @Override
    public void onClick(View v) {

    }
}