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
public interface IConta extends Remote {

    public boolean deposito(double vd) throws RemoteException;

    public boolean saque(double vs) throws RemoteException;

    public void setNumeroconta(int nc) throws RemoteException;

    public int getNumeroconta() throws RemoteException;

    public void setNometitular(String nt) throws RemoteException;

    public String getNometitular() throws RemoteException;

    public double getSaldo() throws RemoteException;
}
