package com.example.weeklyinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ev, ev1, ev2, ev3, ev4, ev5, ev6, ev7, ev8, ev9, ev10, ev11, ev12, ev13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ev = findViewById(R.id.ev);
        ev1 = findViewById(R.id.ev1);
        ev2 = findViewById(R.id.ev2);
        ev3 = findViewById(R.id.ev3);
        ev4 = findViewById(R.id.ev4);
        ev5 = findViewById(R.id.ev5);
        ev6 = findViewById(R.id.ev6);
        ev7 = findViewById(R.id.ev7);
        ev8 = findViewById(R.id.ev8);
        ev9 = findViewById(R.id.ev9);
        ev10 = findViewById(R.id.ev10);
        ev11 = findViewById(R.id.ev11);
        ev12 = findViewById(R.id.ev12);
        ev13 = findViewById(R.id.ev13);




    }

    public void Compute(View view) {
        if(
                ev13.getText().toString().isEmpty() ||
                ev12.getText().toString().isEmpty() ||
                ev11.getText().toString().isEmpty() ||
                ev10.getText().toString().isEmpty() ||
                ev.getText().toString().isEmpty() ||//check if fields are empty then tells you to fill them in if they are
                ev1.getText().toString().isEmpty() ||
                ev2.getText().toString().isEmpty() ||
                ev3.getText().toString().isEmpty() ||
                ev4.getText().toString().isEmpty() ||
                ev5.getText().toString().isEmpty() ||
                ev6.getText().toString().isEmpty() ||
                ev7.getText().toString().isEmpty() ||
                ev8.getText().toString().isEmpty() ||
                ev9.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Fill in all fields",
                    Toast.LENGTH_LONG).show();
        }else {
            float g1, g2, g3, g4, g5, g6, g7, g8, g9, g, g10, g11, g12, g13;
            g = Float.parseFloat(ev.getText().toString());
            g1 = Float.parseFloat(ev1.getText().toString());
            g2 = Float.parseFloat(ev2.getText().toString());
            g3 = Float.parseFloat(ev3.getText().toString());
            g4 = Float.parseFloat(ev4.getText().toString());
            g5 = Float.parseFloat(ev5.getText().toString());
            g6 = Float.parseFloat(ev6.getText().toString());
            g7 = Float.parseFloat(ev7.getText().toString());
            g8 = Float.parseFloat(ev8.getText().toString());
            g9 = Float.parseFloat(ev9.getText().toString());
            g10 = Float.parseFloat(ev10.getText().toString());
            g11 = Float.parseFloat(ev11.getText().toString());
            g12 = Float.parseFloat(ev12.getText().toString());
            g13 = Float.parseFloat(ev13.getText().toString());
            Intent n = new Intent(this, com.example.weeklyinput.WeeklyReport.class);
            n.putExtra("1", g1);
            n.putExtra("2", g2);
            n.putExtra("3", g3);
            n.putExtra("4", g4);
            n.putExtra("5", g5);
            n.putExtra("6", g6);
            n.putExtra("7", g7);
            n.putExtra("8", g8);
            n.putExtra("9", g9);
            n.putExtra("0", g);
            n.putExtra("10", g10);
            n.putExtra("11", g11);
            n.putExtra("12", g12);
            n.putExtra("13", g13);

            startActivity(n);
        }
    }
        }

