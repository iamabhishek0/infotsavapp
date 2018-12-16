package com.infotsav.test.Main_Activities;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.infotsav.test.R;

import java.util.List;

public class UpdatesAdapter extends BaseAdapter {

    private Context mContext;
    private List<Updates_details> mUpdates_detailslist;


    public UpdatesAdapter(Context mContext, List<Updates_details> mUpdates_detailslist) {
        this.mContext = mContext;
        this.mUpdates_detailslist = mUpdates_detailslist;
    }

    @Override
    public int getCount() {
        return mUpdates_detailslist.size();
    }

    @Override
    public Object getItem(int position) {
        return mUpdates_detailslist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(mContext,R.layout.updates_list,null);
        TextView person_name=(TextView)view.findViewById(R.id.sponsor_name);
        TextView person_email=(TextView)view.findViewById(R.id.sponsor_level);
        TextView person_department=(TextView)view.findViewById(R.id.sponsor_department);
        // TextView person_call=(TextView)view.findViewById(R.id.call_person_button);
        ImageView person_image=(ImageView)view.findViewById(R.id.sponsor_image);



        person_name.setText(mUpdates_detailslist.get(position).getHeading());
        person_email.setText(mUpdates_detailslist.get(position).getDate_time());
        person_department.setText(mUpdates_detailslist.get(position).getData());
        person_image.setImageResource(mUpdates_detailslist.get(position).getImage());
        view.setTag(mUpdates_detailslist.get(position).getId());
        return view;
    }
}