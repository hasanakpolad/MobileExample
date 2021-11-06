package com.example.exmaple1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent newsPage = new Intent(MainActivity.this, Firstpage.class);

        CountDownTimer cdt = new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "Bekleme başarılı", Toast.LENGTH_SHORT).show();
                startActivity(newsPage);
            }
        };
        cdt.start();

    }
}