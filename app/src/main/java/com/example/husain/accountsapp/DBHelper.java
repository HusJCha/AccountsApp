package com.example.husain.accountsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.HashMap;

/**
 * Created by Husain on 1/10/2019.
 */

public class DBHelper extends SQLiteOpenHelper
{
    Context con;
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, factory, version);
        con = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String query = "create table acc(acc_nm VARCHAR , unm VARCHAR , pwd VARCHAR , usfn_1 VARCHAR , usfn_2 VARCHAR , usfn_3 VARCHAR , usfv_1 VARCHAR , usfv_2 VARCHAR , usfv_3 VARCHAR , status INTEGER)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        String query="drop table acc if exist";
        db.execSQL(query);
        onCreate(db);
    }

    public boolean insert(HashMap<String,String> Map , Integer count)
    {
        SQLiteDatabase db = getWritableDatabase();
        Integer i = count;
        Integer status = 1;
        String acc_nm,unm,pwd,usfn_1,usfn_2,usfn_3,usfv_1,usfv_2,usfv_3;
        acc_nm = Map.get("acc_nm");
        unm = Map.get("unm");
        pwd = Map.get("pwd");
        if(count == 1)
        {
            ContentValues cv = new ContentValues();
            cv.put("acc_nm",acc_nm);
            cv.put("unm",unm);
            cv.put("pwd",pwd);
            cv.put("status",status);
            long result=db.insert("acc",null,cv);
            if(result==-1)
            {
                Toast.makeText(con,"no",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(con,"yes",Toast.LENGTH_SHORT).show();
            }
        }
        db.close();
        return true;
    }
}
