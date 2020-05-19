package com.example.cov_19_autotest.model.covidJsonHelpers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pn {

    @SerializedName("contador")
    @Expose
    private Contador________ contador;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("porcentaje")
    @Expose
    private Porcentaje________ porcentaje;

    public Contador________ getContador() {
        return contador;
    }

    public void setContador(Contador________ contador) {
        this.contador = contador;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Porcentaje________ getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Porcentaje________ porcentaje) {
        this.porcentaje = porcentaje;
    }

}
