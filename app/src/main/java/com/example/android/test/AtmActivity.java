package com.example.android.test;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AtmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Category> words = new ArrayList<Category>();

        words.add(new Category("ICT Building, Computer Department" , "Skye Bank ATM ICT" , R.mipmap.ic_launcher));
        words.add(new Category("In Front of ODLT" , "GTB ATM ODLT" , R.mipmap.ic_launcher));
        words.add(new Category("Opposite Student Union Building" , "Skye Bank ATM SUB" , R.mipmap.ic_launcher));
        words.add(new Category("Opposite Yellow House" , "Ecobank ATM" , R.mipmap.ic_launcher));
        words.add(new Category("First Bank, Banking Area" , "First Bank ATM" , R.mipmap.ic_launcher));
        words.add(new Category("Wema Bank, Banking Area" , "Wema Bank ATM" , R.mipmap.ic_launcher));
        words.add(new Category("Directly in Front of Moremi Hall" , "First Bank ATM Moremi" , R.mipmap.ic_launcher));
        words.add(new Category("Skye Bank, Banking Area" , "Skye Bank ATM" , R.mipmap.ic_launcher));
        words.add(new Category("UBA, Banking Area" , "UBA ATM" , R.mipmap.ic_launcher));
        words.add(new Category("GTB, Banking Area" , "GTB ATM" , R.mipmap.ic_launcher));


        CategoryAdapter adapter = new CategoryAdapter(this , words , R.color.category_numbers);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(AtmActivity.this , DisplayActivity.class);
                TextView textview = (TextView) view.findViewById(R.id.miwok_text_view);
                String string = textview.getText().toString();
                intent.putExtra("message" , string);
                startActivity(intent);
            }
        });
    }
}
