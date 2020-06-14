package com.example.cov_19_autotest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.TextView;

public class Recomendaciones extends AppCompatActivity {

    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendaciones);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6= (TextView) findViewById(R.id.textView6);

        SpannableString miTexto2 = new SpannableString("QUÉDATE en casa lo máximo posible\nMANTÉN el distanciamiento social\nLÁVATE las manos con frecuencia\nTOSE cubriéndote con el codo\nLLAMA si tienes síntomas\n" );
        StyleSpan boldSpan2 = new StyleSpan(Typeface.BOLD);
        StyleSpan boldSpan3 = new StyleSpan(Typeface.BOLD);
        StyleSpan boldSpan4 = new StyleSpan(Typeface.BOLD);
        StyleSpan boldSpan5 = new StyleSpan(Typeface.BOLD);
        StyleSpan boldSpan6 = new StyleSpan(Typeface.BOLD);
        miTexto2.setSpan(boldSpan2, 0, 7, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        miTexto2.setSpan(boldSpan3, 34, 40, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        miTexto2.setSpan(boldSpan4, 66, 73, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        miTexto2.setSpan(boldSpan5, 98, 103, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        miTexto2.setSpan(boldSpan6, 127, 133, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textView2.setText(miTexto2);


    }
}

