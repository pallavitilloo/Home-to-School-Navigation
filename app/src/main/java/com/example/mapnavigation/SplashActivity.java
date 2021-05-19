package com.example.mapnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/***************************************************************************************************
 * SplashActivity class shows the message for details of what the App does
 * @author Pallavi Tilloo
 * @date 05/18/2021
 **************************************************************************************************/
public class SplashActivity extends AppCompatActivity {

    final int TIME_LIMIT = 8000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        // postDelayed(Runnable, time) method is used to start the second activity with a delay
        Handler handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },TIME_LIMIT);
    }
}