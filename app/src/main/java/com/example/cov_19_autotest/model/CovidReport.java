package com.example.cov_19_autotest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.example.cov_19_autotest.model.covidJsonHelpers.Contador_________;
import com.example.cov_19_autotest.model.covidJsonHelpers.Departamento;
import com.example.cov_19_autotest.model.covidJsonHelpers.Porcentaje_________;


public class CovidReport {

    @SerializedName("fecha")
    @Expose
    private String fecha;
    @SerializedName("departamento")
    @Expose
    private Departamento departamento;
    @SerializedName("contador")
    @Expose
    private Contador_________ contador;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("porcentaje")
    @Expose
    private Porcentaje_________ porcentaje;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Contador_________ getContador() {
        return contador;
    }

    public void setContador(Contador_________ contador) {
        this.contador = contador;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Porcentaje_________ getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Porcentaje_________ porcentaje) {
        this.porcentaje = porcentaje;
    }

}

