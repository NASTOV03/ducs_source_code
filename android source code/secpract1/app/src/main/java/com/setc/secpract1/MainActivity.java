package com.setc.secpract1;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity implements HomeFragment.OnDbOpListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.container)!=null)
        {
            if(savedInstanceState!=null)
            {
                return;
            }
            HomeFragment homeFragment = new HomeFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.container,homeFragment).commit();
        } }
    @Override
    public void dBOpPerformed(int method) {

        switch (method)
        {
            case 0:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new AddContactFragment()).addToBackStack(null).commit();
                break;
            case 1:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new ReadContactsFragment()).addToBackStack(null).commit();
                break;

    } }}
