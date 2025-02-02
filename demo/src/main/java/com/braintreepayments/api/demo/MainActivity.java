package com.braintreepayments.api.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchStandardBrowserSwitch(View view) {
        Intent intent = new Intent(this, DemoActivity.class);
        startActivity(intent);
    }

    public void launchSingleTopBrowserSwitch(View view) {
        Intent intent = new Intent(this, DemoActivitySingleTop.class);
        startActivity(intent);
    }
}