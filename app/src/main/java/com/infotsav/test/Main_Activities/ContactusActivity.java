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

public class ContactusActivity extends AppCompatActivity {

    private ListView lvcontactus;
    private ContactusAdapter adapter;
    private List<Contactus_details> mContactus_detailslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        lvcontactus=(ListView)findViewById(R.id.listview_contactus);
        mContactus_detailslist =new ArrayList<>();
        mContactus_detailslist.add(new Contactus_details(1,"Siddharth","sidvaish@gmail.com","Tech","9149386335",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(1,"Siddharth1","sidvaish1@gmail.com","Tech1","9149386335",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(1,"Siddharth2","sidvaish2@gmail.com","Tech2","9149386335",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(1,"Siddharth3","sidvaish3@gmail.com","Tech3","9149386335",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(1,"Siddharth4","sidvaish4@gmail.com","Tech4","9149386335",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(1,"Siddharth5","sidvaish5@gmail.com","Tech5","9149386335",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(1,"Siddharth6","sidvaish6@gmail.com","Tech6","9149386335",R.drawable.barry_allen));

        adapter=new ContactusAdapter(getApplicationContext(), mContactus_detailslist);
        lvcontactus.setAdapter(adapter);

        lvcontactus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Item clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
}
