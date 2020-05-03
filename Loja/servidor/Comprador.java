/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.function.Function;

/**
 *
 * @author guilherme
 *
 */
public class Comprador extends UnicastRemoteObject implements IComprador {

    private int id;
    private String nome;
    private String email;
    private double totalcompra;
    private double porcentagemdesconto;
    private double totalpagar;

    @Override
    public void setId(int id) throws RemoteException {
        this.id = id;
    }

    @Override
    public void setNome(String nome) throws RemoteException {
        this.nome = nome;
    }

    @Override
    public void setEmail(String email) throws RemoteException {
        this.email = email;
    }

    @Override
    public void setTotalcompra(double totalCompra) throws RemoteException {
        this.totalcompra = totalCompra;
    }

    @Override
    public int getId() throws RemoteException {
        return id;
    }

    @Override
    public String getNome() throws RemoteException {
        return nome;
    }

    @Override
    public String getEmail() throws RemoteException {
        return email;
    }

    @Override
    public double getTotalcompra() throws RemoteException {
        return totalcompra;
    }

    @Override
    public double getPorcentagemdesconto() throws RemoteException {
        return porcentagemdesconto;
    }

    @Override
    public double getTotalpagar() throws RemoteException {
        return totalpagar;
    }

    @Override
    public void calcularPorcentagemdesconto() throws RemoteException {
        if (totalcompra > 0) {
            if (totalcompra >= 0.01 && totalcompra <= 999.99) {
                porcentagemdesconto = 10;
            } else {
                if (totalcompra >= 1000 && totalcompra <= 4999.99) {
                    porcentagemdesconto = 15;
                } else {
                    if (totalcompra >= 5000.00) {
                        porcentagemdesconto = 20;

                    }
                }

            }
        }else{
            //para fins de debug ;)
            System.out.println("Server Message: Erro, valor da compra menor que 0!");
        }
    }

    @Override
    public void calcularTotalpagar() throws RemoteException {
        
       totalpagar = totalcompra - (totalcompra * (porcentagemdesconto /100));
 
    }
    public Comprador() throws RemoteException {
    }

    public Comprador(int id, String nome, String email, double totalcompra, double porcentagemdesconto, double totalpagar) throws RemoteException {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.totalcompra = totalcompra;
        this.porcentagemdesconto = porcentagemdesconto;
        this.totalpagar = totalpagar;
    }

}
