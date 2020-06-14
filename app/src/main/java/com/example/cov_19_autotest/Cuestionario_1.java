package com.example.cov_19_autotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Cuestionario_1 extends AppCompatActivity {

    String dato;
    int puntuaje=0,preg1=0,preg2=0,preg3=0,preg4=0,preg5=0,preg6=0,pregi7=0,preg8=0,preg9=0,preg10=0,preg12=0,preg11=0,preg13=0,preg14=0;
    CheckBox p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15;
    ScrollView contenedor;
    TextView puntos;
    RadioButton si,no,nose;
    private Button btn;
    private AnimationDrawable animacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario_1);
        this.btn=findViewById(R.id.button);
        animacion=(AnimationDrawable)btn.getBackground();
        animacion.setEnterFadeDuration(2300);
        animacion.setExitFadeDuration(2300);
        p1=(CheckBox)findViewById(R.id.checkBox2);
        p2=(CheckBox)findViewById(R.id.checkBox3);
        p3=(CheckBox)findViewById(R.id.checkBox4);
        p4=(CheckBox)findViewById(R.id.checkBox5);
        p5=(CheckBox)findViewById(R.id.checkBox6);
        p6=(CheckBox)findViewById(R.id.checkBox7);
        p7=(CheckBox)findViewById(R.id.checkBox8);
        p8=(CheckBox)findViewById(R.id.checkBox9);
        p9=(CheckBox)findViewById(R.id.checkBox10);
        p10=(CheckBox)findViewById(R.id.checkBox11);
        p11=(CheckBox)findViewById(R.id.checkBox12);
        p12=(CheckBox)findViewById(R.id.checkBox13);
        p13=(CheckBox)findViewById(R.id.checkBox14);
        p14=(CheckBox)findViewById(R.id.checkBox15);
        contenedor = (ScrollView)findViewById(R.id.scrollView2);
        //puntos=(TextView)findViewById(R.id.textView5);
        si=(RadioButton)findViewById(R.id.rbsi);
        no=(RadioButton)findViewById(R.id.rbno);
        nose=(RadioButton)findViewById(R.id.rbnose);
    }
    @Override
    protected void onResume() {
        super.onResume();
        if(animacion!=null && !animacion.isRunning()) animacion.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(animacion!=null && animacion.isRunning()) {animacion.stop();}
    }

    public void finalizar(View view)
    {
        respuesta();
        Intent i = new Intent(this,Registro.class);
        i.putExtra("vdato",dato);
        startActivity(i);
        //respuesta();


    }

    private void respuesta()
    {
        //convulsiones
        if(p1.isChecked())
        {
            preg1=2;
        }
        else
        {
            preg1=0;
        }
        //escurrimiento nasal
        if(p2.isChecked())
        {
            preg2=2;
        }
        else
        {
            preg2=0;
        }
        //dolor de estomago
        if(p3.isChecked())
        {
            preg3=2;
        }
        else
        {
            preg3=0;
        }
        //escalofrios
        if(p4.isChecked())
        {
            preg4=5;
        }
        else
        {
            preg4=0;
        }
        //dolor de garganta
        if(p5.isChecked())
        {
            preg5=5;
        }
        else
        {
            preg5=0;
        }
        //malestar general
        if(p6.isChecked())
        {
            preg6=5;
        }
        else
        {
            preg6=0;
        }
        //vomito
        if(p7.isChecked())
        {
            pregi7=2;
        }
        else
        {
            pregi7=0;
        }
        //diarrea
        if(p8.isChecked())
        {
            preg8=5;
        }
        else
        {
            preg8=0;
        }
        //irritabilidad
        if(p9.isChecked())
        {
            preg9=5;
        }
        else
        {
            preg9=0;
        }
        //dolor de pecho
        if(p10.isChecked())
        {
            preg10=7;
        }
        else
        {
            preg10=0;
        }
        //tos seca
        if(p11.isChecked())
        {
            preg11=7;
        }
        else
        {
            preg11=0;
        }
        //fiebre mayor a 38°
        if(p12.isChecked())
        {
            preg12=7;
        }
        else
        {
            preg12=0;
        }
        //dificultad para respirar
        if(p13.isChecked())
        {
            preg13=7;
        }
        else
        {
            preg13=0;
        }
        //dolor de cabeza
        if(p14.isChecked())
        {
            preg14=5;
        }
        else
        {
            preg14=0;
        }
        puntuaje = preg1+preg2+preg3+preg4+preg5+preg6+pregi7+preg8+preg9+preg10+preg11+preg12+preg13+preg14;
        //puntos.setText(puntuaje+" ");
        //Toast.makeText(this,"Puntaje acumulado"+puntuaje,Toast.LENGTH_SHORT).show();
        if(si.isChecked() == false && no.isChecked()==false&&nose.isChecked()==false)
        {
            Toast.makeText(this,"Responda la ultima pregunta por favor",Toast.LENGTH_SHORT).show();
        }
        if(puntuaje>25)
        {
            if(si.isChecked())
            {
                //Toast.makeText(this,"Posible caso sospechoso con sintomas de gravedad",Toast.LENGTH_SHORT).show();
                dato= "Posible caso sospechoso con sintomas de gravedad";

            }
            if(no.isChecked())
            {
                //Toast.makeText(this,"Posible caso sospechoso con sintomas de gravedad",Toast.LENGTH_SHORT).show();
                dato= "Posible caso sospechoso con sintomas de gravedad";

            }
            if(nose.isChecked())
            {
                //Toast.makeText(this,"Posible caso sospechoso con sintomas de gravedad",Toast.LENGTH_SHORT).show();
                dato= "Posible caso sospechoso con sintomas de gravedad";

            }
        }
        if(puntuaje<25)
        {
            if(si.isChecked())
            {
                //Toast.makeText(this,"Hay probabilidad de que seas un caso sospechoso",Toast.LENGTH_SHORT).show();
                dato= "Hay probabilidad de que seas un caso sospechoso";

            }
            if(no.isChecked())
            {
                //Toast.makeText(this,"No eres un caso sospechoso",Toast.LENGTH_SHORT).show();
                dato= "No eres un caso sospechoso";
            }
            if(nose.isChecked())
            {
                //Toast.makeText(this,"No es un caso sospechoso",Toast.LENGTH_SHORT).show();
                dato= "No es un caso sospechoso";
            }
        }
        if(puntuaje==25)
        {
            if(si.isChecked())
            {
                //Toast.makeText(this,"Posible caso sospechoso con sintomas de gravedad",Toast.LENGTH_SHORT).show();
                dato= "Posible caso sospechoso con sintomas de gravedad";
            }
            if(no.isChecked())
            {
                //Toast.makeText(this,"No es caso sospechoso",Toast.LENGTH_SHORT).show();
                dato= "No es caso sospechoso";
            }
            if(nose.isChecked())
            {
                //Toast.makeText(this,"Hay probabilidad de que seas un caso sospechoso",Toast.LENGTH_SHORT).show();
                dato= "Hay probabilidad de que seas un caso sospechoso";
            }
        }
    }

}
