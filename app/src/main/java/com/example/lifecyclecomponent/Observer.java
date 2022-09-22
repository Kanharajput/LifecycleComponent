package com.example.lifecyclecomponent;


import android.util.Log;

import androidx.annotation.ContentView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

// this is an Observer class which can observe the lifecycle of activity
public class Observer implements LifecycleObserver {
    // this function will run when onCreate method of an Owner runs
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
        Log.d("MAIN","OnCreate Observer Lifecycle");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(){
        Log.d("MAIN","OnStart Observer Lifecycle");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(){
        Log.d("MAIN","OnResume Observer Lifecycle");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(){
        Log.d("MAIN","OnPause Observer Lifecycle");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(){
        Log.d("MAIN","OnStop Observer Lifecycle");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        Log.d("MAIN", "OnDestroy Observer Lifecycle");
    }
}