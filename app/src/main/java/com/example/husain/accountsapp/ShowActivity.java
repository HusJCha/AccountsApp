package com.example.husain.accountsapp;

import android.support.v7.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShowActivity extends AppCompatActivity {

    Button btn_aaf;
    int mar_top=325;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        btn_aaf=(Button)findViewById(R.id.btn_aaf);

        btn_aaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

//                AlertDialog.Builder adb=new AlertDialog.Builder(ShowActivity.this);
//                adb.setTitle("Alert");
//                adb.setMessage("What do you want to Add?");
//                adb.setIcon(R.mipmap.plus);
//                adb.setPositiveButton("Yes", new DialogInterface.OnClickListener()
//                {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which)
//                    {
//
//                    }
//                });
//                adb.setNegativeButton("No", new DialogInterface.OnClickListener()
//                {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which)
//                    {
//
//                    }
//                });
//                adb.show();

            }
        });
    }
}
