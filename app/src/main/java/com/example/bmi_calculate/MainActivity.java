package com.example.bmi_calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runLogin(View view) {
        DecimalFormat nf = new DecimalFormat("0.00");
        EditText fieldheight = (EditText)findViewById(R.id.height);
        EditText fieldweight = (EditText)findViewById(R.id.weight);
        //身高
        double height = Double.parseDouble(fieldheight.getText().toString())/100;
        //體重
        double weight = Double.parseDouble(fieldweight.getText().toString());
        //計算出BMI值
        double BMI = weight / (height*height);

        //結果
        TextView result = (TextView)findViewById(R.id.BMI_calculate);
        result.setText(nf.format(BMI));

    }

}