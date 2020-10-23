package com.example.map.ui.send;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchableInfo;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.map.Main44Activity;
import com.example.map.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Main41Activity extends AppCompatActivity {
    SearchView mySearchView;
    ListView myList;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main41);
        mySearchView = (SearchView)findViewById(R.id.searchView);
        myList = (ListView) findViewById(R.id.mylist);


        list=new ArrayList<String>();

        list.add("A01");
        list.add("A02");
        list.add("A03");
        list.add("A04");
        list.add("A05");
        list.add("A06");
        list.add("A07");
        list.add("A08");
        list.add("A09");
        list.add("A10");
        list.add("A11");
        list.add("A12");
        list.add("A13");
        list.add("A14");
        list.add("b1");
        list.add("b2");
        list.add("b3");
        list.add("b4");
        list.add("b5");
        list.add("b6");
        list.add("b7");
        list.add("b8");
        list.add("b9");
        list.add("b10");
        list.add("b11");
        list.add("b12");
        list.add("C1");
        list.add("C2");
        list.add("C3");
        list.add("C4");
        list.add("C5");
        list.add("C6");
        list.add("EE02");
        list.add("EE03");
        list.add("EE06");
        list.add("EE07");
        list.add("EE08");
        list.add("EE09");
        list.add("EE10");
        list.add("EE11");
        list.add("IF1");
        list.add("IF2");
        list.add("IF3");
        list.add("IF4");
        list.add("IG1");
        list.add("IG2");
        list.add("IG3");
        list.add("IG4");
        list.add("IG5");
        list.add("IG6");
        list.add("IG7");
        list.add("IG8");
        list.add("IS1");
        list.add("IS2");
        list.add("IS3");
        list.add("IS4");
        list.add("IS5");
        list.add("M1");
        list.add("M2");
        list.add("M3");
        list.add("M4");
        list.add("M5");
        list.add("M6");
        list.add("M7");
        list.add("M8");
        list.add("M9");
        list.add("M10");
        list.add("M11");
        list.add("M12");
        list.add("M13");
        list.add("M14");
        list.add("M15");
        list.add("M16");
        list.add("M17");
        list.add("M18");
        list.add("M19");
        list.add("MD1");
        list.add("MD2");
        list.add("MD3");






        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        myList.setAdapter(adapter);

        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
             validate(mySearchView.getQuery().toString());

             return true;
            }


            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return true;
            }
        });





       myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String s=String.valueOf(parent.getItemAtPosition(position));
        if(s.equals("b12") || s.equals("b11") || s.equals("b10") || s.equals("b9")){
            Intent i=new Intent(Main41Activity.this,Main42Activity.class);
            startActivity(i);
        }
               if(s.equals("b8") || s.equals("b7") || s.equals("b6") || s.equals("b5")){
                   Intent i=new Intent(Main41Activity.this,Main43Activity.class);
                   startActivity(i);
               }
               if(s.equals("b4") || s.equals("b3") || s.equals("b2") || s.equals("b1")){
                   Intent i=new Intent(Main41Activity.this,Main45Activity.class);
                   startActivity(i);
               }
               if(s.equals("A01") || s.equals("A02") || s.equals("A03") || s.equals("A04") || s.equals("A05") ||s.equals("A06")||s.equals("A07")||s.equals("A08")||s.equals("A09")||s.equals("A10")||s.equals("A11")||s.equals("A12")){
                   Intent i=new Intent(Main41Activity.this,Main46Activity.class);
                   startActivity(i);
               }
               if(s.equals("C4") || s.equals("C3") || s.equals("C2") || s.equals("C1")||s.equals("C5")||s.equals("C6")){
                   Intent i=new Intent(Main41Activity.this,Main47Activity.class);
                   startActivity(i);
               }
               if(s.equals("IS1") || s.equals("IS2") || s.equals("IS3") || s.equals("IS4")||s.equals("IS5")){
                   Intent i=new Intent(Main41Activity.this,Main48Activity.class);
                   startActivity(i);
               }
               if(s.equals("IF1") || s.equals("IF2") || s.equals("IF3") || s.equals("IF4")){
                   Intent i=new Intent(Main41Activity.this,Main49Activity.class);
                   startActivity(i);
               }
              if (s.equals("IG1")||s.equals("IG2")||s.equals("IG3")||s.equals("IG4")||s.equals("IG5")||s.equals("IG6")||s.equals("IG7")||s.equals("IG8"))
              {
                  Intent i=new Intent(Main41Activity.this,Main50Activity.class);
                  startActivity(i);
              }
               if (s.equals("M3")||s.equals("M4")||s.equals("M5")||s.equals("M6")||s.equals("M7")||s.equals("M8")||s.equals("M9"))
               {
                   Intent i=new Intent(Main41Activity.this,Main51Activity.class);
                   startActivity(i);
               }
               if (s.equals("M10")||s.equals("M11")||s.equals("M12")||s.equals("M13")||s.equals("M14")||s.equals("MD1")||s.equals("MD2")||s.equals("MD3"))
               {
                   Intent i=new Intent(Main41Activity.this,Main52Activity.class);
                   startActivity(i);
               }
               if (s.equals("M15")||s.equals("M16")||s.equals("M17")||s.equals("M18")||s.equals("M19"))
               {
                   Intent i=new Intent(Main41Activity.this,Main53Activity.class);
                   startActivity(i);
               }
               if (s.equals("EE02")||s.equals("EE03")||s.equals("EE04")||s.equals("EE05")){
                   Intent i=new Intent(Main41Activity.this,Main54Activity.class);
                   startActivity(i);
               }
               if(s.equals("EE06")||s.equals("EE07")||s.equals("EE08")||s.equals("EE09")||s.equals("EE10")||s.equals("EE11")){
                   Intent i=new Intent(Main41Activity.this,Main55Activity.class);
                   startActivity(i);
               }
           }
       });
    }

    public void validate(String name)
    {
        if (name.equals("b12") || name.equals("b11") || name.equals("b10") || name.equals("b9")||name.equals("B12") || name.equals("B11") || name.equals("B10") || name.equals("B9"))
        {

            Intent i=new Intent(Main41Activity.this,Main42Activity.class);
            startActivity(i);
        }
        if(name.equals("b8") || name.equals("b7") || name.equals("b6") ||name.equals("b5")||name.equals("B8") || name.equals("B7") || name.equals("B6") ||name.equals("B5")){
            Intent i = new Intent(Main41Activity.this,Main43Activity.class);
            startActivity(i);
    }
        if(name.equals("b4") || name.equals("b3") || name.equals("b2") || name.equals("b1")||name.equals("B4") || name.equals("B3") || name.equals("B2") || name.equals("B1")){
            Intent i = new Intent(Main41Activity.this, Main45Activity.class);
            startActivity(i);
        }
        if(name.equals("A01") || name.equals("A02") || name.equals("A03") || name.equals("A04")||name.equals("A05")||name.equals("A06")||name.equals("A07")||name.equals("A08")||name.equals("A09")||name.equals("A10")||name.equals("A11")||name.equals("A12")||name.equals("a01") || name.equals("a02") || name.equals("a03") || name.equals("a04")||name.equals("a05")||name.equals("a06")||name.equals("a07")||name.equals("a08")||name.equals("a09")||name.equals("a10")||name.equals("a11")||name.equals("a12"))

        {
            Intent i =new Intent(Main41Activity.this,Main46Activity.class);
            startActivity(i);
        }
        if(name.equals("C1")||name.equals("C2")||name.equals("C3")||name.equals("C4")||name.equals("C5")||name.equals("C6")||name.equals("c1")||name.equals("c2")||name.equals("c3")||name.equals("c4")||name.equals("c5")||name.equals("c6")){
            Intent i=new Intent(Main41Activity.this,Main47Activity.class);
            startActivity(i);
        }
        if (name.equals("IS1")||name.equals("IS2")||name.equals("IS3")||name.equals("IS4")||name.equals("IS5")||name.equals("is1")||name.equals("is2")||name.equals("is3")||name.equals("is4")||name.equals("is5")){
            Intent i=new Intent(Main41Activity.this,Main48Activity.class);
            startActivity(i);
        }
        if(name.equals("IF1")||name.equals("IF2")||name.equals("IF3")||name.equals("IF4")){
            Intent i=new Intent(Main41Activity.this,Main49Activity.class);
            startActivity(i);
        }
        if(name.equals("IG1")||name.equals("IG2")||name.equals("IG3")||name.equals("IG4")||name.equals("IG5")||name.equals("IG6")||name.equals("IG7")||name.equals("IG8")||name.equals("IG1")||name.equals("IG2")||name.equals("IG3")||name.equals("IG4")||name.equals("IG5")||name.equals("IG6")||name.equals("IG7")||name.equals("IG8")){
            Intent i =new Intent(Main41Activity.this,Main50Activity.class);
            startActivity(i);
        }
        if(name.equals("M3")||name.equals("M4")||name.equals("M5")||name.equals("M6")||name.equals("M7")||name.equals("M8")||name.equals("M9")||name.equals("m3")||name.equals("m4")||name.equals("m5")||name.equals("m6")||name.equals("m7")||name.equals("m8")||name.equals("m9")){
            Intent i=new Intent(Main41Activity.this,Main51Activity.class);
            startActivity(i);
        }
            if(name.equals("M10")||name.equals("M11")||name.equals("M12")||name.equals("M13")||name.equals("M14")||name.equals("m10")||name.equals("m11")||name.equals("m12")||name.equals("m13")||name.equals("m14")||name.equals("MD1")||name.equals("MD2")||name.equals("MD3")|name.equals("md1")||name.equals("md2")||name.equals("md3")){
                Intent i=new Intent(Main41Activity.this,Main52Activity.class);
                startActivity(i);
            }
            if (name.equals("M15")||name.equals("M16")||name.equals("M17")||name.equals("M18")||name.equals("M19")||name.equals("m15")||name.equals("m16")||name.equals("m17")||name.equals("m18")||name.equals("m19")){
                Intent i=new Intent(Main41Activity.this,Main53Activity.class);
                startActivity(i);
            }
            if (name.equals("EE02")||name.equals("EE03")||name.equals("ee02")||name.equals("ee03")||name.equals("EE04")||name.equals("EE05")||name.equals("ee04")||name.equals("ee05")){
                Intent i=new Intent(Main41Activity.this,Main54Activity.class);
                startActivity(i);
            }
            if (name.equals("EE06")||name.equals("EE07")||name.equals("EE08")||name.equals("EE09")||name.equals("EE10")||name.equals("EE11")||name.equals("ee06")||name.equals("ee07")||name.equals("ee08")||name.equals("ee09")||name.equals("ee10")||name.equals("ee11")){
                Intent i=new Intent(Main41Activity.this,Main55Activity.class);
                startActivity(i);
            }
}    }

