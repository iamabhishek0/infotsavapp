package com.infotsav.test.Main_Activities;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseListAdapter;
import com.firebase.ui.database.FirebaseListOptions;
import com.firebase.ui.database.FirebaseRecyclerOptions;
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
    private ProgressBar progressBar;
    private FirebaseListAdapter<Contactus_details> fAdapter;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("contactus");
    //private Context mContext = getApplicationContext();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        mContactus_detailslist = new ArrayList<>();
        progressBar = findViewById(R.id.progress_bar);
        progressBar.setVisibility(View.GONE);
        lvcontactus=(ListView)findViewById(R.id.listview_contactus);
        
        //setupCustomAdapter();
        
        setupFirebaseAdapter();
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
    
    private void setupFirebaseAdapter() {
    
        FirebaseListOptions<Contactus_details> options =
                new FirebaseListOptions.Builder<Contactus_details>()
                        .setQuery(databaseReference, Contactus_details.class)
                        .setLayout(R.layout.contactus_list)
                        .build();
        fAdapter = new FirebaseListAdapter<Contactus_details>(options) {
            @Override
            protected void populateView(View view, Contactus_details model, int position) {
                
                TextView person_name=(TextView)view.findViewById(R.id.person_name);
    
                TextView person_email=(TextView)view.findViewById(R.id.person_email);
    
    
                TextView person_department=(TextView)view.findViewById(R.id.person_department);
    
                AssetManager assetManager = getAssets();
    
                final Typeface tvFont = Typeface.createFromAsset(assetManager,  "fonts/Delius-Regular.ttf");
                person_name.setTypeface(tvFont);
                person_department.setTypeface(tvFont);
                person_email.setTypeface(tvFont);
    
                person_name.setTextColor(Color.BLACK);
    
                ImageView person_call=(ImageView) view.findViewById(R.id.call_person_button);
                ImageView person_image=(ImageView)view.findViewById(R.id.person_photo);
    
                String url = model.getImage();
                if(url!=null) {
                    Glide.with(person_image.getContext()).load(url).into(person_image);
        
                }
                person_name.setText(model.getName());
                person_email.setText(model.getEmail());
                person_department.setText(model.getDept());
                final String number =model.getCall();
    
                person_call.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) { Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:"+(number)));
                        startActivity(callIntent);
                    }
                });
    
                person_call.setImageResource(R.drawable.callbutton);
                //person_image.setImageResource(mContactus_detailslist.get(position).getImage());
               // view.setTag(mContactus_detailslist.get(position).getId());
            }
        };
        
        lvcontactus.setAdapter(fAdapter);
        
        
    }
    
    private void setupCustomAdapter() {
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Contactus_details contactus_details=dataSnapshot.getValue(Contactus_details.class);
                mContactus_detailslist.add(contactus_details);
                // Log.e("contact_us", contactus_details.getEmail());
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
                progressBar.setVisibility(View.GONE);
                adapter=new ContactusAdapter(getApplicationContext(), mContactus_detailslist);
                lvcontactus.setAdapter(adapter);
            }
        
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            
            }
        });
    
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        if (fAdapter!=null)
            fAdapter.startListening();
    }
    
    @Override
    protected void onStop() {
        super.onStop();
    
        if (fAdapter!=null)
            fAdapter.stopListening();
    }
}
