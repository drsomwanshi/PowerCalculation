package com.example.powercalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void fun1(View view) {

        EditText t1=findViewById(R.id.txt1);
        EditText t2=findViewById(R.id.txt2);
        EditText t3=findViewById(R.id.txt3);
        int n1= Integer.parseInt(t1.getText().toString());
        int n2= Integer.parseInt(t2.getText().toString());
        int p=1;
        for(int i=0;i<n2;i++)
        {
            p=p*n1;
        }
        t3.setText("Power=" + p);



    }
}