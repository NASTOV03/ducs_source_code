package com.example.pract6;

import androidx.appcompat.app.AppCompatActivity; import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    ListView lv;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); lv = findViewById(R.id.list);
        tv = findViewById(R.id.txt); ArrayAdapter<CharSequence> ad1 = ArrayAdapter.createFromResource(this, R.array.Course, android.R.layout.simple_dropdown_item_1line);
        lv.setAdapter(ad1);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                if (position == 0)
                    tv.setText(String.format("Course : %s\n Teacher In Charge is Mr AMIT KAPOOR", selectedItem));
                else if (position == 1)
                    tv.setText(String.format("Course : %s\n Teacher In Charge is Dr. SEEMA SHARMA", selectedItem));
                else if (position == 2)
                    tv.setText(String.format("Course : %s\n Teacher In Charge is Mr.BHAVYA DEEP", selectedItem));
                else if (position == 3)
                        tv.setText(String.format("Course : %s\n Teacher In Charge is Dr. SIDDHARTH SIROHI", selectedItem));
                else if (position == 4)
                    tv.setText(String.format("Course : %s\n Teacher In Charge is Dr. SANDEEP MITTAL", selectedItem));
                else if (position == 5)
                        tv.setText(String.format("Course : %s\n Teacher In Charge is Dr. SUMITA CHUGH", selectedItem));
            }
        });
    }
}