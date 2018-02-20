package com.example.android.test;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import org.json.JSONObject;
import android.app.Activity;
import org.json.JSONException;
import android.widget.Toast;

import com.android.volley.Request;
import com.example.android.test.MySingleton;
import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.android.test.app.AppController;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        final TextView name_of_place_text = (TextView) findViewById(R.id.name_of_place);
        final TextView address_text = (TextView) findViewById(R.id.address);
        final TextView description_text = (TextView) findViewById(R.id.description);
        final TextView description_hostel_text = (TextView) findViewById(R.id.description_hostel);
        final TextView description_sub_text = (TextView) findViewById(R.id.description_sub);
        final TextView description_gate_text = (TextView) findViewById(R.id.description_gate);
        final TextView activities_text = (TextView) findViewById(R.id.activities);
        String jsonResponse;
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        String urlJsonObj = "http://ibarapa.oauife.edu.ng/test/sandbox.php?place=" + message;
        urlJsonObj = urlJsonObj.replace(" " , "%20");
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Method.GET , urlJsonObj , null, new Response.Listener<JSONObject>(){
            @Override
            public void onResponse(JSONObject response){
            try{

                String name_of_place = response.getString("name_of_place");
                String address = response.getString("address");
                String description = response.getString("description");
                String description_hostel = response.getString("description_hostel");
                String description_sub = response.getString("description_sub");
                String description_gate = response.getString("description_gate");
                String activities = response.getString("activities");

                name_of_place_text.setText(name_of_place);
                address_text.setText(address);
                description_text.setText(description);
                description_hostel_text.setText(description_hostel);
                description_sub_text.setText(description_sub);
                description_gate_text.setText(description_gate);
                activities_text.setText(activities);

            }catch (JSONException e){
                e.printStackTrace();
                Toast.makeText(getApplicationContext() , "Place Not Found" , Toast.LENGTH_LONG).show();
            }

            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error){
                error.printStackTrace();
                Toast.makeText(getApplicationContext() , "Please Check Your Internet Connection and Try Again"  , Toast.LENGTH_LONG).show();
            }
        });
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
    }
}
