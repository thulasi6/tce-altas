package com.example.map.ui.slideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.map.R;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button b=(Button) findViewById(R.id.button12);
        Button b1=(Button) findViewById(R.id.button19);
        Button b2=(Button)findViewById(R.id.button11);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent i=new Intent(Main6Activity.this,Main62Activity.class);
             startActivity(i);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main6Activity.this,Main31Activity.class);
                startActivity(i);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main6Activity.this,Main30Activity.class);
                startActivity(i);
            }
        });
    }
}
