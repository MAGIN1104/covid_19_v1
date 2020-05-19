package com.example.cov_19_autotest.model.covidJsonHelpers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cb {

    @SerializedName("contador")
    @Expose
    private Contador_ contador;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("porcentaje")
    @Expose
    private Porcentaje_ porcentaje;

    public Contador_ getContador() {
        return contador;
    }

    public void setContador(Contador_ contador) {
        this.contador = contador;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Porcentaje_ getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Porcentaje_ porcentaje) {
        this.porcentaje = porcentaje;
    }

}
