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

public class BankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Category> words = new ArrayList<Category>();

        words.add(new Category("Banking Area" , "Wema Bank" , R.mipmap.bank1));
        words.add(new Category("Banking Area" , "First Bank" , R.mipmap.bank2));
        words.add(new Category("Banking Area" , "Skye Bank" , R.mipmap.bank3));
        words.add(new Category("Banking Area" , "United Bank of Africa UBA" , R.mipmap.bank4));
        words.add(new Category("Banking Area" , "Guarantee Trust Bank GTB" , R.mipmap.bank5));
        words.add(new Category("Banking Area" , "Zenith Bank" , R.mipmap.bank6));
        words.add(new Category("Banking Area" , "Access Bank" , R.mipmap.bank7));
        words.add(new Category("Banking Area" , "Microfinance Bank" , R.mipmap.bank8));
        words.add(new Category("Near the Student Union Building, Directly Opposite Yellow House" , "EcoBank" , R.mipmap.bank9));
        words.add(new Category("Directly Opposite the Student Union Building (SUB)" , "Skye Bank SUB" , R.mipmap.bank10));


        CategoryAdapter adapter = new CategoryAdapter(this , words , R.color.category_numbers);
        final ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(BankActivity.this , DisplayActivity.class);
                TextView textview = (TextView) view.findViewById(R.id.miwok_text_view);
                String string = textview.getText().toString();
                intent.putExtra("message" , string);
                startActivity(intent);
            }
        });
    }
}
