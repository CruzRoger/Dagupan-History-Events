package com.example.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"history makes perfect",Toast.LENGTH_SHORT).show();
                openActivity2();
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"see what on dagupan",Toast.LENGTH_SHORT).show();
                openActivity3();
            }
        });
    }
    public void openActivity2(){
        Intent intent;
        intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent;
        intent = new Intent(this, event.class);
        startActivity(intent);
    }

}