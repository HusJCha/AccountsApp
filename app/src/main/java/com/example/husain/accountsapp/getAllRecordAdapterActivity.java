package com.example.husain.accountsapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class getAllRecordAdapterActivity extends BaseAdapter {


    Context con;
    ArrayList<HashMap<String,Object>> list;
    LayoutInflater li;
    public getAllRecordAdapterActivity(HomeActivity homeactivity, ArrayList<HashMap<String, Object>> array)
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
        TextView tv_title = (TextView)convertView.findViewById(R.id.txt_list);

        HashMap<String, Object> map = list.get(position);
        String str_name = map.get("my_title").toString();

        tv_title.setText(str_name);

        return convertView;
    }
}
