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

        TextView bus_stops = (TextView) findViewById(R.id.bus_stops);

        // Set a click listener on that View
        bus_stops.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent busStopsIntent = new Intent(MainActivity.this, BusStopActivity.class);

                // Start the new activity
                startActivity(busStopsIntent);
            }
        });

        TextView coffee_shops = (TextView) findViewById(R.id.coffee_shops);

        // Set a click listener on that View
        coffee_shops.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent coffeeShopsIntent = new Intent(MainActivity.this, CoffeeShopsActivity.class);

                // Start the new activity
                startActivity(coffeeShopsIntent);
            }
        });

        TextView fire_fighters = (TextView) findViewById(R.id.fire_fighters);

        // Set a click listener on that View
        fire_fighters.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent fireFightersIntent = new Intent(MainActivity.this, FireFightersActivity.class);

                // Start the new activity
                startActivity(fireFightersIntent);
            }
        });

        TextView food_delivery = (TextView) findViewById(R.id.food_delivery);

        // Set a click listener on that View
        food_delivery.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent foodDeliveryIntent = new Intent(MainActivity.this, FoodDeliveryActivity.class);

                // Start the new activity
                startActivity(foodDeliveryIntent);
            }
        });

        TextView gas_stations = (TextView) findViewById(R.id.gas_stations);

        // Set a click listener on that View
        gas_stations.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent gasStationsIntent = new Intent(MainActivity.this, GasStationsActivity.class);

                // Start the new activity
                startActivity(gasStationsIntent);
            }
        });

        TextView health_center = (TextView) findViewById(R.id.health_center);

        // Set a click listener on that View
        health_center.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent healthCenterIntent = new Intent(MainActivity.this, HealthCenterActivity.class);

                // Start the new activity
                startActivity(healthCenterIntent);
            }
        });

        TextView hair_Care = (TextView) findViewById(R.id.hair_Care);

        // Set a click listener on that View
        hair_Care.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hairCareIntent = new Intent(MainActivity.this, HairCareActivity.class);

                // Start the new activity
                startActivity(hairCareIntent);
            }
        });

        TextView hostels = (TextView) findViewById(R.id.hostels);

        // Set a click listener on that View
        hostels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hostelsIntent = new Intent(MainActivity.this, HostelsActivity.class);

                // Start the new activity
                startActivity(hostelsIntent);
            }
        });

        TextView parking_lots = (TextView) findViewById(R.id.parking_lots);

        // Set a click listener on that View
        parking_lots.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent parkingLotsIntent = new Intent(MainActivity.this, ParkingLotsActivity.class);

                // Start the new activity
                startActivity(parkingLotsIntent);
            }
        });

        TextView public_toilets = (TextView) findViewById(R.id.public_toilet);

        // Set a click listener on that View
        public_toilets.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent publicToiletsIntent = new Intent(MainActivity.this, PublicToiletActivity.class);

                // Start the new activity
                startActivity(publicToiletsIntent);
            }
        });

        TextView roads = (TextView) findViewById(R.id.roads);

        // Set a click listener on that View
        roads.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent roadsIntent = new Intent(MainActivity.this, RoadsActivity.class);

                // Start the new activity
                startActivity(roadsIntent);
            }
        });

        TextView sports = (TextView) findViewById(R.id.sports);

        // Set a click listener on that View
        sports.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent sportsIntent = new Intent(MainActivity.this, SportsActivity.class);

                // Start the new activity
                startActivity(sportsIntent);
            }
        });

        TextView zoo = (TextView) findViewById(R.id.zoo);

        // Set a click listener on that View
        zoo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent zooIntent = new Intent(MainActivity.this, ZooActivity.class);

                // Start the new activity
                startActivity(zooIntent);
            }
        });

        TextView post_office = (TextView) findViewById(R.id.post_office);

        // Set a click listener on that View
        post_office.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent zooIntent = new Intent(MainActivity.this, ZooActivity.class);

                // Start the new activity
                startActivity(zooIntent);
            }
        });

        TextView stores = (TextView) findViewById(R.id.stores);

        // Set a click listener on that View
        stores.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent storesIntent = new Intent(MainActivity.this, StoresActivity.class);

                // Start the new activity
                startActivity(storesIntent);
            }
        });

        TextView pharmacy = (TextView) findViewById(R.id.pharmacy);

        // Set a click listener on that View
        pharmacy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent pharmacyIntent = new Intent(MainActivity.this, PharmacyActivity.class);

                // Start the new activity
                startActivity(pharmacyIntent);
            }
        });

        TextView faculty = (TextView) findViewById(R.id.faculty);

        // Set a click listener on that View
        faculty.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent facultyIntent = new Intent(MainActivity.this, FacultyActivity.class);

                // Start the new activity
                startActivity(facultyIntent);
            }
        });

        TextView departments = (TextView) findViewById(R.id.departments);

        // Set a click listener on that View
        departments.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent departmentIntent = new Intent(MainActivity.this, DepartmentActivity.class);

                // Start the new activity
                startActivity(departmentIntent);
            }
        });

        TextView church = (TextView) findViewById(R.id.churches);

        // Set a click listener on that View
        church.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent churchIntent = new Intent(MainActivity.this, ChurchesActivity.class);

                // Start the new activity
                startActivity(churchIntent);
            }
        });


    }
}
