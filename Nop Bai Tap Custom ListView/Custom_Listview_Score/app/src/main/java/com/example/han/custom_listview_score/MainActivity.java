package com.example.han.custom_listview_score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.han.custom_listview_score.adapter.MatchAdapter;
import com.example.han.custom_listview_score.entity.Match;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Match> mLstMatch = new ArrayList<Match>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doCreateFakeData();

        // Lay Listview tu layout xuong
        ListView listMatch = (ListView) findViewById(R.id.lstMatchScore);

        // Tao adapter
        MatchAdapter adapter = new MatchAdapter(MainActivity.this,R.layout.row_item,mLstMatch);

        // Do du lieu len ListView
        listMatch.setAdapter(adapter);
    }

    private void doCreateFakeData(){

        // Tran 1
        Match m1= new Match();
        m1.setScore("2 - 1");
        m1.setFlagLeft(R.drawable.f_aelgium);
        m1.setFlagRight(R.drawable.f_afghanistan);
        // Tran 2
        Match m2= new Match();
        m2.setScore("1 - 0");
        m2.setFlagLeft(R.drawable.f_africanunion);
        m2.setFlagRight(R.drawable.f_aland);
        // Tran 3
        Match m3= new Match();
        m3.setScore("3 - 2");
        m3.setFlagLeft(R.drawable.f_albania);
        m3.setFlagRight(R.drawable.f_alderney);
        // Tran 4
        Match m4= new Match();
        m4.setScore("2 - 2");
        m4.setFlagLeft(R.drawable.f_andorra);
        m4.setFlagRight(R.drawable.f_angola);
        // Tran 5
        Match m5= new Match();
        m5.setScore("1 - 4");
        m5.setFlagLeft(R.drawable.f_anguilla);
        m5.setFlagRight(R.drawable.f_azerbaijan);

        mLstMatch.add(m1);
        mLstMatch.add(m2);
        mLstMatch.add(m3);
        mLstMatch.add(m4);
        mLstMatch.add(m5);


    }
}
