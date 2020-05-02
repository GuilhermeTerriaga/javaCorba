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
public class Conta extends UnicastRemoteObject implements IConta {

    private int numeroconta;
    private String nometitular;
    private double saldo;

    public Conta() throws RemoteException {
    }

    public Conta(int numeroconta, String nometitular, double saldo) throws RemoteException {
        this.numeroconta = numeroconta;
        this.nometitular = nometitular;
        this.saldo = saldo;
    }

    public void setNumeroconta(int nc) throws RemoteException {
        numeroconta = nc;
    }

    public int getNumeroconta() throws RemoteException {
        return numeroconta;
    }

    public void setNometitular(String nt) throws RemoteException {
        nometitular = nt;
    }

    public String getNometitular() throws RemoteException {
        return nometitular;
    }

    public double getSaldo() throws RemoteException {
        return saldo;
    }

    public boolean deposito(double vd) throws RemoteException {
        boolean deposito;
        if (vd > 0) {
            saldo = saldo + vd;
            deposito = true;
        } else {
            deposito = false;
        }
        return deposito;
    }

    public boolean saque(double vs) throws RemoteException {
        boolean saque;
        if ((saldo - vs) > 0) {
            saldo = saldo - vs;
            saque = true;
        } else {
            saque = false;
        }
        return saque;
    }
}
