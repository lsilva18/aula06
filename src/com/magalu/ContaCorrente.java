package com.magalu;

public class ContaCorrente extends Conta{
    public final int LIMITE = 100;

    public ContaCorrente( Pessoa dono, double saldo) {
        super(dono, saldo);
    }

    public boolean sacar(double valor){
        if(valor <= super.getSaldo() + LIMITE){
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }
        return false;
    }

    public void verInfo(){
        super.verInfo();
        System.out.printf("O limite é %d\n", LIMITE);
    }
}
