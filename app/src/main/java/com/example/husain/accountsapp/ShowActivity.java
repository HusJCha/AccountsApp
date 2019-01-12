package com.example.husain.accountsapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.StringTokenizer;

public class ShowActivity extends AppCompatActivity {

    Button btn_aaf,btn_aaf_unset_1,btn_aaf_unset_2,btn_check,btn_edit,btn_delete;
    int i=1;
    TextView tv_unset_1,tv_unset_2,tv_unset_3;
    EditText ed_acc_nm,ed_unm,ed_pwd,ed_unset_1,ed_unset_2,ed_unset_3;
    String acc_nm,unm,pwd,unset_1,unset_2,unset_3;
    DBHelper dbh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        dbh=new DBHelper(getApplicationContext(),"mydatabse",null,1);
        btn_aaf=(Button)findViewById(R.id.btn_aaf);
        tv_unset_1 = (TextView)findViewById(R.id.tv_unset_1);
        tv_unset_2 = (TextView)findViewById(R.id.tv_unset_2);
        tv_unset_3 = (TextView)findViewById(R.id.tv_unset_3);
        ed_acc_nm = (EditText)findViewById(R.id.ed_acc_nm);
        ed_unm = (EditText)findViewById(R.id.ed_unm);
        ed_pwd = (EditText)findViewById(R.id.ed_pwd);
        ed_unset_1 = (EditText) findViewById(R.id.ed_unset_1);
        ed_unset_2 = (EditText) findViewById(R.id.ed_unset_2);
        ed_unset_3 = (EditText) findViewById(R.id.ed_unset_3);
        btn_aaf_unset_1 = (Button)findViewById(R.id.btn_aaf_unset_1);
        btn_aaf_unset_2 = (Button)findViewById(R.id.btn_aaf_unset_2);
        btn_check = (Button)findViewById(R.id.btn_yes);
        btn_edit = (Button)findViewById(R.id.btn_edit);
        btn_delete = (Button)findViewById(R.id.btn_del);
        Intent in=getIntent();
        String status = in.getStringExtra("status");
        if(status == "new")
        {
            btn_check.setVisibility(View.VISIBLE);
        }
        else if(status == "open")
        {
            btn_edit.setVisibility(View.VISIBLE);
            btn_delete.setVisibility(View.VISIBLE);
        }
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_aaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                final Dialog d= new Dialog(ShowActivity.this,R.style.DBTheme);
                d.setContentView(R.layout.aaf_alert_box);
                d.setCanceledOnTouchOutside(false);
                Button btn_ok = (Button)d.findViewById(R.id.btn_ok);
                Button btn_cancel = (Button)d.findViewById(R.id.btn_cancel);
                final EditText ed_field = (EditText)d.findViewById(R.id.ed_field);
                ed_field.requestFocus();
                btn_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String field = ed_field.getText().toString();
                        if (field == "")
                        {
                            Toast.makeText(getApplicationContext(),"Please enter value",Toast.LENGTH_LONG).show();
                        }
                        else {
                            if (i == 1) {
                                tv_unset_1.setVisibility(View.VISIBLE);
                                tv_unset_1.setText(field);
                                ed_unset_1.setVisibility(View.VISIBLE);
                                ed_unset_1.setHint("Enter " + field);
                                btn_aaf_unset_1.setVisibility(View.VISIBLE);
                                ed_unset_1.requestFocus();
                                btn_aaf.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 2) {
                                tv_unset_2.setVisibility(View.VISIBLE);
                                tv_unset_2.setText(field);
                                ed_unset_2.setVisibility(View.VISIBLE);
                                ed_unset_2.setHint("Enter " + field);
                                btn_aaf_unset_2.setVisibility(View.VISIBLE);
                                ed_unset_2.requestFocus();
                                btn_aaf.setVisibility(View.GONE);
                                btn_aaf_unset_1.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 3) {
                                tv_unset_3.setVisibility(View.VISIBLE);
                                tv_unset_3.setText(field);
                                ed_unset_3.setVisibility(View.VISIBLE);
                                ed_unset_3.setHint("Enter " + field);
                                ed_unset_3.requestFocus();
                                btn_aaf_unset_1.setVisibility(View.GONE);
                                btn_aaf_unset_2.setVisibility(View.GONE);
                                btn_aaf.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            }
                        }
                    }

                });
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        d.hide();
                    }
                });
                d.show();
            }
        });
        btn_aaf_unset_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog d= new Dialog(ShowActivity.this);
                d.setContentView(R.layout.aaf_alert_box);
                d.setCanceledOnTouchOutside(false);
                Button btn_ok = (Button)d.findViewById(R.id.btn_ok);
                Button btn_cancel = (Button)d.findViewById(R.id.btn_cancel);
                final EditText ed_field = (EditText)d.findViewById(R.id.ed_field);
                ed_field.requestFocus();
                btn_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String field = ed_field.getText().toString();
                        if (field == "") {
                            Toast.makeText(getApplicationContext(), "Please enter value", Toast.LENGTH_LONG).show();
                        } else {
                            if (i == 1) {
                                tv_unset_1.setVisibility(View.VISIBLE);
                                tv_unset_1.setText(field);
                                ed_unset_1.setVisibility(View.VISIBLE);
                                ed_unset_1.setHint("Enter " + field);
                                btn_aaf_unset_1.setVisibility(View.VISIBLE);
                                ed_unset_1.requestFocus();
                                btn_aaf.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 2) {
                                tv_unset_2.setVisibility(View.VISIBLE);
                                tv_unset_2.setText(field);
                                ed_unset_2.setVisibility(View.VISIBLE);
                                ed_unset_2.setHint("Enter " + field);
                                btn_aaf_unset_2.setVisibility(View.VISIBLE);
                                ed_unset_2.requestFocus();
                                btn_aaf.setVisibility(View.GONE);
                                btn_aaf_unset_1.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 3) {
                                tv_unset_3.setVisibility(View.VISIBLE);
                                tv_unset_3.setText(field);
                                ed_unset_3.setVisibility(View.VISIBLE);
                                ed_unset_3.setHint("Enter " + field);
                                ed_unset_3.requestFocus();
                                btn_aaf_unset_1.setVisibility(View.GONE);
                                btn_aaf_unset_2.setVisibility(View.GONE);
                                btn_aaf.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            }
                        }
                    }
                });
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        d.hide();
                    }
                });
                d.show();
            }
        });
        btn_aaf_unset_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog d= new Dialog(ShowActivity.this);
                d.setContentView(R.layout.aaf_alert_box);
                d.setCanceledOnTouchOutside(false);
                Button btn_ok = (Button)d.findViewById(R.id.btn_ok);
                Button btn_cancel = (Button)d.findViewById(R.id.btn_cancel);
                final EditText ed_field = (EditText)d.findViewById(R.id.ed_field);
                ed_field.requestFocus();
                btn_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String field = ed_field.getText().toString();
                        if (field == "") {
                            Toast.makeText(getApplicationContext(), "Please enter value", Toast.LENGTH_LONG).show();
                        } else {
                            if (i == 1) {
                                tv_unset_1.setVisibility(View.VISIBLE);
                                tv_unset_1.setText(field);
                                ed_unset_1.setVisibility(View.VISIBLE);
                                ed_unset_1.setHint("Enter " + field);
                                ed_unset_1.requestFocus();
                                btn_aaf_unset_1.setVisibility(View.VISIBLE);
                                btn_aaf.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 2) {
                                tv_unset_2.setVisibility(View.VISIBLE);
                                tv_unset_2.setText(field);
                                ed_unset_2.setVisibility(View.VISIBLE);
                                ed_unset_2.setHint("Enter " + field);
                                btn_aaf_unset_2.setVisibility(View.VISIBLE);
                                ed_unset_2.requestFocus();
                                btn_aaf.setVisibility(View.GONE);
                                btn_aaf_unset_1.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 3) {
                                tv_unset_3.setVisibility(View.VISIBLE);
                                tv_unset_3.setText(field);
                                ed_unset_3.setVisibility(View.VISIBLE);
                                ed_unset_3.setHint("Enter " + field);
                                ed_unset_3.requestFocus();
                                btn_aaf_unset_1.setVisibility(View.GONE);
                                btn_aaf_unset_2.setVisibility(View.GONE);
                                btn_aaf.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            }
                        }
                    }
                });
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        d.hide();
                    }
                });
                d.show();
            }
        });
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acc_nm = ed_acc_nm.getText().toString();
                unm = ed_unm.getText().toString();
                pwd = ed_pwd.getText().toString();
                unset_1 = ed_unset_1.getText().toString();
                unset_2 = ed_unset_2.getText().toString();
                unset_3 = ed_unset_3.getText().toString();
                if(i==1)
                {
                    if (acc_nm.equals("") || unm.equals("") || pwd.equals(""))
                    {
                        Toast.makeText(getApplicationContext(), "Please Enter Credentials", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        HashMap<String,String> map =new HashMap<String, String>();
                        map.put("acc_nm",acc_nm);
                        map.put("unm",unm);
                        map.put("pwd",pwd);
                        Boolean result = dbh.insert(map,i);
                        if(result==true)
                        {
                            Intent i=new Intent(ShowActivity.this,HomeActivity.class);
                            startActivity(i);
                        }
                        else
                        {
                            final AlertDialog.Builder d = new AlertDialog.Builder(ShowActivity.this);
                            d.setTitle("Sorry");
                            d.setMessage("Please Try Again!");
                            d.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                            d.show();
                        }
                    }
                }
                else if(i==2)
                {
                    if (acc_nm.equals("") || unm.equals("") || pwd.equals("") || unset_1.equals(""))
                    {
                        Toast.makeText(getApplicationContext(), "Please Enter Credentials", Toast.LENGTH_LONG).show();
                    }
                }
                else if(i==3)
                {
                    if (acc_nm.equals("") || unm.equals("") || pwd.equals("") || unset_1.equals("") || unset_2.equals(""))
                    {
                        Toast.makeText(getApplicationContext(), "Please Enter Credentials", Toast.LENGTH_LONG).show();
                    }
                }
                else if(i==4)
                {
                    if (acc_nm.equals("") || unm.equals("") || pwd.equals("") || unset_1.equals("") || unset_2.equals("") || unset_3.equals(""))
                    {
                        Toast.makeText(getApplicationContext(), "Please Enter Credentials", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
