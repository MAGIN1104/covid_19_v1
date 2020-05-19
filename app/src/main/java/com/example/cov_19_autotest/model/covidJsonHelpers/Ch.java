package com.example.cov_19_autotest.model.covidJsonHelpers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ch {

    @SerializedName("contador")
    @Expose
    private Contador______ contador;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("porcentaje")
    @Expose
    private Porcentaje______ porcentaje;

    public Contador______ getContador() {
        return contador;
    }

    public void setContador(Contador______ contador) {
        this.contador = contador;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Porcentaje______ getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Porcentaje______ porcentaje) {
        this.porcentaje = porcentaje;
    }

}
