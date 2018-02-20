package com.example.android.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.id.message;
import static android.media.CamcorderProfile.get;

public class BusStopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Category> words = new ArrayList<Category>();

        words.add(new Category("Car pack between angola and mozambuique hostel" , "Hall" , R.mipmap.ic_launcher));
        words.add(new Category("In front of the Postgraduate hostel" , "PG" , R.mipmap.ic_launcher));
        words.add(new Category("Cross roads that leads to awolowo hall" , "Awo" , R.mipmap.ic_launcher));
        words.add(new Category("The Zebra crossing a little afar of in front of moremi hall" , "Moremi" , R.mipmap.ic_launcher));
        words.add(new Category("Directly in front of Alumni hall" , "Alumni" , R.mipmap.ic_launcher));
        words.add(new Category("Directly in front of Fajuyi Hall" , "Faj" , R.mipmap.ic_launcher));
        words.add(new Category("In front of the Ecobank directly opposite the student union building" , "SUB" , R.mipmap.ic_launcher));

        CategoryAdapter adapter = new CategoryAdapter(this , words , R.color.category_numbers);
        final ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(BusStopActivity.this , DisplayActivity.class);
                TextView textview = (TextView) view.findViewById(R.id.miwok_text_view);
                String string = textview.getText().toString();
                intent.putExtra("message" , string);
                startActivity(intent);
            }
        });
    }
}
