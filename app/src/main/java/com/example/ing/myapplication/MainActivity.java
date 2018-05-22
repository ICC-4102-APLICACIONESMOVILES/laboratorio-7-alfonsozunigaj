package com.example.ing.myapplication;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startAlert();
    }

    public void startAlert() {
        Context context = getApplicationContext();
        AlarmManager alarmMgr = (AlarmManager)context.getSystemService(ALARM_SERVICE);
        Intent intent = new Intent(this, alarmReceiver.class);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(this.getApplicationContext(), 0, intent, 0);
        alarmMgr.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                SystemClock.elapsedRealtime() + AlarmManager.INTERVAL_HALF_HOUR/180,
                AlarmManager.INTERVAL_HALF_HOUR/180, alarmIntent);
        Toast.makeText(this, "Alarm set in 10 seconds", Toast.LENGTH_LONG).show();
    }
}
