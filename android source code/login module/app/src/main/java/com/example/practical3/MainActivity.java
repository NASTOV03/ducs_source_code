package com.example.practical3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import static android.R.attr.value;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Start();
    }

    private void Start() {

        username = (EditText) findViewById(R.id.txt1);
        password = (EditText) findViewById(R.id.txt2);
        login = (Button) findViewById(R.id.butt);

        login.setOnClickListener(v ->
        {

            if (username.getText().toString().equals("admin") &&
                    password.getText().toString().equals("admin")) {
                Toast.makeText(MainActivity.this, "Login Successful",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Invalid Details",
                        Toast.LENGTH_SHORT).show();
            }

        });
    }
}

