package com.slohith.findurway;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity extends AppCompatActivity {
  Button but;
  EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
         but = (Button) findViewById(R.id.numberbutton);
         num = (EditText) findViewById(R.id.number);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                busread();
            }
        });

    }
    public void busread()
    {
        String busnumber = num.getText().toString().trim();
           if( busnumber.compareToIgnoreCase("401") == 0)
           {
               Intent i1 = new Intent(activity.this,activity401.class);
               startActivity(i1);
           }
           else if( busnumber.compareToIgnoreCase("401 K") == 0 )
           {
               Intent i2 = new Intent(activity.this,activity401k.class);
               startActivity(i2);
           }
           else if( busnumber.compareToIgnoreCase("401 B") == 0 )
           {
               Intent i3 = new Intent(activity.this,activity401b.class);
               startActivity(i3);
           }
           else if( busnumber.compareToIgnoreCase("273 C") == 0 )
           {
               Intent i4 = new Intent(activity.this,activity273c.class);
               startActivity(i4);
           }
           else if( busnumber.compareToIgnoreCase("402 B") == 0 )
           {
               Intent i5 = new Intent(activity.this,activity402b.class);
               startActivity(i5);
           }
           else if( busnumber.compareToIgnoreCase("273") == 0 )
           {
               Intent i6 = new Intent(activity.this,activity273.class);
               startActivity(i6);
           }
           else if( busnumber.compareToIgnoreCase("276") == 0 )
           {
               Intent i7 = new Intent(activity.this,activity276.class);
               startActivity(i7);
           }
           else
           {
               Toast.makeText(this,"App still in development phase.All routes will be available soon",Toast.LENGTH_LONG).show();
           }

    }

}
