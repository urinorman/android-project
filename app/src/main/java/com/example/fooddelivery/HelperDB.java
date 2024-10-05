package com.example.fooddelivery;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class HelperDB extends SQLiteOpenHelper {





    public static final String DB_FILE = "lesson_in_chemistry.db";
    public static final String USERS_TABLE = "Users";
    public static final String USER_NAME = "UserName";
    public static final String USER_PWD = "UserPassword";
    public static final String USER_EMAIL= "UserEmail";
    public static final String USER_PHONE = "UserPhone";


    public HelperDB(@Nullable MainActivity context){
        super(context,DB_FILE,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(buildUserTable());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    public String buildUserTable(){
        String st = "CREATE TABLE IF NOT EXISTS " + USERS_TABLE;
        st+="("+USER_NAME+"TEXT,";
        st+= USER_PWD+"TEXT, ";
        st+=USER_EMAIL+"TEXT,";
        st+= USER_PHONE+"TEXT);";

        return st;
    }


}

