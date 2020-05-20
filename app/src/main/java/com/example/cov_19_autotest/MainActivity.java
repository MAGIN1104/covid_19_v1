package com.example.cov_19_autotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnDataCovid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDataCovid=findViewById(R.id.btnData);
        //Asignamos el evento click
        btnDataCovid.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intentdata = new Intent(this, DatosCovid.class);
        startActivity(intentdata);
    }
}
