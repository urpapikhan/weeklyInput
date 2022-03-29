package com.example.weeklyinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WeeklyReport extends AppCompatActivity {
    TextView textView,textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13;
    float g,g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_report);
        textView=(TextView) findViewById(R.id.textView);
        textView1=(TextView) findViewById(R.id.textView1);
        textView2=(TextView) findViewById(R.id.textView2);
        textView3=(TextView) findViewById(R.id.textView3);
        textView4=(TextView) findViewById(R.id.textView4);
        textView5=(TextView) findViewById(R.id.textView5);
        textView6=(TextView) findViewById(R.id.textView6);
        textView7=(TextView) findViewById(R.id.textView7);
        textView8=(TextView) findViewById(R.id.textView8);
        textView9=(TextView) findViewById(R.id.textView9);
        textView10=(TextView) findViewById(R.id.textView10);
        textView11=(TextView) findViewById(R.id.textView11);
        textView12=(TextView) findViewById(R.id.textView12);
        textView13=(TextView) findViewById(R.id.textView13);
        Intent recInt=getIntent();

        textView.setText(""+recInt.getFloatExtra("0",g));
        textView1.setText(""+recInt.getFloatExtra("1",g1));
        textView2.setText(""+recInt.getFloatExtra("2",g2));
        textView3.setText(""+recInt.getFloatExtra("3",g3));
        textView4.setText(""+recInt.getFloatExtra("4",g4));
        textView5.setText(""+recInt.getFloatExtra("5",g5));
        textView6.setText(""+recInt.getFloatExtra("6",g6));
        textView7.setText(""+recInt.getFloatExtra("7",g7));
        textView8.setText(""+recInt.getFloatExtra("8",g8));
        textView9.setText(""+recInt.getFloatExtra("9",g9));
        textView10.setText(""+recInt.getFloatExtra("10",g10));
        textView11.setText(""+recInt.getFloatExtra("11",g11));
        textView12.setText(""+recInt.getFloatExtra("12",g12));
        textView13.setText(""+recInt.getFloatExtra("13",g13));

    }
}

