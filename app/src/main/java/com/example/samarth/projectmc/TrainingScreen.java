package com.example.samarth.projectmc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TrainingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_screen);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
