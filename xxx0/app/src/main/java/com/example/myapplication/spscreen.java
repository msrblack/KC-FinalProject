package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class spscreen extends AppCompatActivity {
    Handler i = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spscreen);

        i.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i1 = new Intent(spscreen.this,signin.class);
                startActivity(i1);
                finish();

            }
        },3000);
    }
}