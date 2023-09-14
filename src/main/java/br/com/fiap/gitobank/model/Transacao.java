package br.com.fiap.gitobank.model;

import java.util.Date;
import java.util.UUID;

public class Transacao {

    private UUID idTransacao;
    private int nrConta;
    private String tipoTransacao;
    private Date dtTransacao;
    private String descricao;

    public Transacao(int nrConta, String tipoTransacao, Date dtTransacao, String descricao) {
        this.nrConta = nrConta;
        this.tipoTransacao = tipoTransacao;
        this.dtTransacao = dtTransacao;
        this.descricao = descricao;
    }

    public Transacao(UUID idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDtTransacao() {
        return dtTransacao;
    }

    public int getNrConta() {
        return nrConta;
    }
}
