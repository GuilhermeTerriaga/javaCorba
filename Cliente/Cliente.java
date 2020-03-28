
import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.Scanner;
/*
**
**@author guilherme
**
*/


public class Cliente {

    public static void main(String args[]) {
        try {
            IAluno acli = (IAluno) Naming.lookup("//localhost/aluno");

            Scanner entrada = new Scanner(System.in);

            System.out.print("Insira o seu RGM: ");
            acli.setRgm(entrada.nextInt());
            System.out.print("Insira o seu nome: ");
            acli.setNome(entrada.next());
            System.out.print("Insira sua media 1: ");
            acli.setMed1(entrada.nextInt());
            System.out.print("Insira sua media 2: ");
            acli.setMed2(entrada.nextInt());

            acli.calcularMedia();

            System.out.println("Media Final: " + acli.getMedf());
            if (acli.isApproved()) {
                System.out.println("Aprovado(a)");
            } else {
                System.out.println("Reprovado(a)");
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.exit(0);
    }
}
