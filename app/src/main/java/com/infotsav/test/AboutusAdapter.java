package com.infotsav.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AboutusAdapter extends BaseAdapter {

    private Context mContext;
    private List<Aboutus_details> mAboutus_detailslist;


    public AboutusAdapter(Context mContext, List<Aboutus_details> mAboutus_detailslist) {
        this.mContext = mContext;
        this.mAboutus_detailslist = mAboutus_detailslist;
    }

    @Override
    public int getCount() {
        return mAboutus_detailslist.size();
    }

    @Override
    public Object getItem(int position) {
        return mAboutus_detailslist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(mContext,R.layout.aboutus_list,null);
        TextView person_name=(TextView)view.findViewById(R.id.person_name);
        TextView person_email=(TextView)view.findViewById(R.id.person_email);
        TextView person_department=(TextView)view.findViewById(R.id.person_department);

        person_name.setText(mAboutus_detailslist.get(position).getName());
        person_email.setText(mAboutus_detailslist.get(position).getEmail());
        person_department.setText(mAboutus_detailslist.get(position).getDept());
        view.setTag(mAboutus_detailslist.get(position).getId());
        return view;
    }
}
