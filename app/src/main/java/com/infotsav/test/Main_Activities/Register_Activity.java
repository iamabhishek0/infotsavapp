package com.infotsav.test.Main_Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.infotsav.test.R;

public class Register_Activity extends AppCompatActivity {

    Button register;
    EditText name;
    EditText gender;
    EditText email;
    EditText password;
    EditText collegename;
    EditText city;
    EditText mobile;
    String nameusr;
    String genderusr;
    String emailusr;
    String passwordusr;
    String collegenameusr;
    String cityusr;
    String mobileusr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_new);
        final DatabaseReference databaseReference=FirebaseDatabase.getInstance().getReference().child("user");


        name=(EditText)findViewById(R.id.reg_name);
        gender=(EditText)findViewById(R.id.reg_gender);
        email=(EditText)findViewById(R.id.reg_email);
        password=(EditText)findViewById(R.id.reg_password);
        collegename=(EditText)findViewById(R.id.reg_college);
        city=(EditText)findViewById(R.id.reg_city);
        mobile=(EditText)findViewById(R.id.reg_mobile);
        register=(Button)findViewById(R.id.reg_btn);



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameusr=name.getText().toString();
                genderusr=gender.getText().toString();
                emailusr=email.getText().toString();
                passwordusr=password.getText().toString();
                collegenameusr=collegename.getText().toString();
                cityusr=city.getText().toString();
                mobileusr=mobile.getText().toString();
                Login_Register_User login_register_user=new Login_Register_User(nameusr,genderusr,emailusr,passwordusr,collegenameusr,cityusr,mobileusr);
                databaseReference.push().setValue(login_register_user);
                finish();
            }
        });
    }
}
