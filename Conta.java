package com.mycompany.contateste;
public class Conta {
    String cliente;
    double saldo;
    
    void exibesaldo(){
        System.out.println(cliente + " seu saldo é de R$ " + saldo);
    }
    void saque(double valor){
        saldo -= valor;
    }
    void deposito(double valor){
        saldo += valor;
    }
    void transfvalor(Conta c2, double valor){        
        System.out.println("Transferência feita no valor de R$ " + valor);
        this.saque(valor);
        c2.deposito(valor);
    }
}
