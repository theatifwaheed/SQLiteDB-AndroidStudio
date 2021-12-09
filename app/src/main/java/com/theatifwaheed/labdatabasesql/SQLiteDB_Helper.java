package com.theatifwaheed.labdatabasesql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SQLiteDB_Helper extends SQLiteOpenHelper {
    private static String DATABASE_NAME = "studentsdetails.db";
    private Context mainContext;
    private static int DATABASE_VERSION = 1;
    private static String TABLE_NAME = "studentinfo";

    private String query_create = "create table " + TABLE_NAME + " (std_id TEXT primary key, "+
            "std_name TEXT, std_city TEXT, std_age TEXT)";

    public SQLiteDB_Helper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Toast.makeText(context, "Database Created!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
