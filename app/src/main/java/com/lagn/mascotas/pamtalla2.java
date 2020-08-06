package com.lagn.mascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class pamtalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pamtalla2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}