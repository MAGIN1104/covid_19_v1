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
            { "Cochabamba","4221891" },
            { "Tarija","46643266" },
            { "Potosi","266224719" }
    };
    Adaptador list_adaptor;
//    ArrayAdapter<String> list_adaptador;
//    ArrayList<String> listaArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        lista = (ListView)findViewById(R.id.lista);
//        listaArray = new ArrayList<String>();
//        list_adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaArray);
        list_adaptor = new Adaptador(this, datos);
        lista.setAdapter(list_adaptor);
//        listaArray.add("800-101104");//ministerio de salud
//        listaArray.add("33636300"); //santa cruz
//        listaArray.add("2443885"); // la paz
//        listaArray.add("2527701");// oruro
//        listaArray.add("6454891"); //sucre
//        listaArray.add("34621199"); //beni
//        listaArray.add("38422286"); //pando
//        listaArray.add("4221891"); //cochabamba
//        listaArray.add("46643266"); //tarija
//        listaArray.add("266224719"); //potosi
//        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id)//clase anonima por defecto de android para que al presionar sobre alguno nos muestra ese contenido
//            {
//                try {
//                    String phoneNumber = lista.getItemAtPosition(position)+"";
//                    Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
//
//                    int result = checkCallingOrSelfPermission(Manifest.permission.CALL_PHONE);
//                    if ( result == PackageManager.PERMISSION_GRANTED)
//                    {
//                        Toast.makeText(Contactos.this, "Acceso no autorizado", Toast.LENGTH_LONG).show();
//                    }
//                    else{
//                        startActivity(intentCall);
//                    }
//                }catch (Exception ex)
//                {
//
//                }
//            }
//        });
    }
}
