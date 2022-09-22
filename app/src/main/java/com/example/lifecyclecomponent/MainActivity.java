package com.example.lifecyclecomponent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /* Why do we need lifecycle component
    * Sometimes we need to know the activity lifecycle to perform some actions
    * Like play song when activity starts and pause the song when it stops
    * But we don't want to write the code of play-pause song in onCreate
    * because this methods are built for activity
    * So here we use Lifecycle Component to write this piece of code
    * somewhere else and it have the lifecycle of activity to work according to it*/

    /*At a time of creating the activity first the activity method will know about it
    * But when at a time of destroying or closing the activity observer method will call first
    * it's obvious that it should be done so that we can do our work in those methods before
    * closing the app or destroying the activity*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adding the Observer
        getLifecycle().addObserver(new Observer());
        Log.d("MAIN","OnCreate Activity Lifecycle");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MAIN","OnStart Activity Lifecycle");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MAIN","OnResume Activity Lifecycle");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MAIN","OnPause Activity Lifecycle");
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d("MAIN","OnStop Activity Lifecycle");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("MAIN","OnDestroy Activity Lifecycle");
    }
}