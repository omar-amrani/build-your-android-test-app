package com.example.omaramrani.myfirstandroidapp;


import android.app.Application;
import io.intercom.android.sdk.Intercom;

public class MyFirstAndroidapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Intercom.initialize(this, "android_sdk-60c99fb6df24c01cfdee733d879a7f401b211a0e", "brz2bvp4");
    }

}



