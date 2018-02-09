package com.example.android.test;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView atm = (TextView) findViewById(R.id.atm);

        // Set a click listener on that View
        atm.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent atmIntent = new Intent(MainActivity.this, AtmActivity.class);

                // Start the new activity
                startActivity(atmIntent);
            }
        });

        TextView bank = (TextView) findViewById(R.id.bank);

        // Set a click listener on that View
        bank.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent bankIntent = new Intent(MainActivity.this, BankActivity.class);

                // Start the new activity
                startActivity(bankIntent);
            }
        });

        TextView bikestand = (TextView) findViewById(R.id.bikestands);

        // Set a click listener on that View
        bikestand.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent bikestandIntent = new Intent(MainActivity.this, BikeStandActivity.class);

                // Start the new activity
                startActivity(bikestandIntent);
            }
        });

        TextView bodyBuilding = (TextView) findViewById(R.id.bodybuilding);

        // Set a click listener on that View
        bodyBuilding.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent bodyBuildingIntent = new Intent(MainActivity.this, BodyBuildingActivity.class);

                // Start the new activity
                startActivity(bodyBuildingIntent);
            }
        });

        TextView bodyBuilding = (TextView) findViewById(R.id.bodybuilding);

        // Set a click listener on that View
        bodyBuilding.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent bodyBuildingIntent = new Intent(MainActivity.this, BodyBuildingActivity.class);

                // Start the new activity
                startActivity(bodyBuildingIntent);
            }
        });
    }
}
