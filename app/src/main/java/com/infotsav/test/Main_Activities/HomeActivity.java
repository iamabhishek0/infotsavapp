package com.infotsav.test.Main_Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.infotsav.test.R;
import com.infotsav.test.foldingView.FoldingActivity;

public class HomeActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //TODO: Read the firebase docs for realtime database or firestore (which ever you prefer)
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    }

    public void launchFoldingActivity(View view) {

        Intent intent = new Intent(this, FoldingActivity.class);
        startActivity(intent);
    }
}
