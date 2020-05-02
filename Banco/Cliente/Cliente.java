/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Cliente {

    public static void main(String args[]) {
        try {
            IConta ccli = (IConta) Naming.lookup("//localhost/conta");

            Scanner entrada = new Scanner(System.in);

            System.out.println("Olá, bem vindo a aplicação cliente do banco Code!\n"
                    + "Por favor entre com o numero da conta!");
            ccli.setNumeroconta(entrada.nextInt());
            System.out.println("Excelente! agora, entre com o nome do titular!");
            ccli.setNometitular(entrada.next());
            System.out.println("saldo de:" + ccli.getSaldo());
            String aux = "s";
            while(aux.equals("s") | aux.equals("S")){
                if (aux.equals("s") || aux.equals("S")) {
                    System.out.println("Agora, qual operação gostaria de fazer," + ccli.getNometitular() + "?");
                    System.out.println("---------------------------------------------------\n"
                            + "1-Deposito\n2-Saque\n");
                    int op;
                    op = (entrada.nextInt());
                    if (op == 1) {
                        System.out.println("Depósito! Excelente, agora por favor, digite a quantia!\n");
                        if (ccli.deposito(entrada.nextDouble()) == true) {
                            System.out.println("Depósto feito com sucesso! Saldo atual:" + ccli.getSaldo() + "\n");
System.out.println("Realizar mais alguma operação? S/N");
                            aux = entrada.next();
                        } else {
                            System.out.println("Depósito não realizado! Verifique se o valor digitado é positivo! \n");
                            System.out.println("Realizar mais alguma operação? S/N");
                            aux = entrada.next();

                        }

                    } else if (op == 2) {
                        System.out.println("Saque! lembre-se de que para sacar é necessário ter a quantia ok?\n");
                        System.out.println("Excelente, agora por favor, digite a quantia!\n");
                        if (ccli.saque(entrada.nextDouble()) == true) {
                            System.out.println("Saque feito com sucesso! Saldo atual:" + ccli.getSaldo() + "\n");
System.out.println("Realizar mais alguma operação? S/N");
                            aux = entrada.next();
                        } else {
                            System.out.println("Saque não realizado! Verifique se o saldo da conta suporta a operação! \n");
                            System.out.println("Realizar mais alguma operação? S/N");
                            aux = entrada.next();

                        }

                    }
                }else{
                
                   
		break;}
 System.out.println("Obrigado por usar o banco Code!");
            } 
        } catch (Exception e) {
            System.out.println(" error: " + e.getMessage());
        }
        System.exit(0);
    }
}
