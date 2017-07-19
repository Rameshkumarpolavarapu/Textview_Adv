package com.example.ramesh.textview_adv;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Patter_TextView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patter_text_view);
        TextView textView = (TextView) findViewById(R.id.textView2);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sdfsdf);
        Shader shader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        textView.getPaint().setShader(shader);
    }
}
