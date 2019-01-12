package com.example.husain.accountsapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class getAllRecordAdapterActivity extends BaseAdapter {


    Context con;
    ArrayList<HashMap<String,String>> list;
    LayoutInflater li;
    public getAllRecordAdapterActivity(HomeActivity homeactivity, ArrayList<HashMap<String, String>> array)
    {
        con = homeactivity;
        list = array;
        li = (LayoutInflater)con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount()
    {
        return list.size();
    }

    @Override
    public Object getItem(int position)
    {
        return list.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = li.inflate(R.layout.activity_get_all_record,null);
        TextView tv_list = (TextView)convertView.findViewById(R.id.tv_acc_nm);
        HashMap<String, String> map = list.get(position);
        String acc_nm = map.get("my_title");
        tv_list.setText(acc_nm);

        return convertView;
    }
}
