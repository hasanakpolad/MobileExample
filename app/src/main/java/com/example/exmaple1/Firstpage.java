package com.example.exmaple1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Firstpage extends AppCompatActivity {

    ListView lstCars;
    ImageView imgCars;
    TextView txtCars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        lstCars = findViewById(R.id.lstCars);
        imgCars = findViewById(R.id.imgCars);
        txtCars = findViewById(R.id.txtCars);

        String cars[] = {"Kia","Opel","Renault","Peugeot"};
        int img[]= {R.drawable.kia, R.drawable.opel, R.drawable.reno,R.drawable.peugo};

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cars);
        lstCars.setAdapter(adp);

        Intent last = new Intent(Firstpage.this, LastPage.class);

        lstCars.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String carName = cars[position];
               int imgCar = img[position];

                last.putExtra("imgCar",position);
                last.putExtra("carName",cars[position]);
               startActivity(last);
               /*txtCars.setText(cars[position].toString());
                imgCars.setImageResource(img[position]);*/

            }
        });


    }

}