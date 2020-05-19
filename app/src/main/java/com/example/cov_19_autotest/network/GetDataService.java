package com.example.cov_19_autotest.network;

import com.example.cov_19_autotest.model.CovidReport;


import retrofit2.Call;
import retrofit2.http.GET;


public interface GetDataService {

    @GET("/wp-content/json/api.php#")
    Call<CovidReport> getCovidStats();
}