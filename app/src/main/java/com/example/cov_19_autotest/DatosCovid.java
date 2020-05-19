package com.example.cov_19_autotest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import android.widget.Toast;

import com.example.cov_19_autotest.model.CovidReport;
import com.example.cov_19_autotest.model.covidJsonHelpers.Bn;
import com.example.cov_19_autotest.model.covidJsonHelpers.Cb;
import com.example.cov_19_autotest.model.covidJsonHelpers.Ch;
import com.example.cov_19_autotest.model.covidJsonHelpers.Departamento;
import com.example.cov_19_autotest.model.covidJsonHelpers.Lp;
import com.example.cov_19_autotest.model.covidJsonHelpers.Or;
import com.example.cov_19_autotest.model.covidJsonHelpers.Pn;
import com.example.cov_19_autotest.model.covidJsonHelpers.Pt;
import com.example.cov_19_autotest.model.covidJsonHelpers.Sc;
import com.example.cov_19_autotest.model.covidJsonHelpers.Tj;
import com.example.cov_19_autotest.network.GetDataService;
import com.example.cov_19_autotest.network.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class DatosCovid extends AppCompatActivity {
    TextView responseText;
    TextView laPazCasosTextView;
    TextView lprecTextView;
    TextView lpmueTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_covid);

    }
    public void getCountryCovidStats() {
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<CovidReport> call = service.getCovidStats();

        call.enqueue(new Callback<CovidReport>() {
            @Override
            public void onResponse(Call<CovidReport> call, Response<CovidReport> response) {

                CovidReport report = response.body();
                String fecha = report.getFecha();

                Departamento departamentos = response.body().getDepartamento();
                Lp laPaz = departamentos.getLp();
                Bn beni = departamentos.getBn();
                Cb cocha = departamentos.getCb();
                Ch chuquisaca = departamentos.getCh();
                Or oruro = departamentos.getOr();
                Pn pando = departamentos.getPn();
                Pt potosi = departamentos.getPt();
                Sc santaCruz = departamentos.getSc();
                Tj tarija = departamentos.getTj();

                laPazCasosTextView = findViewById(R.id.lpCasosTextView);
                laPazCasosTextView.setText(laPaz.getContador().getConfirmados().toString());
                lprecTextView=findViewById(R.id.chrectextView);
                lprecTextView.setText(laPaz.getContador().getRecuperados().toString());
                lpmueTextView=findViewById(R.id.chmuertestextView);
                lpmueTextView.setText(laPaz.getContador().getDecesos().toString());
                String boliviaCasos = "Casos totales en Bolivia: " + response.body().getTotal().toString();
                responseText.setText(boliviaCasos);
            }

            @Override
            public void onFailure(Call<CovidReport> call, Throwable t) {
                Toast.makeText(DatosCovid.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                responseText.setText("Error");
            }
        });

    }
}
