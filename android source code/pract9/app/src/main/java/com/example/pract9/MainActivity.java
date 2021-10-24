package com.example.pract9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action();
    }

    private void action(){
        Button bgButton = findViewById(R.id.bgButton);
        Button textColorButton = findViewById(R.id.textColorButton);

        bgButton.setOnClickListener(
                v -> {
                    Fragment fragment = new background();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    FragmentTransaction replace  = transaction.replace(R.id.flayout,fragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
        );

        textColorButton.setOnClickListener(
                v -> {
                    Fragment fragment = new textColor();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    FragmentTransaction replace  = transaction.replace(R.id.flayout,fragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
        );
    }
}