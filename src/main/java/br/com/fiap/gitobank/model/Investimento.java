package br.com.fiap.gitobank.model;

import java.util.Date;
import java.util.UUID;

public class Investimento {

    private UUID idInvestimento;

    private String tipoInvestimento;
    private double valorInvestimento;
    private Date dataInicio;
    private Date dataTermino;


    public Investimento(String tipoInvestimento, double valorInvestimento, Date dataInicio, Date dataTermino) {
        this.tipoInvestimento = tipoInvestimento;
        this.valorInvestimento = valorInvestimento;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }


    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }


    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;


    }
}
