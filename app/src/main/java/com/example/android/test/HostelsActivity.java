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

public class HostelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Category> words = new ArrayList<Category>();

        words.add(new Category("Angola Hall" , "Angola Hall" , R.mipmap.ic_launcher));
        words.add(new Category("Postgraduate hall" , "Postgraduate Hall" , R.mipmap.ic_launcher));
        words.add(new Category("Awolowo hall" , "Awolowo Hall" , R.mipmap.ic_launcher));
        words.add(new Category("ETF hall" , "ETF Hall" , R.mipmap.ic_launcher));
        words.add(new Category("Alumni hall" , "Alumni Hall" , R.mipmap.ic_launcher));
        words.add(new Category("Akintola Hall" , "Akintola Hall" , R.mipmap.ic_launcher));
        words.add(new Category("Moremi Hall" , "Moremi Hall" , R.mipmap.ic_launcher));
        words.add(new Category("Fajuyi Hall" , "Fajuyi Hall" , R.mipmap.ic_launcher));

        CategoryAdapter adapter = new CategoryAdapter(this , words , R.color.category_numbers);
        final ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(HostelsActivity.this , DisplayActivity.class);
                TextView textview = (TextView) view.findViewById(R.id.miwok_text_view);
                String string = textview.getText().toString();
                intent.putExtra("message" , string);
                startActivity(intent);
            }
        });
    }
}
