package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    TextView num2;
    Button add;
    TextView result;
    String TAG = "MainActivity";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        add =findViewById(R.id.btn);
        //result=findViewById(R.id.res);
        intent=new Intent(this,MainActivity2.class);
        Toast.makeText(getApplicationContext(),"onCreate invoked",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onCreate invoked");

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                int s;
                s=n1+n2;
                //result.setText("Result is : "+s);
                Log.i(TAG,"Number 1 is :"+n1);
                Log.i(TAG,"Number 2 is :"+n2);
                Log.i(TAG,"Sum is :"+s);

                Bundle extras=new Bundle();
                extras.putString("num1",n1+"");
                extras.putString("num2",n2+"");
                extras.putString("sum",s+"");
                intent.putExtras(extras);
                startActivity(intent);


            }
        });
    }
}