package com.mycompany.contateste;
public class ContaTeste {

    public static void main(String[] args) {
        Conta c1 = new Conta(); 
        c1.cliente = "Bernardo";
        c1.saldo = 4000.00;
        c1.exibesaldo();
           
        Conta c2 = new Conta();
        c2.cliente = "Sebastian";
        c2.saldo = 5_000.00;
        c2.exibesaldo();
        System.out.println("\n");
        
        c1.transfvalor(c2, 2000);        
        System.out.println("\n");
        c1.exibesaldo();
        c2.exibesaldo();      
    }
}
