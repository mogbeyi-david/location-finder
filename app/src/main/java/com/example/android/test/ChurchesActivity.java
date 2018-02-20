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

public class ChurchesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Category> words = new ArrayList<Category>();

        words.add(new Category("Religious Ground" , "Charis Fellowship International" , R.mipmap.ic_launcher));
        words.add(new Category("Religious Ground" , "Our Lady of Perpetual Light" , R.mipmap.ic_launcher));
        words.add(new Category("Religious Ground" , "Kings Word RCCG" , R.mipmap.ic_launcher));
        words.add(new Category("Religious Ground" , "Deeper Life Campus Fellowship" , R.mipmap.ic_launcher));
        words.add(new Category("Religious Ground" , "Latter Glory of God Students Fellowship" , R.mipmap.ic_launcher));

        CategoryAdapter adapter = new CategoryAdapter(this , words , R.color.category_numbers);
        final ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ChurchesActivity.this , DisplayActivity.class);
                TextView textview = (TextView) view.findViewById(R.id.miwok_text_view);
                String string = textview.getText().toString();
                intent.putExtra("message" , string);
                startActivity(intent);
            }
        });
    }
}
