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
        TextView announcement_title=(TextView)view.findViewById(R.id.announcement_title);
        TextView announcement_datetime=(TextView)view.findViewById(R.id.announcement_datetime);
        TextView announcement_description=(TextView)view.findViewById(R.id.announcement_description);

        announcement_title.setText(mUpdates_detailslist.get(position).getAnnouncement_title());
        announcement_datetime.setText(mUpdates_detailslist.get(position).getAnnouncement_datetime());
        announcement_description.setText(mUpdates_detailslist.get(position).getAnnouncement_desc());
        view.setTag(mUpdates_detailslist.get(position).getId());
        return view;
    }
}