package com.example.cov_19_autotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class Registro extends AppCompatActivity {
    EditText nombres,apellidos,celular_telefono,direccion;
    String datosrec;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    private Button btn;
    private AnimationDrawable animacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        this.btn=findViewById(R.id.registro);
        animacion=(AnimationDrawable)btn.getBackground();
        animacion.setEnterFadeDuration(2300);
        animacion.setExitFadeDuration(2300);
        nombres=findViewById(R.id.nom_textview);
        apellidos=findViewById(R.id.ap_textview);
        celular_telefono=findViewById(R.id.cel_textview);
        direccion=findViewById(R.id.dir_textview);
        inicializarFirebase();
        datosrec =  recibirDato();

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

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();
    }

    public void Registro(View view)
    {
        String nombre = nombres.getText().toString();
        String apellido=apellidos.getText().toString();
        String celular= celular_telefono.getText().toString();
        String direc=direccion.getText().toString();
        String estado=datosrec;
        if(nombre.equals("")){
            nombres.setError("Campo Obligatorio");
        }else if(apellido.equals("")){
            apellidos.setError("Campo Obligatorio");
        }else if(celular.equals("")){
            celular_telefono.setError("Campo Obligatorio");
        }else if(direc.equals("")){
            direccion.setError("Campo Obligatorio");
        }else {
            Persona p =new Persona();
            p.setUid(UUID.randomUUID().toString());
            p.setNom(nombre);
            p.setAp(apellido);
            p.setNum(celular);
            p.setDir(direc);
            p.setEstado(estado);
            databaseReference.child("Persona").child(p.getUid()).setValue(p);
            Toast.makeText(this,"Datos Registrados",Toast.LENGTH_LONG).show();
            Intent i1 = new Intent(this, Resultado.class);
            i1.putExtra("vdato",datosrec);
            startActivity(i1);

        }
    }

    private String recibirDato() {
        Bundle extras  = getIntent().getExtras();
        String d1 = extras.getString("vdato");
        return d1;
    }

    private void validacion() {
        String nombre=nombres.getText().toString();
        String apellido=apellidos.getText().toString();
        String celular=celular_telefono.getText().toString();
        String direc=direccion.getText().toString();
        if(nombre.equals("")){
            nombres.setError("Campo Obligatorio");
        }else if(apellido.equals("")){
            apellidos.setError("Campo Obligatorio");
        }else if(celular.equals("")){
            celular_telefono.setError("Campo Obligatorio");
        }else if(direc.equals("")){
            direccion.setError("Campo Obligatorio");
        }
    }
}
