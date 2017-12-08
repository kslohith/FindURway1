package com.slohith.findurway;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.slohith.findurway.data.busdata;
import com.slohith.findurway.data.busdatabase;

public class MainActivity extends AppCompatActivity {

    busdatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new busdatabase(this);
        insertdata();
        displaydata();

    }
    public void displaydata()
    {  SQLiteDatabase dbo = db.getReadableDatabase();
        String[] projection = {
                busdata.busentry.P_1,
                busdata.busentry.P_2,
                busdata.busentry.P_3,
                busdata.busentry.P_4,
                busdata.busentry.P_5};
        Cursor cursor = dbo.query(
                busdata.busentry.table_name,   // The table to query
                projection,            // The columns to return
                null,                  // The columns for the WHERE clause
                null,                  // The values for the WHERE clause
                null,                  // Don't group the rows
                null,                  // Don't filter by row groups
                null);
        TextView display = (TextView) findViewById(R.id.text1);
        try {
            // Create a header in the Text View that looks like this:
            //
            // The pets table contains <number of rows in Cursor> pets.
            // _id - name - breed - gender - weight
            //
            // In the while loop below, iterate through the rows of the cursor and display
            // the information from each column in this order.
            display.setText( "ROUTE MAP" );
            display.append(busdata.busentry.P_1 + " - " +
                    busdata.busentry.P_2 + " - " +
                    busdata.busentry.P_3 + " - " +
                    busdata.busentry.P_4 + " - " +
                    busdata.busentry.P_5 + "\n");

            // Figure out the index of each column
            int p1Index = cursor.getColumnIndex(busdata.busentry.P_1);
            int p2Index = cursor.getColumnIndex(busdata.busentry.P_2);
            int p3Index = cursor.getColumnIndex(busdata.busentry.P_3);
            int p4Index = cursor.getColumnIndex(busdata.busentry.P_4);
            int p5Index = cursor.getColumnIndex(busdata.busentry.P_5);

            // Iterate through all the returned rows in the cursor
            while (cursor.moveToNext()) {
                // Use that index to extract the String or Int value of the word
                // at the current row the cursor is on.
                String P_1 = cursor.getString(p1Index);
                String P_2 = cursor.getString(p2Index);
                String P_3 = cursor.getString(p3Index);
                String P_4 = cursor.getString(p4Index);
                String P_5 = cursor.getString(p5Index);
                // Display the values from each column of the current row in the cursor in the TextView
                display.append(("\n" + P_1 + " - " +
                        P_2 + " - " +
                        P_3 + " - " +
                        P_4 + " - " +
                        P_5));
            }
        } finally {
            // Always close the cursor when you're done reading from it. This releases all its
            // resources and makes it invalid.
            cursor.close();
        }
    }


    private void insertdata() {
        SQLiteDatabase s = db.getWritableDatabase();
        ContentValues view = new ContentValues();
        view.put(busdata.busentry.bus_no, "401");
        view.put(busdata.busentry.P_1, "Yelahanka");
        view.put(busdata.busentry.P_2, "M S Palya");
        view.put(busdata.busentry.P_3, "B E L Circle");
        view.put(busdata.busentry.P_4, "Ramaiah College");
        view.put(busdata.busentry.P_5, "Yeshwantpur");
        s.insert(busdata.busentry.table_name, null, view);

        ContentValues view1 = new ContentValues();
        view.put(busdata.busentry.bus_no, "401 K");
        view.put(busdata.busentry.P_1, "Yelahanka");
        view.put(busdata.busentry.P_2, "Vidyaranyapura");
        view.put(busdata.busentry.P_3, "B E L Circle");
        view.put(busdata.busentry.P_4, "Yeshwantpur");
        view.put(busdata.busentry.P_5, "Kengeri");
        s.insert(busdata.busentry.table_name, null, view1);

        ContentValues view2 = new ContentValues();
        view.put(busdata.busentry.bus_no, "401 B");
        view.put(busdata.busentry.P_1, "Yelahanka");
        view.put(busdata.busentry.P_2, "Vidyaranyapura");
        view.put(busdata.busentry.P_3, "B E L Circle");
        view.put(busdata.busentry.P_4, "Yeshwantpur");
        view.put(busdata.busentry.P_5, "Hampinagar");
        s.insert(busdata.busentry.table_name, null, view2);

        ContentValues view3 = new ContentValues();
        view.put(busdata.busentry.bus_no, "401 BR");
        view.put(busdata.busentry.P_1, "Yelahanka");
        view.put(busdata.busentry.P_2, "Vidyaranyapura");
        view.put(busdata.busentry.P_3, "B E L Circle");
        view.put(busdata.busentry.P_4, "Ramaiah College");
        view.put(busdata.busentry.P_5, "Yeshwantpur");
        s.insert(busdata.busentry.table_name, null, view3);


    }
}