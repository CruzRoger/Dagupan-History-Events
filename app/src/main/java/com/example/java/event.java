package com.example.java;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class event extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        getSupportActionBar().setTitle("Events in Dagupan");
        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        ImageButton imageButton6 = findViewById(R.id.imageButton6);



        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);


        }
        @Override
        public void onClick(View v) {
        switch (v.getId()){
        case R.id.imageButton1:
        Intent intent1=new Intent(event.this,pic1.class);
        startActivity(intent1);
        break;
        case R.id.imageButton2:
        Intent intent2=new Intent(event.this,pic2.class);
        startActivity(intent2);
        break;
        case R.id.imageButton3:
        Intent intent3=new Intent(event.this,pic3.class);
        startActivity(intent3);
        break;
        case R.id.imageButton4:
        Intent intent4=new Intent(event.this,pic4.class);
        startActivity(intent4);
        break;
        case R.id.imageButton5:
        Intent intent5=new Intent(event.this,pic5.class);
        startActivity(intent5);
        break;
        case R.id.imageButton6:
        Intent intent6=new Intent(event.this,pic6.class);
        startActivity(intent6);
        break;
        }
    }
}