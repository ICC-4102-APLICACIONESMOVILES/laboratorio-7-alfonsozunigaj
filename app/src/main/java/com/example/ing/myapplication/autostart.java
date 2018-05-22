package com.example.ing.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by ING on 22-05-2018.
 */

public class autostart extends BroadcastReceiver {

    public void onReceive(Context context, Intent arg1)
    {
        Log.i("Autostart", "started");
    }
}
