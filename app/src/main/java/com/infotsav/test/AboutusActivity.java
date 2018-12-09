package com.infotsav.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AboutusActivity extends AppCompatActivity {

    private ListView lvaboutus;
    private AboutusAdapter adapter;
    private List<Aboutus_details> mAboutus_detailslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        lvaboutus=(ListView)findViewById(R.id.listview_aboutus);
        mAboutus_detailslist=new ArrayList<>();
        mAboutus_detailslist.add(new Aboutus_details(1,"Siddharth","sidvaish@gmail.com","Tech"));
        mAboutus_detailslist.add(new Aboutus_details(1,"Siddharth1","sidvaish1@gmail.com","Tech1"));
        mAboutus_detailslist.add(new Aboutus_details(1,"Siddharth2","sidvaish2@gmail.com","Tech2"));
        mAboutus_detailslist.add(new Aboutus_details(1,"Siddharth3","sidvaish3@gmail.com","Tech3"));
        mAboutus_detailslist.add(new Aboutus_details(1,"Siddharth4","sidvaish4@gmail.com","Tech4"));
        mAboutus_detailslist.add(new Aboutus_details(1,"Siddharth5","sidvaish5@gmail.com","Tech5"));
        mAboutus_detailslist.add(new Aboutus_details(1,"Siddharth6","sidvaish6@gmail.com","Tech6"));

        adapter=new AboutusAdapter(getApplicationContext(),mAboutus_detailslist);
        lvaboutus.setAdapter(adapter);

        lvaboutus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Item clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
}
