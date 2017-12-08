package com.slohith.findurway.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by K.S.LOHITH on 08-12-2017.
 */


public class busdatabase extends SQLiteOpenHelper {
    public static final String database_name = "bus";
    public static  final int database_version = 1;

    public busdatabase(Context context ) {
        super(context, database_name, null, database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_BUS_TABLE =  "CREATE TABLE" + busdata.busentry.table_name + " ("
                + busdata.busentry.bus_no + "TEXT,"
                + busdata.busentry.P_1 + " TEXT NOT NULL, "
                + busdata.busentry.P_2 + " TEXT, "
                + busdata.busentry.P_3 + " TEXT, "
                + busdata.busentry.P_4 + " TEXT,"
                + busdata.busentry.P_5 + " TEXT );";
        db.execSQL(SQL_CREATE_BUS_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}


