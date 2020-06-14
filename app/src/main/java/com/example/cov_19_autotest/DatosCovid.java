package com.example.cov_19_autotest;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
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
    TextView fechaupdate;
    //txtvw Bol
    TextView boconfTextView;
    TextView borecTextView;
    TextView bomueTextView;
    TextView bo_p_confTextView;
    TextView bo_p_recTextView;
    TextView bo_p_mueTextView;
    TextView bososTextView;
    //txtvw LP
    TextView lpconfTextView;
    TextView lprecTextView;
    TextView lpmueTextView;
    TextView lpsosTextView;
    //txtvw SCZ
    TextView sczconfTextView;
    TextView sczrecTextView;
    TextView sczmueTextView;
    TextView sczsosTextView;

    //txtvw cbba
    TextView cbconfTextView;
    TextView cbrecTextView;
    TextView cbmueTextView;
    TextView cbsosTextView;

    //txtvw beni
    TextView bnconfTextView;
    TextView bnrecTextView;
    TextView bnmueTextView;
    TextView bnsosTextView;

    //txtvw Or
    TextView orconfTextView;
    TextView orrecTextView;
    TextView ormueTextView;
    TextView orsosTextView;

    //txtvw sucre
    TextView scconfTextView;
    TextView screcTextView;
    TextView scmueTextView;
    TextView scsosTextView;

    //txtvw Tarija
    TextView tjconfTextView;
    TextView tjrecTextView;
    TextView tjmueTextView;
    TextView tjsosTextView;

    //txtvw Potosi
    TextView poconfTextView;
    TextView porecTextView;
    TextView pomueTextView;
    TextView pososTextView;

    //txtvw Pando
    TextView pnconfTextView;
    TextView pnrecTextView;
    TextView pnmueTextView;
    TextView pnsosTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_covid);

        //responseText=(TextView)findViewById(R.id.responseText);

        getCountryCovidStats();
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

                //Jalamos datos BOLIVIA
                boconfTextView = findViewById(R.id.boCasosTextView);
                boconfTextView.setText(response.body().getContador().getConfirmados().toString());
                borecTextView=findViewById(R.id.borectextView);
                borecTextView.setText(response.body().getContador().getRecuperados().toString());
                bomueTextView=findViewById(R.id.bomuertestextView);
                bomueTextView.setText(response.body().getContador().getDecesos().toString());
                bososTextView=findViewById(R.id.bosostextView);
                bososTextView.setText(response.body().getContador().getSospechosos().toString());
//                bo_p_confTextView = findViewById(R.id.bo_por_c_textView);
//                bo_p_confTextView.setText(response.body().getPorcentaje().getConfirmados());
//                bo_p_recTextView=findViewById(R.id.bo_por_r_textView);
//                bo_p_recTextView.setText(response.body().getPorcentaje().getRecuperados());
//                bo_p_mueTextView=findViewById(R.id.bo_por_f_textView);
//                bo_p_mueTextView.setText(response.body().getPorcentaje().getDecesos());
                fechaupdate=findViewById(R.id.fechaTextView);
                fechaupdate.setText(fecha);
                //Jalamos datos solo de lapaz
                lpconfTextView = findViewById(R.id.lpCasosTextView);
                lpconfTextView.setText(laPaz.getContador().getConfirmados().toString());
                lprecTextView=findViewById(R.id.lprectextView);
                lprecTextView.setText(laPaz.getContador().getRecuperados().toString());
                lpmueTextView=findViewById(R.id.lpmuertestextView);
                lpmueTextView.setText(laPaz.getContador().getDecesos().toString());
                lpsosTextView=findViewById(R.id.lpsostextView);
                lpsosTextView.setText(laPaz.getContador().getSospechosos().toString());
                //Jalamos datos solo de SCZ
                sczconfTextView = findViewById(R.id.sczCasosTextView);
                sczconfTextView.setText(santaCruz.getContador().getConfirmados().toString());
                sczrecTextView=findViewById(R.id.sczrectextView);
                sczrecTextView.setText(santaCruz.getContador().getRecuperados().toString());
                sczmueTextView=findViewById(R.id.sczmuertestextView);
                sczmueTextView.setText(santaCruz.getContador().getDecesos().toString());
                sczsosTextView=findViewById(R.id.sczsostextView);
                sczsosTextView.setText(santaCruz.getContador().getSospechosos().toString());
                //Jalamos datos solo de CB
                cbconfTextView = findViewById(R.id.cbCasosTextView);
                cbconfTextView.setText(cocha.getContador().getConfirmados().toString());
                cbrecTextView=findViewById(R.id.cbrectextView);
                cbrecTextView.setText(cocha.getContador().getRecuperados().toString());
                cbmueTextView=findViewById(R.id.cbmuertestextView);
                cbmueTextView.setText(cocha.getContador().getDecesos().toString());
                cbsosTextView=findViewById(R.id.cbsostextView);
                cbsosTextView.setText(cocha.getContador().getSospechosos().toString());
                //Jalamos datos solo de BN
                bnconfTextView = findViewById(R.id.bnCasosTextView);
                bnconfTextView.setText(beni.getContador().getConfirmados().toString());
                bnrecTextView=findViewById(R.id.bnrectextView);
                bnrecTextView.setText(beni.getContador().getRecuperados().toString());
                bnmueTextView=findViewById(R.id.bnmuertestextView);
                bnmueTextView.setText(beni.getContador().getDecesos().toString());
                bnsosTextView=findViewById(R.id.bnsostextView);
                bnsosTextView.setText(beni.getContador().getSospechosos().toString());
                //Jalamos datos solo de ORURO
                orconfTextView = findViewById(R.id.orCasosTextView);
                orconfTextView.setText(oruro.getContador().getConfirmados().toString());
                orrecTextView=findViewById(R.id.orrectextView);
                orrecTextView.setText(oruro.getContador().getRecuperados().toString());
                ormueTextView=findViewById(R.id.ormuertestextView);
                ormueTextView.setText(oruro.getContador().getDecesos().toString());
                orsosTextView=findViewById(R.id.orsostextView);
                orsosTextView.setText(oruro.getContador().getSospechosos().toString());
                //Jalamos datos solo de SUCRE/CHUQUISACA
                scconfTextView = findViewById(R.id.scCasosTextView);
                scconfTextView.setText(chuquisaca.getContador().getConfirmados().toString());
                screcTextView=findViewById(R.id.screctextView);
                screcTextView.setText(chuquisaca.getContador().getRecuperados().toString());
                scmueTextView=findViewById(R.id.scmuertestextView);
                scmueTextView.setText(chuquisaca.getContador().getDecesos().toString());
                scsosTextView=findViewById(R.id.scsostextView);
                scsosTextView.setText(chuquisaca.getContador().getSospechosos().toString());
                //Jalamos datos solo de Tarija
                tjconfTextView = findViewById(R.id.tjCasosTextView);
                tjconfTextView.setText(tarija.getContador().getConfirmados().toString());
                tjrecTextView=findViewById(R.id.tjrectextView);
                tjrecTextView.setText(tarija.getContador().getRecuperados().toString());
                tjmueTextView=findViewById(R.id.tjmuertestextView);
                tjmueTextView.setText(tarija.getContador().getDecesos().toString());
                tjsosTextView=findViewById(R.id.tjsostextView);
                tjsosTextView.setText(tarija.getContador().getSospechosos().toString());
                //Jalamos datos solo de Potosi
                poconfTextView = findViewById(R.id.poCasosTextView);
                poconfTextView.setText(potosi.getContador().getConfirmados().toString());
                porecTextView=findViewById(R.id.porectextView);
                porecTextView.setText(potosi.getContador().getRecuperados().toString());
                pomueTextView=findViewById(R.id.pomuertestextView);
                pomueTextView.setText(potosi.getContador().getDecesos().toString());
                pososTextView=findViewById(R.id.posostextView);
                pososTextView.setText(potosi.getContador().getSospechosos().toString());
                //Jalamos datos solo de Pando
                pnconfTextView = findViewById(R.id.pnCasosTextView);
                pnconfTextView.setText(pando.getContador().getConfirmados().toString());
                pnrecTextView=findViewById(R.id.pnrectextView);
                pnrecTextView.setText(pando.getContador().getRecuperados().toString());
                pnmueTextView=findViewById(R.id.pnmuertestextView);
                pnmueTextView.setText(pando.getContador().getDecesos().toString());
                pnsosTextView=findViewById(R.id.pnsostextView);
                pnsosTextView.setText(pando.getContador().getSospechosos().toString());
//                String boliviaCasos = "Casos confirmados en Bolivia: " + response.body().getContador().getConfirmados().toString();
//                responseText.setText(boliviaCasos);
            }

            @Override
            public void onFailure(Call<CovidReport> call, Throwable t) {
                Toast.makeText(DatosCovid.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                responseText.setText("Error");
            }
        });

    }
}
