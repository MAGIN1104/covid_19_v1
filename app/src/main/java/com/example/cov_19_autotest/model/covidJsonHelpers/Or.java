package com.example.cov_19_autotest.model.covidJsonHelpers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Or {

    @SerializedName("contador")
    @Expose
    private Contador___ contador;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("porcentaje")
    @Expose
    private Porcentaje___ porcentaje;

    public Contador___ getContador() {
        return contador;
    }

    public void setContador(Contador___ contador) {
        this.contador = contador;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Porcentaje___ getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Porcentaje___ porcentaje) {
        this.porcentaje = porcentaje;
    }

}
