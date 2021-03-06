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

public class BikeStandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Category> words = new ArrayList<Category>();

        words.add(new Category("The car pack in front of Angola and Mozambuique hall" , "AngloMoz Bike Stands" , R.mipmap.bike1));
        words.add(new Category("The junction at the right hand side of ETF" , "Health Center Bike Stand" , R.mipmap.bike2));
        words.add(new Category("Directly in front of PG hall" , "Post Graduate Hall Bike Stand" , R.mipmap.bike3));
        words.add(new Category("Directly in front of moremi hall" , "Moremi Bike Stand" , R.mipmap.bike4));
        words.add(new Category("The Car pack in front of Fajuyi hall" , "Fajuyi Hall Bike Stand" , R.mipmap.bike5));


        CategoryAdapter adapter = new CategoryAdapter(this , words , R.color.category_numbers);
        final ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(BikeStandActivity.this , DisplayActivity.class);
                TextView textview = (TextView) view.findViewById(R.id.miwok_text_view);
                String string = textview.getText().toString();
                intent.putExtra("message" , string);
                startActivity(intent);
            }
        });
    }
}
