package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton radioButton1, radioButton2, radioButton3;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = findViewById(R.id.rbAn);
        radioButton2 = findViewById(R.id.rbWeb);
        radioButton3 = findViewById(R.id.rbApi);
        imageView = findViewById(R.id.ivShowimg);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rbAn :
                imageView.setImageResource(R.drawable.a);
                break;
            case R.id.rbWeb :
                imageView.setImageResource(R.drawable.b);
                break;
            case R.id.rbApi :
                imageView.setImageResource(R.drawable.c);
                break;
        }
    }
}
