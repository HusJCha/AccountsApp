package com.example.husain.accountsapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CheckPasswordActivity extends AppCompatActivity {

    EditText ed_pwd;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    ImageView b_clr,b_chk;
    String val="",password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_password);

        SharedPreferences settings=getSharedPreferences("PREFES", 0);
        password=settings.getString("password", "");
        ed_pwd=(EditText)findViewById(R.id.ed_pwd);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b0=(Button)findViewById(R.id.b0);
        b_clr=(ImageView)findViewById(R.id.b_clr);
        b_chk=(ImageView)findViewById(R.id.b_chk);
        ed_pwd.setHint("Enter Your Password");


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val =val+"1";
                ed_pwd.setText(val);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val =val+"2";
                ed_pwd.setText(val);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val =val+"3";
                ed_pwd.setText(val);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val =val+"4";
                ed_pwd.setText(val);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val =val+"5";
                ed_pwd.setText(val);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val =val+"6";
                ed_pwd.setText(val);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val =val+"7";
                ed_pwd.setText(val);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val =val+"8";
                ed_pwd.setText(val);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val =val+"9";
                ed_pwd.setText(val);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val =val+"0";
                ed_pwd.setText(val);
            }
        });
        b_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val="";
                ed_pwd.setText("");
            }
        });
        b_chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val=="")
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Password",Toast.LENGTH_LONG).show();
                }
                else
                {
                    if(val.equals(password))
                    {
                        Intent i =new Intent(getApplicationContext(),HomeActivity.class);
                        startActivity(i);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Wrong Password!",Toast.LENGTH_LONG).show();
                        val="";
                        ed_pwd.setText("");
                    }
                }
            }
        });


    }
}
