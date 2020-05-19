package com.example.cov_19_autotest.model.covidJsonHelpers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contador_________ {

    @SerializedName("confirmados")
    @Expose
    private Integer confirmados;
    @SerializedName("decesos")
    @Expose
    private Integer decesos;
    @SerializedName("recuperados")
    @Expose
    private Integer recuperados;
    @SerializedName("sospechosos")
    @Expose
    private Integer sospechosos;
    @SerializedName("descartados")
    @Expose
    private Integer descartados;

    public Integer getConfirmados() {
        return confirmados;
    }

    public void setConfirmados(Integer confirmados) {
        this.confirmados = confirmados;
    }

    public Integer getDecesos() {
        return decesos;
    }

    public void setDecesos(Integer decesos) {
        this.decesos = decesos;
    }

    public Integer getRecuperados() {
        return recuperados;
    }

    public void setRecuperados(Integer recuperados) {
        this.recuperados = recuperados;
    }

    public Integer getSospechosos() {
        return sospechosos;
    }

    public void setSospechosos(Integer sospechosos) {
        this.sospechosos = sospechosos;
    }

    public Integer getDescartados() {
        return descartados;
    }

    public void setDescartados(Integer descartados) {
        this.descartados = descartados;
    }

}
