package com.example.han.custorm_listview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.han.custorm_listview.adapter.CustomAdapter;
import com.example.han.custorm_listview.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = (ListView) findViewById(R.id.lv_contact);

        ArrayList<Contact> arrayList = new ArrayList<>();

        Contact contact1 = new Contact(Color.YELLOW,"Phan Thanh Han","0156465465");
        Contact contact2 = new Contact(Color.GREEN,"Le Thanh Tuyen","0146548894");
        Contact contact3 = new Contact(Color.BLUE,"Pham Thao Nguyen","0936548788");
        Contact contact4 = new Contact(Color.CYAN,"Dang Kim Oanh","0122035488");
        Contact contact5 = new Contact(Color.RED,"Le Van Long","0897848468");
        Contact contact6 = new Contact(Color.GRAY,"Pham Thanh Dat","0905687492");
        Contact contact7 = new Contact(Color.BLUE,"Bui Thanh Minh","0547216778");
        Contact contact8 = new Contact(Color.GREEN,"Pham Quang Truong","085852987");
        Contact contact9 = new Contact(Color.YELLOW,"Le Thanh Cao","0908657492");

        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        arrayList.add(contact7);
        arrayList.add(contact8);
        arrayList.add(contact9);

        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item, arrayList);
        lvContact.setAdapter(customAdapter);


    }
}
