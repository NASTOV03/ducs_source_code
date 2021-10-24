package com.example.piract12;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    nyreceiver mMessageReceiver ;

    EditText txt;
    Button send;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = (Button) findViewById(R.id.butt);
        txt = (EditText) findViewById(R.id.txt);
    }

    @Override
    protected void onStart() {
        super.onStart();




        send.setOnClickListener(v ->
                {
                    String message = txt.getText().toString();
                    Intent intent=new Intent(message);
                    registerReceiver(mMessageReceiver,new IntentFilter("com.example.andy.CUSTOM_INTENT"));
                    sendBroadcast(intent);
                }
        );

    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mMessageReceiver);
    }


}
