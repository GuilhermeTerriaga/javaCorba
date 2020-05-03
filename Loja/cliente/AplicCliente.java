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
public class AplicCliente {
    public static void main(String[] args) {
        try {
            IComprador ccli = (IComprador) Naming.lookup("//localhost/comprador");
            Scanner entrada = new Scanner (System.in);
            System.out.println("Olá, bem vindo a aplicação comprador da loja Code!\nPor favor entre com o sua indentificação(id) de cliente!");
            ccli.setId(entrada.nextInt());
            System.out.println("Excelente! Agora seu nome por favor!");
            ccli.setNome(entrada.next());
            System.out.println("Falta pouco, agora seu e-mail!");
            ccli.setEmail(entrada.next());
            System.out.println("Agora o total da sua compra, por favor!");
            ccli.setTotalcompra(entrada.nextDouble());
            ccli.calcularPorcentagemdesconto();
            ccli.calcularTotalpagar();
            System.out.println("Número de identificação(id):............."+ccli.getId());
            System.out.println("Nome:...................................."+ccli.getNome());
            System.out.println("E-mail:.................................."+ccli.getEmail());
            System.out.println("Total da Compra:........................."+ccli.getTotalcompra());
            System.out.println("Percentual de Desconto:.................."+ccli.getPorcentagemdesconto());
            System.out.println("Total a pagar:..........................."+ccli.getTotalpagar());
            System.out.println("Obrigado!");
            
            
        } catch (Exception e) {
        }
    }
}
