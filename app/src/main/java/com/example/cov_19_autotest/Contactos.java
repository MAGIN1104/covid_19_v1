package com.example.cov_19_autotest;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Contactos extends AppCompatActivity {
    ListView lista;
    String[][] datos = {
            {"Ministerio de Salud","800-101104"},
            { "Santa Cruz","33636300" },
            { "La Paz","2443885" },
            { "Oruro", "2527701" },
            { "Sucre","6454891" },
            { "Beni","34621199" },
            { "Pando","38422286" },
            { "Cochabamba","4221891"},
            { "Tarija","46643266" },
            { "Potosi","266224719" }
    };
    Adaptador list_adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        lista = (ListView)findViewById(R.id.lista);
        list_adaptor = new Adaptador(this, datos);
        lista.setAdapter(list_adaptor);
    }
}
