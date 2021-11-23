package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2,t3;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3 =findViewById(R.id.t3);
        intent=getIntent();
        Bundle extras=intent.getExtras();
        String n1=extras.getString("num1");
        String n2=extras.getString("num2");
        String res=extras.getString("sum");

        t1.setText("Num1 is : "+n1);
        t2.setText("Num2 is : "+n2);
        t3.setText("Sum : "+res);


    }
}