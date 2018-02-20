package com.example.android.test;

import android.app.Activity;
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

public class FacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Category> words = new ArrayList<Category>();

        words.add(new Category("The car pack in front of Angola and Mozambuique hall" , "Faculty of Technology" , R.mipmap.ic_launcher));
        words.add(new Category("The junction at the right hand side of ETF" , "Health Sciences Faculty" , R.mipmap.ic_launcher));
        words.add(new Category("Directly in front of PG hall" , "Faculty of Law" , R.mipmap.ic_launcher));
        words.add(new Category("Directly in front of moremi hall" , "Social Sciences Faculty" , R.mipmap.ic_launcher));
        words.add(new Category("The Car pack in front of Fajuyi hall" , "Faculty of Pharmacy" , R.mipmap.ic_launcher));
        words.add(new Category("The main road in front of White House" , "Faculty of Arts" , R.mipmap.ic_launcher));


        CategoryAdapter adapter = new CategoryAdapter(this , words , R.color.category_numbers);
        final ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(FacultyActivity.this , DisplayActivity.class);
                TextView textview = (TextView) view.findViewById(R.id.miwok_text_view);
                String string = textview.getText().toString();
                intent.putExtra("message" , string);
                startActivity(intent);
            }
        });
    }
}
