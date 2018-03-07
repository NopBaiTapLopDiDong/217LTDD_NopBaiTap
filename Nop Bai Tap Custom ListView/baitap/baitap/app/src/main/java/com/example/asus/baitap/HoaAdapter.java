package com.example.asus.baitap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Asus on 3/6/2018.
 */

public class HoaAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Hoa> hoaList;

    public HoaAdapter(Context context, int layout, List<Hoa> hoaList) {
        this.context = context;
        this.layout = layout;
        this.hoaList = hoaList;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        TextView txtTen=(TextView) view.findViewById(R.id.textViewTen);
        TextView txtGiaban=(TextView) view.findViewById(R.id.textViewGiaban);
        ImageView imgHinh=(ImageView) view.findViewById(R.id.imageViewHinh);
        Hoa hoa=hoaList.get(i);
        txtTen.setText(hoa.getTen());
        txtGiaban.setText(hoa.getGiaban());
        imgHinh.setImageResource(hoa.getHinh());
        return view;
    }
}
