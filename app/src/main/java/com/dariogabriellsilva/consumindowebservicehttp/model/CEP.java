package com.dariogabriellsilva.consumindowebservicehttp.model;

public class CEP {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    @Override
    public String toString() {
        return "CEP: " + cep
                + "\nLogradouro: " + logradouro
                + "\nComplemento: " + complemento
                + "\nBairro: " + bairro
                + "\nCidade: " + cidade
                + "\nEstado: " + estado;
    }
}
