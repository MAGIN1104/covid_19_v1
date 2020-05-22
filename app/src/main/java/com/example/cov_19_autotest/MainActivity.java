package com.example.cov_19_autotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
{
    ImageButton op1,op2,op3,op4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Opcion1(View view)
    {
        Intent i1 = new Intent(this, DatosCovid.class);
        startActivity(i1);

    }
    public  void Opcion2(View view)
    {
        Intent i2 = new Intent(this, Cuestionario_1.class);
        startActivity(i2);


    }
    public void Opcion3(View view)
    {
        Intent i3 = new Intent(this, Recomendaciones.class);
        startActivity(i3);


    }
    public void Opcion4(View view)
    {
        Intent i4 = new Intent(this, Contactos.class);
        startActivity(i4);

    }
}

