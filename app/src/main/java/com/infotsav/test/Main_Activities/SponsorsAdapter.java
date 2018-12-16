package com.infotsav.test.Main_Activities;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.infotsav.test.R;

import java.util.List;

public class SponsorsAdapter extends BaseAdapter {

    private Context mContext;
    private List<Sponsors_details> mSponsors_detailslist;


    public SponsorsAdapter(Context mContext, List<Sponsors_details> mSponsors_detailslist) {
        this.mContext = mContext;
        this.mSponsors_detailslist = mSponsors_detailslist;
    }

    @Override
    public int getCount() {
        return mSponsors_detailslist.size();
    }

    @Override
    public Object getItem(int position) {
        return mSponsors_detailslist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(mContext,R.layout.sponsors_list,null);
        TextView sponsor_name=(TextView)view.findViewById(R.id.sponsor_name);
        TextView sponsor_level=(TextView)view.findViewById(R.id.sponsor_level);
        TextView sponsor_dept=(TextView)view.findViewById(R.id.sponsor_department);
        ImageView sponsor_image=(ImageView)view.findViewById(R.id.sponsor_image);



        sponsor_name.setText(mSponsors_detailslist.get(position).getSponsor_name());
        sponsor_level.setText(mSponsors_detailslist.get(position).getSponsor_level());
        sponsor_dept.setText(mSponsors_detailslist.get(position).getSponsor_dept());
        //sponsor_image.setImageResource(mSponsors_detailslist.get(position).getSponsor_image());
        view.setTag(mSponsors_detailslist.get(position).getId());
        return view;
    }
}