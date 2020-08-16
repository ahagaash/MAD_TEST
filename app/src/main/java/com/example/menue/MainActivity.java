package com.example.menue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchfooddis (View v){
        //launch new activity
        //this means current activity

        Intent i =new Intent(this,fooddis.class);
        startActivity(i);

    }

    public void launchcart (View v){
        //launch new activity
        //this means current activity

        Intent i =new Intent(this,cart.class);
        startActivity(i);

    }


}