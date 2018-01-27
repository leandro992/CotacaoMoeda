package com.victor.cotacaomoeda.models;


import android.text.format.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by victor on 26/01/18.
 */

public class Moeda {

    private String nome;
    private Double valor;
    private Long ultima_consulta;
    private String fonte;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Long getUltima_consulta() {
        return ultima_consulta;
    }

    public void setUltima_consulta(Long ultima_consulta) {
        this.ultima_consulta = ultima_consulta;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatter.format(new Date(ultima_consulta * 1000));

        return "Moeda: "+ this.nome+ "\nValor: " + this.valor +
                "\nData Cotação: " + dataFormatada +
                "\nFonte: " + this.fonte ;
    }
}
