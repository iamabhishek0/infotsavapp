package com.infotsav.test.Main_Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.infotsav.test.R;

import java.util.ArrayList;
import java.util.List;

public class UpdatesActivity extends AppCompatActivity {

    private ListView lvupdates;
    private UpdatesAdapter adapter;
    private List<Updates_details> mUpdates_detailslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updates);

        lvupdates=(ListView)findViewById(R.id.listview_updates);
        mUpdates_detailslist =new ArrayList<>();
        mUpdates_detailslist.add(new Updates_details(1,"ANNOUNCEMENT","13/12 7:00PM","The opening ceremony has begun.Reach Main Audi asap",R.drawable.restaurant));
        mUpdates_detailslist.add(new Updates_details(1,"ANNOUNCEMENT","13/12 7:00PM","The opening ceremony has begun.Reach Main Audi asap",R.drawable.restaurant));
        mUpdates_detailslist.add(new Updates_details(1,"ANNOUNCEMENT","13/12 7:00PM","The opening ceremony has begun.Reach Main Audi asap",R.drawable.restaurant));
        mUpdates_detailslist.add(new Updates_details(1,"ANNOUNCEMENT","13/12 7:00PM","The opening ceremony has begun.Reach Main Audi asap",R.drawable.restaurant));

        adapter=new UpdatesAdapter(getApplicationContext(), mUpdates_detailslist);
        lvupdates.setAdapter(adapter);

        lvupdates.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Item clicked",Toast.LENGTH_LONG).show();
            }
        });

    }
}
