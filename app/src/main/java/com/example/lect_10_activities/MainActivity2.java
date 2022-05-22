package com.example.lect_10_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("A2", " onCreate Activity 2");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("A2", "onStart Activity A2");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("A2", "onResume Activity A2");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("A2", "onPause Activity A2");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("A2", "onStop Activity A2");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("A2", "onDestroy Activity A2");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("A2", "onRestart Activity A2");
    }



}