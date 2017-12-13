package com.slohith.findurway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity273c extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity273c);
        TextView t = (TextView) findViewById(R.id.place1);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i11 = new Intent(activity273c.this,activitytime11.class);
                startActivity(i11);
            }
        });
    }

}
