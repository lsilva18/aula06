package com.magalu;

public class Main {

    public static void main(String[] args) {
        float saldo = 100;
        float valor_saque = 50;
        boolean podeSacar;
        int numero_conta;

	    // criando uma pessoa
        Pessoa p1 = new Pessoa("Nome_1", "008643", "Rua 1");

        // criando contas
        ContaCorrente contaCorrente = new ContaCorrente(p1, saldo);
        numero_conta = contaCorrente.getTotalDeContas();
        contaCorrente.setNumero(numero_conta);
        ContaPoupanca contaPoupanca = new ContaPoupanca(p1, saldo);
        numero_conta = contaPoupanca.getTotalDeContas();
        contaPoupanca.setNumero(numero_conta);

        // adicionar os valores das contas nas pessoas
        contaCorrente.setDono(p1);
        contaPoupanca.setDono(p1);

        // realizar saque corrente
        System.out.println("------------------------------------");
        System.out.println(">>>> Tentando sacar da conta corrente");
	    podeSacar = contaCorrente.sacar(valor_saque);
        contaCorrente.mensagemSaque(podeSacar);


        // realizar saque poupanca
        System.out.println("------------------------------------");
        System.out.println(">>>> Tentando sacar da conta poupança");
        podeSacar = contaPoupanca.sacar(valor_saque);
        contaPoupanca.mensagemSaque(podeSacar);


    }
}
