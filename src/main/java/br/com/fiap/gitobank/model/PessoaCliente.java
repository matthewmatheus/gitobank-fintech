package br.com.fiap.gitobank.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PessoaCliente {

    private UUID idCliente;

    private String nome;
    private String sobrenome;
    private String email;

    private List<Telefone> telefone;
    private List<CartaoCredito> cartoesCredito;

    public PessoaCliente() {
    }

    public PessoaCliente(String nome, String sobrenome, String email, List<Telefone> telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }

    public PessoaCliente(String nome, String sobrenome, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public PessoaCliente(String nome, String sobrenome, String email, List<Telefone> telefone, List<CartaoCredito> cartoesCredito) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.cartoesCredito = cartoesCredito;
    }

    public void adicionarTelefone(int ddd, String numeroTelefone) {
        if (telefone == null) {
            telefone = new ArrayList<>();
        }
        Telefone novoTelefone = new Telefone(ddd, numeroTelefone);
        telefone.add(novoTelefone);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
    }
}


