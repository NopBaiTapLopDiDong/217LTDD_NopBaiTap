package com.example.asus.baitap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvHoa;
    ArrayList<Hoa> arrayHoa;
    HoaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        adapter=new HoaAdapter(this,R.layout.tenhoa,arrayHoa);
        lvHoa.setAdapter(adapter);
    }
    private void AnhXa(){
        lvHoa=(ListView) findViewById(R.id.listviewHoa);
        arrayHoa=new ArrayList<>();
        arrayHoa.add(new Hoa("Cẩm Tú Cầu", "150000 đồng ",R.drawable.camtucau));
        arrayHoa.add(new Hoa("Hoa Hồng", "50000 đồng ",R.drawable.hoahong));
        arrayHoa.add(new Hoa("Hoa Ly", "70000 đồng ",R.drawable.hoaly));
        arrayHoa.add(new Hoa("Hoa Tulip", "250000 đồng ",R.drawable.hoatulip));
        arrayHoa.add(new Hoa("Hoa Hướng Dương", "90000 đồng ",R.drawable.huongduong));
    }
}
