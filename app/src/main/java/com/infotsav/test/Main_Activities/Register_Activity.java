package com.infotsav.test.Main_Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
    Boolean clicked=false;
    DatabaseReference databaseReference=FirebaseDatabase.getInstance().getReference().child("user");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_new);

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
                clicked=true;
                if(nameusr.matches("")&&(clicked==true))
                    Toast.makeText(getApplicationContext(),"Enter Name",Toast.LENGTH_LONG).show();
                else if(genderusr.matches("")&&(clicked==true))
                    Toast.makeText(getApplicationContext(),"Enter Gender",Toast.LENGTH_LONG).show();
                else if(emailusr.matches("")&&(clicked==true))
                    Toast.makeText(getApplicationContext(),"Enter Email",Toast.LENGTH_LONG).show();
                else if(passwordusr.matches("")&&(clicked==true))
                    Toast.makeText(getApplicationContext(),"Enter Password",Toast.LENGTH_LONG).show();
                else if(nameusr.matches("")&&(clicked==true))
                    Toast.makeText(getApplicationContext(),"Enter College Name",Toast.LENGTH_LONG).show();
                else if(cityusr.matches("")&&(clicked==true))
                    Toast.makeText(getApplicationContext(),"Enter City",Toast.LENGTH_LONG).show();
                else if (mobileusr.matches("")&&(clicked==true))
                    Toast.makeText(getApplicationContext(),"Enter Mobile Number",Toast.LENGTH_LONG).show();
                else {
                    Toast.makeText(getApplicationContext(),"You have been Registered in Infotsav'19",Toast.LENGTH_LONG).show();
                    Login_Register_User login_register_user=new Login_Register_User(nameusr,genderusr,emailusr,passwordusr,collegenameusr,cityusr,mobileusr);
                    databaseReference.push().setValue(login_register_user);
                    finish();
                }
                //Toast.makeText(getApplicationContext(),"Enter Name",Toast.LENGTH_LONG).show();
            }
        });

    }
}
