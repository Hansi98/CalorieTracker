package com.industrialmaster.calorietracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void convert(View v){
        EditText et1 = findViewById(R.id.editText1);
        EditText et2 = findViewById(R.id.editText2);
        EditText et3 = findViewById(R.id.editText3);

        String txt2 = et1.getText().toString();
        double weight = Double.parseDouble(txt2);

        String txt1 = et2.getText().toString();
        double time = Double.parseDouble(txt1);

        Double calorie = (time *5 * 3.5 * weight) / 200;

        String result = String.valueOf(calorie);
        et3.setText(result+ " kj");

    }
}