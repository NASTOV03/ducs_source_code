package com.example.piract12;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public abstract class nyreceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            String ss=intent.getAction();

            Toast.makeText(context.getApplicationContext(),"this is my broadcast message: "+ss,Toast.LENGTH_LONG).show();
        }
    };

