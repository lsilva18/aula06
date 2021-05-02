package com.magalu;

public class Conta{

    private int numero;
    private Pessoa dono;
    private double saldo;
    private static  int totalDeContas;

    public Conta(){

    }

    public Conta( Pessoa dono, double saldo) {
        this.dono = dono;
        this.saldo = saldo;
        this.totalDeContas = Conta.totalDeContas + 1;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public boolean sacar(double valor){
        if(valor <= this.saldo){
            this.saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public void transferir(double valor){
        this.saldo += valor;
    }

    public void verInfo(){
        System.out.println("Conta número: " + numero);
        System.out.println("Nome: " +  dono.getNome());
        System.out.println("CPF: " +  dono.getCpf());
        System.out.println("Saldo: " +  saldo);
    }


    public void mensagemSaque(boolean podeSacar){
        this.verInfo();
        if(podeSacar == true) {
            System.out.println("Operação realizada com sucesso.");
        }else {
            System.out.println("A operção não pode ser realizada.");
        }
    }
}