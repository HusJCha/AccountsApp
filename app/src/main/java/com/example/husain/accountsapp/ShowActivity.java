package com.example.husain.accountsapp;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ShowActivity extends AppCompatActivity {

    Button btn_aaf,btn_aaf_unset_1,btn_aaf_unset_2,btn_check,btn_edit,btn_delete;
    int i=1;
    TextView tv_unset_1,tv_unset_2,tv_unset_3;
    EditText ed_unset_1,ed_unset_2,ed_unset_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        btn_aaf=(Button)findViewById(R.id.btn_aaf);
        tv_unset_1 = (TextView)findViewById(R.id.tv_unset_1);
        tv_unset_2 = (TextView)findViewById(R.id.tv_unset_2);
        tv_unset_3 = (TextView)findViewById(R.id.tv_unset_3);
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
                final Dialog d= new Dialog(ShowActivity.this);
                d.setContentView(R.layout.aaf_alert_box);
                Button btn_ok = (Button)d.findViewById(R.id.btn_ok);
                Button btn_cancel = (Button)d.findViewById(R.id.btn_cancel);
                final EditText ed_field = (EditText)d.findViewById(R.id.ed_field);
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
                                btn_aaf.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 2) {
                                tv_unset_2.setVisibility(View.VISIBLE);
                                tv_unset_2.setText(field);
                                ed_unset_2.setVisibility(View.VISIBLE);
                                ed_unset_2.setHint("Enter " + field);
                                btn_aaf_unset_2.setVisibility(View.VISIBLE);
                                btn_aaf.setVisibility(View.GONE);
                                btn_aaf_unset_1.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 3) {
                                tv_unset_3.setVisibility(View.VISIBLE);
                                tv_unset_3.setText(field);
                                ed_unset_3.setVisibility(View.VISIBLE);
                                ed_unset_3.setHint("Enter " + field);
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
                Button btn_ok = (Button)d.findViewById(R.id.btn_ok);
                Button btn_cancel = (Button)d.findViewById(R.id.btn_cancel);
                final EditText ed_field = (EditText)d.findViewById(R.id.ed_field);
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
                                btn_aaf.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 2) {
                                tv_unset_2.setVisibility(View.VISIBLE);
                                tv_unset_2.setText(field);
                                ed_unset_2.setVisibility(View.VISIBLE);
                                ed_unset_2.setHint("Enter " + field);
                                btn_aaf_unset_2.setVisibility(View.VISIBLE);
                                btn_aaf.setVisibility(View.GONE);
                                btn_aaf_unset_1.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 3) {
                                tv_unset_3.setVisibility(View.VISIBLE);
                                tv_unset_3.setText(field);
                                ed_unset_3.setVisibility(View.VISIBLE);
                                ed_unset_3.setHint("Enter " + field);
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
                Button btn_ok = (Button)d.findViewById(R.id.btn_ok);
                Button btn_cancel = (Button)d.findViewById(R.id.btn_cancel);
                final EditText ed_field = (EditText)d.findViewById(R.id.ed_field);
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
                                btn_aaf.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 2) {
                                tv_unset_2.setVisibility(View.VISIBLE);
                                tv_unset_2.setText(field);
                                ed_unset_2.setVisibility(View.VISIBLE);
                                ed_unset_2.setHint("Enter " + field);
                                btn_aaf_unset_2.setVisibility(View.VISIBLE);
                                btn_aaf.setVisibility(View.GONE);
                                btn_aaf_unset_1.setVisibility(View.GONE);
                                i++;
                                d.hide();
                            } else if (i == 3) {
                                tv_unset_3.setVisibility(View.VISIBLE);
                                tv_unset_3.setText(field);
                                ed_unset_3.setVisibility(View.VISIBLE);
                                ed_unset_3.setHint("Enter " + field);
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
    }
}
