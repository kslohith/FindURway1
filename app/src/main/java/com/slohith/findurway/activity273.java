package com.slohith.findurway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class activity273 extends AppCompatActivity {
    TextView t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity273);

     t1 = (TextView) findViewById(R.id.place1);
        t1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t1.getText().toString();
         display(name,63 );
            t1.setVisibility(view.INVISIBLE);

        }
    });
    t2 = (TextView) findViewById(R.id.place2);
        t2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t2.getText().toString();
           display(name,60);
            t3.setVisibility(view.INVISIBLE);
        }
    });
    t3 = (TextView) findViewById(R.id.place3);
        t3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t3.getText().toString();
            display(name,57);
            t3.setVisibility(view.INVISIBLE);
        }
    });
    t4 = (TextView) findViewById(R.id.place4);
        t4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t4.getText().toString();
           display(name,53);
            t4.setVisibility(view.INVISIBLE);
        }
    });
    t5 = (TextView) findViewById(R.id.place5);
        t5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t5.getText().toString();
           display(name,50);
            t5.setVisibility(view.INVISIBLE);
        }
    });
    t6 = (TextView) findViewById(R.id.place6);
        t6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t6.getText().toString();
           display(name,47);
            t6.setVisibility(view.INVISIBLE);
        }
    });
    t7 = (TextView) findViewById(R.id.place7);
        t7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t7.getText().toString();
           display(name,44);
            t7.setVisibility(view.INVISIBLE);
        }
    });
    t8 = (TextView) findViewById(R.id.place8);
        t8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t8.getText().toString();
           display(name,41);
            t8.setVisibility(view.INVISIBLE);
        }
    });
    t9 = (TextView) findViewById(R.id.place9);
        t9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t9.getText().toString();
            display(name,38);
            t9.setVisibility(view.INVISIBLE);
        }
    });
    t10 = (TextView) findViewById(R.id.place10);
        t10.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t10.getText().toString();
           display(name,35);
            t10.setVisibility(view.INVISIBLE);
        }
    });
    t11 = (TextView) findViewById(R.id.place11);
        t11.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t11.getText().toString();
           display(name,31);
            t11.setVisibility(view.INVISIBLE);
        }
    });
    t12 = (TextView) findViewById(R.id.place12);
        t12.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t12.getText().toString();
          display(name,28);
            t12.setVisibility(view.INVISIBLE);
        }
    });
    t13 = (TextView) findViewById(R.id.place13);
        t13.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t13.getText().toString();
           display(name,25);
            t13.setVisibility(view.INVISIBLE);
        }
    });
    t14 = (TextView) findViewById(R.id.place14);
        t14.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t14.getText().toString();
           display(name,21);
            t14.setVisibility(view.INVISIBLE);
        }
    });
    t15 = (TextView) findViewById(R.id.place15);
        t15.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t15.getText().toString();
            display(name,18);
            t15.setVisibility(view.INVISIBLE);
        }
    });
    t16 = (TextView) findViewById(R.id.place16);
        t16.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t16.getText().toString();
           display(name,12);
            t16.setVisibility(view.INVISIBLE);
        }
    });
    t17 = (TextView) findViewById(R.id.place17);
        t17.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t17.getText().toString();
           display(name,10);
            t17.setVisibility(view.INVISIBLE);
        }
    });
    t18 = (TextView) findViewById(R.id.place18);
        t18.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = t18.getText().toString();
            display(name,6);
            t18.setVisibility(view.INVISIBLE);
        }
    });
        t19 = (TextView) findViewById(R.id.place19);
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = t19.getText().toString();
                display(name,3);
                t19.setVisibility(view.INVISIBLE);
            }
        });
        t = (TextView) findViewById(R.id.place20);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = t.getText().toString();
                display(name,1);
            }
        });
}

    private void display(String u,int j) {
        Toast.makeText(this,"The time required to travel from " + u + " " + "to the destination is" +  " " + j + " " + "minutes",Toast.LENGTH_LONG ).show();
    }

}



