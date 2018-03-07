package com.example.tuyen.ungdungdautienlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonHoc;
    ArrayList<String> mangMonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonHoc=(ListView) findViewById(R.id.listviewMonHoc);
        mangMonHoc=new ArrayList<String>();
        mangMonHoc.add("Toán");
        mangMonHoc.add("Tiếng việt");
        mangMonHoc.add("Tự Nhiên và xã hội");
        mangMonHoc.add("Lịch sử");
        mangMonHoc.add("Công dân");
        mangMonHoc.add("Địa");

        ArrayAdapter adapter=new ArrayAdapter(
          MainActivity.this,
                android .R.layout.simple_list_item_1,
                mangMonHoc
        );
        lvMonHoc.setAdapter(adapter);

    }
}
