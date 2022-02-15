package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onNameButtonClick(View view)
    {
        // выводим сообщение
        Button button = (Button) findViewById(R.id.name);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText("Burnashev");
                Toast.makeText(getApplicationContext(), "I changed my First name", Toast.LENGTH_LONG).show();
                Snackbar.make(view, R.string.btn_text,  Snackbar.LENGTH_SHORT).show();
            }
        });


    }

    public void onLogoButtonClick(View view)
    {
        // выводим сообщение
        Button button = (Button) findViewById(R.id.name);
        ImageButton imgbtn = (ImageButton) findViewById(R.id.logo);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText("Veniamin");
                Toast.makeText(MainActivity.this, "I changed my Lastname", Toast.LENGTH_SHORT).show();
                Snackbar.make(view, R.string.imgbtn_text,  Snackbar.LENGTH_SHORT).show();
            }
        });


    }


}