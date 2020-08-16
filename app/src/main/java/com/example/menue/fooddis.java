package com.example.menue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class fooddis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddis);
    }

    public void add (View v){
        //display alert(popup) on screen
         Toast.makeText(this,"added to cart",Toast.LENGTH_LONG).show();
    }
}