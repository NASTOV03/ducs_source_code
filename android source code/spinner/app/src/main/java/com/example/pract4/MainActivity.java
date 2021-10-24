package com.example.pract4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=  findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        ArrayList<String> list = new ArrayList<>();
        list.add("supraa");
        list.add("evo");
        list.add("gtr");
        list.add("mazda");
        list.add("nsx");
        list.add("subaru");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        imageView=findViewById(R.id.imageView);

        switch(item){
            case("supraa"):
                imageView.setImageResource(R.drawable.supraa);
                break;
            case("evo"):
                imageView.setImageResource(R.drawable.evo9);
                break;
            case("gtr"):
                imageView.setImageResource(R.drawable.gtr34);
                break;
            case("mazda"):
                imageView.setImageResource(R.drawable.rx7);
                break;
            case("nsx"):
                imageView.setImageResource(R.drawable.nsx);
                break;
            case("subaru"):
                imageView.setImageResource(R.drawable.subaru);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + item);
        }

        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
