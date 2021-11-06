package com.example.exmaple1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LastPage extends AppCompatActivity {

    ImageView imgCars;
    TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);

        imgCars = findViewById(R.id.imageView);
        txtName = findViewById(R.id.textView2);
        int img[]= {R.drawable.kia, R.drawable.opel, R.drawable.reno,R.drawable.peugo};

        Intent intent = getIntent();

        String name = intent.getStringExtra("carName");
        int index = intent.getIntExtra("imgCar",0);
        imgCars.setImageResource(img[index]);
        txtName.setText(name);


    }
}