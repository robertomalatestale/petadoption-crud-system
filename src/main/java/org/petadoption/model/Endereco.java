package org.petadoption.model;

import org.petadoption.exception.EmptyFieldException;

public class Endereco {
    private String logradouro;
    private int numero;
    private String cidade;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if(logradouro == null || logradouro.trim().isEmpty()){
            throw new EmptyFieldException("Logradouro inválido");
        }
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if(cidade == null || cidade.trim().isEmpty()){
            throw new EmptyFieldException("Cidade inválida");
        }
        this.cidade = cidade;
    }

}
