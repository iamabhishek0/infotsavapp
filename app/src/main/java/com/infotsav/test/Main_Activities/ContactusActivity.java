package com.infotsav.test.Main_Activities;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.infotsav.test.R;

import java.util.ArrayList;
import java.util.List;

public class ContactusActivity extends AppCompatActivity {

    private ListView lvcontactus;
    private ContactusAdapter adapter;
    private ArrayList<Contactus_details> mContactus_detailslist;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("contactus");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        mContactus_detailslist = new ArrayList<>();
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Contactus_details contactus_details=(Contactus_details)dataSnapshot.getValue(Contactus_details.class);
                mContactus_detailslist.add(contactus_details);
                if(adapter!=null)
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                lvcontactus=(ListView)findViewById(R.id.listview_contactus);
                adapter=new ContactusAdapter(getApplicationContext(), mContactus_detailslist);
                lvcontactus.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        /*lvcontactus=(ListView)findViewById(R.id.listview_contactus);
        mContactus_detailslist =new ArrayList<>();
        mContactus_detailslist.add(new Contactus_details(1,"JUHI TIWARI","juhi@infotsav.in","Coordinator","9461155105",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(2,"MUKUL SIKKA","mukul@infotsav.in","Coordinator","7470485414",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(3,"PRATYUSH RANJAN","pratyush@infotsav.in","Coordinator","9598319698",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(4,"SHUBHANKER SRIVASTAVA","shubhanker@infotsav.in","Coordinator","9454932137",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(5,"AVIHARSH SHUKLA","sidvaish4@gmail.com","Head App Developer","8765114937",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(6,"SIDDHARTH VAISH","sidvaish97@gmail.com","Head App Developer","9149386335",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(7,"HIMADRI SINGH","himsingh1612@gmail.com","App Developer","8449569368",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(8,"DEEPAK PALIWAL","deepakkpaliwal@gmail.com","App Developer","8769449558",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(9,"ABHISHEK CHAURASIA","abhi.chaurasia14@gmail.com","App Developer","9919098817",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(10,"ADITYA SHANKAR MISHRA","adityashankarmishra3@gmail.com","App Developer","9260970643",R.drawable.barry_allen));
        mContactus_detailslist.add(new Contactus_details(11,"SHUBHAM BHAWSAR","bhawsarshubham741@gmail.com","App Developer","8878674076",R.drawable.barry_allen));

        adapter=new ContactusAdapter(getApplicationContext(), mContactus_detailslist);
        lvcontactus.setAdapter(adapter);

        lvcontactus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Item clicked",Toast.LENGTH_LONG).show();
            }
        });*/

    }
}
