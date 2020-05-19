package com.example.cov_19_autotest.model.covidJsonHelpers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Departamento {

    @SerializedName("lp")
    @Expose
    private Lp lp;
    @SerializedName("cb")
    @Expose
    private Cb cb;
    @SerializedName("sc")
    @Expose
    private Sc sc;
    @SerializedName("or")
    @Expose
    private Or or;
    @SerializedName("pt")
    @Expose
    private Pt pt;
    @SerializedName("tj")
    @Expose
    private Tj tj;
    @SerializedName("ch")
    @Expose
    private Ch ch;
    @SerializedName("bn")
    @Expose
    private Bn bn;
    @SerializedName("pn")
    @Expose
    private Pn pn;

    public Lp getLp() {
        return lp;
    }

    public void setLp(Lp lp) {
        this.lp = lp;
    }

    public Cb getCb() {
        return cb;
    }

    public void setCb(Cb cb) {
        this.cb = cb;
    }

    public Sc getSc() {
        return sc;
    }

    public void setSc(Sc sc) {
        this.sc = sc;
    }

    public Or getOr() {
        return or;
    }

    public void setOr(Or or) {
        this.or = or;
    }

    public Pt getPt() {
        return pt;
    }

    public void setPt(Pt pt) {
        this.pt = pt;
    }

    public Tj getTj() {
        return tj;
    }

    public void setTj(Tj tj) {
        this.tj = tj;
    }

    public Ch getCh() {
        return ch;
    }

    public void setCh(Ch ch) {
        this.ch = ch;
    }

    public Bn getBn() {
        return bn;
    }

    public void setBn(Bn bn) {
        this.bn = bn;
    }

    public Pn getPn() {
        return pn;
    }

    public void setPn(Pn pn) {
        this.pn = pn;
    }

}
