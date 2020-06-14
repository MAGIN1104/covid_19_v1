package com.example.cov_19_autotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    TextView tvdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        recibirDatos();

    }
    //NECESITA RECIBIR DATOS DEL ANTERIOR ACTIVITY AUN NO ESTA LISTO CUANDO REVIBA LOS DATOS
    //NO GENERARA PROBLEMAS
    private void recibirDatos()
    {
        Bundle extras  = getIntent().getExtras();
        String d1 = extras.getString("vdato");
        tvdatos=(TextView)findViewById(R.id.tvdatos);
        tvdatos.setText(d1);
    }

    public void ok(View view)
    {
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);
    }
}
