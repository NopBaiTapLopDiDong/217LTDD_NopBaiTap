package com.example.han.custom_listview_score.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.han.custom_listview_score.R;
import com.example.han.custom_listview_score.entity.Match;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Han on 3/6/2018.
 */

public class MatchAdapter extends ArrayAdapter<Match> {

    Context mContext;
    ArrayList<Match> mLstMatch = new ArrayList<Match>();

    public MatchAdapter(@NonNull Context context, int resource, @NonNull List<Match> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mLstMatch = new ArrayList<Match>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View rowView = convertView;
        ViewHolder viewHolder;

        if (rowView==null){
            LayoutInflater inflate = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflate.inflate(R.layout.row_item,null);
            viewHolder = new ViewHolder();

            viewHolder.txtScore = (TextView) rowView.findViewById(R.id.txtScore);
            viewHolder.imgFlagLeft = (ImageView) rowView.findViewById(R.id.imgFlagLeft);
            viewHolder.imgFlagRight = (ImageView) rowView.findViewById(R.id.imgFlagRight);

            rowView.setTag(viewHolder);

        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Match match = mLstMatch.get(position);
        viewHolder.txtScore.setText(match.getScore());
        viewHolder.imgFlagLeft.setImageResource(match.getFlagLeft());
        viewHolder.imgFlagRight.setImageResource(match.getFlagRight());

        return rowView;
    }

    static class ViewHolder{
        TextView txtScore;
        ImageView imgFlagLeft;
        ImageView imgFlagRight;

    }
}
