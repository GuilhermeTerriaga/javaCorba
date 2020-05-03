/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
/**
 *
 * @author guilherme
 */
public class AplicServidor {
      public static void main(String[] args) {
        try {
            Comprador cserv = new Comprador();
            LocateRegistry.createRegistry(1099);

            Naming.rebind("//localhost/comprador", cserv);

            System.out.println("cadastrado o objeto Comprador com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
