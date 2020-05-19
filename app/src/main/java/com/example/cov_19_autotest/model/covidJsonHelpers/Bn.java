package com.example.cov_19_autotest.model.covidJsonHelpers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bn {

    @SerializedName("contador")
    @Expose
    private Contador_______ contador;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("porcentaje")
    @Expose
    private Porcentaje_______ porcentaje;

    public Contador_______ getContador() {
        return contador;
    }

    public void setContador(Contador_______ contador) {
        this.contador = contador;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Porcentaje_______ getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Porcentaje_______ porcentaje) {
        this.porcentaje = porcentaje;
    }

}
