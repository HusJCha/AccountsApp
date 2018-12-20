package com.example.husain.accountsapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SharedPreferences settings = getSharedPreferences("PREFES", 0);
        password = settings.getString("password", "");

        Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(password.equals(""))
                {
                    Intent i=new Intent(getApplicationContext(),CreatePasswordActivity.class);
                    startActivity(i);
                    finish();
                }
                else {
                    Intent i = new Intent(getApplicationContext(),CheckPasswordActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        }, 2000);
    }
}
