package com.example.notificationtest;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NotifficationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notiffication_layout);
        //NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        //manager.cancel(1);
    }
}
