package com.desafio.domain;

import java.time.OffsetDateTime;

public class TransactionModel {

    private final double valor;
   private final OffsetDateTime dataHora;

    public TransactionModel(double valor, OffsetDateTime dataHora) {
        if (dataHora == null) {
            throw new IllegalArgumentException("dataHora é obrigatória");
        }
        OffsetDateTime now = OffsetDateTime.now();
        if (dataHora.isAfter(now))
            throw new IllegalArgumentException(("dataHora não pode ser no futuro"));


        if (valor < 0) {
            throw new IllegalArgumentException("valor não pode ser negativo");

        }

        this.valor = valor;
        this.dataHora = dataHora;


    }
    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}


