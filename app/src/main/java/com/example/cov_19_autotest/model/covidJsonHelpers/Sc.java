
package com.example.cov_19_autotest.model.covidJsonHelpers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sc {

    @SerializedName("contador")
    @Expose
    private Contador__ contador;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("porcentaje")
    @Expose
    private Porcentaje__ porcentaje;

    public Contador__ getContador() {
        return contador;
    }

    public void setContador(Contador__ contador) {
        this.contador = contador;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Porcentaje__ getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Porcentaje__ porcentaje) {
        this.porcentaje = porcentaje;
    }

}
