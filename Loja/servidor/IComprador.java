/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilherme
 */

import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.function.Function;

public interface IComprador extends Remote {
    public void setId(int id) throws RemoteException;

    public void setNome(String nome) throws RemoteException;

    public void setEmail(String email) throws RemoteException;

    public void setTotalcompra(double totalCompra)throws RemoteException;

    public int getId() throws RemoteException;

    public String getNome() throws RemoteException;

    public String getEmail() throws RemoteException;

    public double getTotalcompra() throws RemoteException;

    public double getPorcentagemdesconto() throws RemoteException;

    public double getTotalpagar() throws RemoteException;

    public void calcularPorcentagemdesconto() throws RemoteException;

    public void calcularTotalpagar() throws RemoteException;
}
