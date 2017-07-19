package com.example.ramesh.textview_adv;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);


    }


    public void mutlicolor(View view) {
        startActivity(new Intent(this,MultiColor_TextView.class));
        }


    public void patter(View view) {
        startActivity(new Intent(this,Patter_TextView.class));
    }

    public void shadow(View view) {
        startActivity(new Intent(this,Shadow_TextView .class));

    }
}
