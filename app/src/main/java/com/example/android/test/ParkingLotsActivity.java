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

public class ParkingLotsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Category> words = new ArrayList<Category>();

        words.add(new Category("Parking lot between angol and mozambuique hostel" , "Anglomoz Parking Lot" , R.mipmap.park1));
        words.add(new Category("Parking Lot in front of health center" , "Health Center Parking Lot" , R.mipmap.park2));
        words.add(new Category("Parking lot in front of moremi hall" , "Moremi Parking Lot" , R.mipmap.park3));
        words.add(new Category("Parking lot i  front of fajuyi hall" , "Fajuyi Parking Lot" , R.mipmap.park4));
        words.add(new Category("Parking lot in front of moremi hall" , "Yellow House Parking Lot" , R.mipmap.park5));
        words.add(new Category("Parking lot in front of White House" , "White House Parking Lot" , R.mipmap.park6));
        words.add(new Category("Parking lot in front of biological sciences" , "Biological Sciences Parking Lot" , R.mipmap.park7));


        CategoryAdapter adapter = new CategoryAdapter(this , words , R.color.category_numbers);
        final ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ParkingLotsActivity.this , DisplayActivity.class);
                TextView textview = (TextView) view.findViewById(R.id.miwok_text_view);
                String string = textview.getText().toString();
                intent.putExtra("message" , string);
                startActivity(intent);
            }
        });
    }
}
