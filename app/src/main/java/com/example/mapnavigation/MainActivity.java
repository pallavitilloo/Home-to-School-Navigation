package com.example.mapnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

/**************************************************************************************************
 * The Main activity shows a button to navigate
 *  @author Pallavi Tilloo
 * @date 05/18/2021
 *************************************************************************************************/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**********************************************************************************************
     * This function is called when user clicks on the button 'Drive to MSU'
     * @param view The view that called this method
     */
    public void Navigate(View view){

        // Create a URI object with navigation to the coordinates to MSU
        Uri gmmIntentUri = Uri.parse("google.navigation:q=40.8644624104021, -74.19858111477711");

        // A new intent with action view and the URI which will start Google Maps
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

        // The package Google Maps
        mapIntent.setPackage("com.google.android.apps.maps");

        // Start the activity to navigate
        startActivity(mapIntent);
    }
}