package com.example.cov_19_autotest;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import static androidx.core.content.PermissionChecker.checkCallingOrSelfPermission;

public class Adaptador extends BaseAdapter {
    private static LayoutInflater inflater=null;
    Context contexto;
    String[][] datos;

    public Adaptador(Context contexto, String[][] datos)
    {
        this.contexto=contexto;
        this.datos = datos;
        inflater=(LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.elemento_lista,null);
        TextView lugar = (TextView) vista.findViewById(R.id.id_nombre_lugar);
        TextView numero = (TextView) vista.findViewById(R.id.num_textView);
        lugar.setText(datos[position][0]);
        numero.setText(datos[position][1]);
        vista.setTag(position);
        vista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ datos[position][1]));
                 contexto.startActivity(intent);
            }
        });
        return vista;
    }
    @Override
    public int getCount() {
        return datos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
