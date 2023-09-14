package br.com.fiap.gitobank;

import br.com.fiap.gitobank.model.ClientePessoaFisica;
import br.com.fiap.gitobank.model.ContaBancaria;
import br.com.fiap.gitobank.model.PessoaCliente;
import br.com.fiap.gitobank.model.Telefone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class gitobankApplicationTest {

    public static void main(String[] args) {


        // criando telefones
        Telefone telefone_1 = new Telefone(11, "948234112");
        Telefone telefone_2 = new Telefone(11, "30491234");
        List<Telefone> telefones = new ArrayList<>();

        //adicionando telefone a lista
        telefones.add(telefone_1);

        // instanciando o objeto ClientePessoaFisica
        ClientePessoaFisica pessoa = new ClientePessoaFisica(
                "Fulano",
                "De Tal",
                "fulanodetal@email.com",
                telefones,
                "542233-3",
                "354203410-44",
                LocalDate.of(2000, 03, 29),
                "masculino",
                23);

        // adicionando telefone a ClientePessoaFisica contido na variavel `pessoa`
        pessoa.adicionarTelefone(11, "922214533");

        UUID uuid = UUID.randomUUID();
        pessoa.setIdCliente(uuid);


        ContaBancaria cb = new ContaBancaria(uuid, "14023-232", "Conta Corrente", 2200.00, LocalDate.of(2023, 02, 19));
        double saldoAtual = cb.consultaSaldoConta();
        System.out.println("Saldo atual é de: " + saldoAtual);


    }

}
