import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public interface IAluno extends Remote{
	
	public void setRgm(int r) throws RemoteException;
	public void setNome(String n) throws RemoteException;
	public void setMed1(double nota) throws RemoteException;
	public void setMed2(double nota) throws RemoteException;
	
	public int getRgm() throws RemoteException;
	public String getNome() throws RemoteException;
	public double getMed1() throws RemoteException;
	public double getMed2() throws RemoteException;
	public double getMedf() throws RemoteException;
	
	public void calcularMedia() throws RemoteException;
	public boolean isApproved() throws RemoteException;
	
}