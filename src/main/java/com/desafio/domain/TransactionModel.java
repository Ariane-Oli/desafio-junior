package com.desafio.domain;

import java.time.OffsetDateTime;

public class TransactionModel {

    private final double valor;
   private final OffsetDateTime dataHora;

    public TransactionModel(double valor, OffsetDateTime dataHora){

    }

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }


}


