package br.com.fiap.gitobank.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Notificacao {

    private UUID idNotificacao;
    private UUID idCliente;
    private String titulo;
    private String  conteudo;
    private Date dtEnvio;
    private List<ContaBancaria> contaBancaria;
    private Boolean status;



    public Notificacao(UUID idCliente, String titulo, String conteudo, Date dtEnvio, Boolean status) {
        this.idCliente = idCliente;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dtEnvio = dtEnvio;
        this.status = status;
    }

    public UUID getIdNotificacao() {
        return idNotificacao;
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Date getDtEnvio() {
        return dtEnvio;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setDtEnvio(Date dtEnvio) {
        this.dtEnvio = dtEnvio;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }



}

