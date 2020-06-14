package com.example.cov_19_autotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity
{
    private Button btn3,btn4,btn5,btn6;
    private AnimationDrawable animacio,anim,anim4,anim5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
        animacio=(AnimationDrawable)btn3.getBackground();
        animacio.setEnterFadeDuration(2300);
        animacio.setExitFadeDuration(2300);
        anim4=(AnimationDrawable)btn4.getBackground();
        anim4.setEnterFadeDuration(2300);
        anim4.setExitFadeDuration(2300);
        anim=(AnimationDrawable)btn5.getBackground();
        anim.setEnterFadeDuration(2300);
        anim.setExitFadeDuration(2300);
        anim5=(AnimationDrawable)btn6.getBackground();
        anim5.setEnterFadeDuration(2300);
        anim5.setExitFadeDuration(2300);

    }
    @Override
    protected void onResume() {
        super.onResume();
        if(animacio!=null && !animacio.isRunning()) animacio.start();
        if(animacio!=null && !anim.isRunning()) anim.start();
        if(animacio!=null && !anim4.isRunning()) anim4.start();
        if(animacio!=null && !anim5.isRunning()) anim5.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        if(animacio!=null && animacio.isRunning()) {animacio.stop();}
        if(animacio!=null && anim.isRunning()){ anim.stop();}
        if(animacio!=null && !anim4.isRunning()) anim4.start();
        if(animacio!=null && !anim5.isRunning()) anim5.start();
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

