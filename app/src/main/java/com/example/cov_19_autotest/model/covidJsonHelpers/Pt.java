package com.example.cov_19_autotest.model.covidJsonHelpers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pt {

    @SerializedName("contador")
    @Expose
    private Contador____ contador;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("porcentaje")
    @Expose
    private Porcentaje____ porcentaje;

    public Contador____ getContador() {
        return contador;
    }

    public void setContador(Contador____ contador) {
        this.contador = contador;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Porcentaje____ getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Porcentaje____ porcentaje) {
        this.porcentaje = porcentaje;
    }

}
