package com.victor.cotacaomoeda.models;



/**
 * Created by victor on 26/01/18.
 */

public class CotacaoResponse {

    private boolean status;
    private Valores valores;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Valores getValores() {
        return valores;
    }

    public void setValores(Valores valores) {
        this.valores = valores;
    }


}
