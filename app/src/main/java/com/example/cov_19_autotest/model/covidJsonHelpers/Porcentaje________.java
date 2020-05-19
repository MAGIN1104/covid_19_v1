package com.example.cov_19_autotest.model.covidJsonHelpers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Porcentaje________ {

    @SerializedName("confirmados")
    @Expose
    private String confirmados;
    @SerializedName("decesos")
    @Expose
    private String decesos;
    @SerializedName("recuperados")
    @Expose
    private String recuperados;
    @SerializedName("sospechosos")
    @Expose
    private String sospechosos;
    @SerializedName("descartados")
    @Expose
    private String descartados;

    public String getConfirmados() {
        return confirmados;
    }

    public void setConfirmados(String confirmados) {
        this.confirmados = confirmados;
    }

    public String getDecesos() {
        return decesos;
    }

    public void setDecesos(String decesos) {
        this.decesos = decesos;
    }

    public String getRecuperados() {
        return recuperados;
    }

    public void setRecuperados(String recuperados) {
        this.recuperados = recuperados;
    }

    public String getSospechosos() {
        return sospechosos;
    }

    public void setSospechosos(String sospechosos) {
        this.sospechosos = sospechosos;
    }

    public String getDescartados() {
        return descartados;
    }

    public void setDescartados(String descartados) {
        this.descartados = descartados;
    }

}
