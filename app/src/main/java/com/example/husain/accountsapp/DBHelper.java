package com.example.husain.accountsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;
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
        usfn_1=Map.get("usfn_1");
        usfv_1=Map.get("usfv_1");
        usfn_2=Map.get("usfn_2");
        usfv_2=Map.get("usfv_2");
        usfn_3=Map.get("usfn_3");
        usfv_3=Map.get("usfv_3");
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
                return false;
            }
            else
            {
                return true;
            }
        }
        else if(count == 2)
        {
            ContentValues cv = new ContentValues();
            cv.put("acc_nm",acc_nm);
            cv.put("unm",unm);
            cv.put("pwd",pwd);
            cv.put("usfn_1",usfn_1);
            cv.put("usfv_1",usfv_1);
            cv.put("status",status);
            long result=db.insert("acc",null,cv);
            if(result==-1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else if(count == 3)
        {
            ContentValues cv = new ContentValues();
            cv.put("acc_nm",acc_nm);
            cv.put("unm",unm);
            cv.put("pwd",pwd);
            cv.put("usfn_1",usfn_1);
            cv.put("usfv_1",usfv_1);
            cv.put("usfn_2",usfn_2);
            cv.put("usfv_2",usfv_2);
            cv.put("status",status);
            long result=db.insert("acc",null,cv);
            if(result==-1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else if(count == 4)
        {
            ContentValues cv = new ContentValues();
            cv.put("acc_nm",acc_nm);
            cv.put("unm",unm);
            cv.put("pwd",pwd);
            cv.put("usfn_1",usfn_1);
            cv.put("usfv_1",usfv_1);
            cv.put("usfn_2",usfn_2);
            cv.put("usfv_2",usfv_2);
            cv.put("usfn_3",usfn_3);
            cv.put("usfv_3",usfv_3);
            cv.put("status",status);
            long result=db.insert("acc",null,cv);
            if(result==-1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        db.close();
        return true;
    }

    public ArrayList<HashMap<String,String>> getAllRecord()
    {
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String, String>>();
        String query = "select * from acc";
        Cursor c = db.rawQuery(query,null);
        if(c.moveToFirst())
        {
            do
            {
                String acc_nm = c.getString(0);
                HashMap<String,String> map = new HashMap<String,String>();
                map.put("acc_nm",acc_nm);
                list.add(map);
            }while(c.moveToNext());
        }
        db.close();
        return list;
    }

    public HashMap<String,String> getRecord(String acc_nm)
    {
        SQLiteDatabase db = getReadableDatabase();
        HashMap<String,String> map = new HashMap<String, String>();
        String query = "select * from acc where acc_nm = '" + acc_nm + "'";
        Cursor c = db.rawQuery(query,null);
        if(c.moveToFirst())
        {
            do
            {
                String get_acc_nm = c.getString(0);
                String unm=c.getString(1);
                String pwd=c.getString(2);
                map.put("acc_nm",get_acc_nm);
                map.put("unm",unm);
                map.put("pwd",pwd);
            }while (c.moveToNext());
        }
        return map;
    }
}
