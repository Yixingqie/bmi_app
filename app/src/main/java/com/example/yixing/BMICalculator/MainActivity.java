//By Yixing Qie
//7/22/17
package com.example.yixing.BMICalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    EditText weight;
    EditText height;
    EditText bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "YixingQ.//7/22/17", Toast.LENGTH_SHORT).show();

        btnClick = ((Button)findViewById(R.id.btnClick));
        weight = ((EditText) findViewById(R.id.weight));
        height = ((EditText) findViewById(R.id.height)) ;
        bmi = ((EditText) findViewById(R.id.bmi));

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String weightValue = weight.getText().toString();
               Float floatweightValue = Float.parseFloat(weightValue);

               String heightValue = height.getText(). toString();
               Float floatheightValue = Float.parseFloat(heightValue);

               Float floatbmi = (floatweightValue/ floatheightValue)/ floatheightValue;
               bmi.setText (String.valueOf(floatbmi));

            }
        });




    }

}
