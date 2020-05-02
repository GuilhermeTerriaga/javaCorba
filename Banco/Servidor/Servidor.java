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
public class Servidor {

    public static void main(String[] args) {
        try {
            Conta cserv = new Conta();
            LocateRegistry.createRegistry(1099);

            Naming.rebind("//localhost/conta", cserv);

            System.out.println("cadastrado o objeto Conta com sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
