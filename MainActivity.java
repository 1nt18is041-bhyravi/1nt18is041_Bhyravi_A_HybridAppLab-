package com.example.myfirstapplication;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","OnCreate invoked");
    }
    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity","OnStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MainActivity","OnResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MainActivity","OnPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();

        Log.d("MainActivity","OnStop invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("MainActivity","OnDestroy invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("MainActivity","OnRestart invoked");
    }
}