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

public class DepartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Category> words = new ArrayList<Category>();

        words.add(new Category("Architecture Studio, Around Acedemics Area" , "Architecture Department" , R.mipmap.ic_launcher));
        words.add(new Category("White House" , "Physics Department" , R.mipmap.ic_launcher));
        words.add(new Category("White House" , "Chemistry Department" , R.mipmap.ic_launcher));
        words.add(new Category("Yellow House" , "Mathematics Department" , R.mipmap.ic_launcher));
        words.add(new Category("Opposite School Museum" , "Computer Science and Engineering Department" , R.mipmap.ic_launcher));
        words.add(new Category("Spider building" , "Mechanical Engineering Department" , R.mipmap.ic_launcher));
        words.add(new Category("Social Sciences" , "Accounting Department" , R.mipmap.ic_launcher));
        words.add(new Category("Biological Sciences" , "Botany Department" , R.mipmap.ic_launcher));


        CategoryAdapter adapter = new CategoryAdapter(this , words , R.color.category_numbers);
        final ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DepartmentActivity.this , DisplayActivity.class);
                TextView textview = (TextView) view.findViewById(R.id.miwok_text_view);
                String string = textview.getText().toString();
                intent.putExtra("message" , string);
                startActivity(intent);
            }
        });
    }
}
