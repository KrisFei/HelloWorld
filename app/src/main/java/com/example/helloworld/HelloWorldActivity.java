package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.FileOutputStream;


public class HelloWorldActivity extends AppCompatActivity {
    private static final String TAG="HelloWorldActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Log.d(TAG, "onCreate: kris test222");
        Log.d(TAG, "onCreate: ");
        String str = new String();
    }

//TODO
}
