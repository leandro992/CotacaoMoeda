package com.victor.cotacaomoeda.models;

/**
 * Created by victor on 26/01/18.
 */

public class Valores {

    private Moeda USD;
    private Moeda EUR;
    private Moeda ARS;
    private Moeda GBP;
    private Moeda BTC;

    public Moeda getUSD() {
        return USD;
    }

    public void setUSD(Moeda USD) {
        this.USD = USD;
    }

    public Moeda getEUR() {
        return EUR;
    }

    public void setEUR(Moeda EUR) {
        this.EUR = EUR;
    }

    public Moeda getARS() {
        return ARS;
    }

    public void setARS(Moeda ARS) {
        this.ARS = ARS;
    }

    public Moeda getGBP() {
        return GBP;
    }

    public void setGBP(Moeda GBP) {
        this.GBP = GBP;
    }

    public Moeda getBTC() {
        return BTC;
    }

    public void setBTC(Moeda BTC) {
        this.BTC = BTC;
    }
}
