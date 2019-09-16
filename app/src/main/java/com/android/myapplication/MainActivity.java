package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText in1;
    private EditText in2;
    private Button add;
    private Button add2;
    private Button add3;
    private Button add4;
    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in1 = (EditText) findViewById(R.id.in1);
        in2 = (EditText) findViewById(R.id.in2);
        add = (Button) findViewById(R.id.add);
        add2 = (Button) findViewById(R.id.add2);
        add3 = (Button) findViewById(R.id.add3);
        add4 = (Button) findViewById(R.id.add4);
        txt1 = (TextView) findViewById(R.id.txt1);

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View View) {
                int x = Integer.parseInt(in1.getText().toString());
                int y = Integer.parseInt(in2.getText().toString());

                int result = (x + y);
                txt1.setText(String.valueOf(result));

            }
        });
         add.setOnClickListener (new View.OnClickListener() {

             @Override
             public void onClick(View View) {
                 int x = Integer.parseInt(in1.getText().toString());
                 int y = Integer.parseInt(in2.getText().toString());

                 int result = (x - y);
                 txt1.setText(String.valueOf(result));
             }
         });
            add2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int x = Integer.parseInt(in1.getText().toString());
                    int y = Integer.parseInt(in2.getText().toString());

                    int result = (x*y);
                    txt1.setText(String.valueOf(result));
                }
            });
            add3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int x= Integer.parseInt(in1.getText().toString());
                    int y = Integer.parseInt(in2.getText().toString());

                    int result = (x/y);
                    txt1.setText(String.valueOf(result));
                }
            });
         }
    }


