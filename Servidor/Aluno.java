import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;


public class Aluno extends UnicastRemoteObject implements IAluno{
	
	private int rgm;
	private String nome;
	private double med1;
	private double med2;
	private double medf;
	
	public Aluno() throws RemoteException
	{}
	
	public void setRgm(int r) throws RemoteException{
		rgm =r;
	}
		
	public void setNome(String name) throws RemoteException{
		nome = name;
	}
	
	public void setMed1(double nota1) throws RemoteException{
		med1 = nota1;
	}
	
	public void setMed2(double nota2) throws RemoteException{
		med2 = nota2;
	}
	
	public int getRgm() throws RemoteException{
		return rgm;
	}
	
	public String getNome() throws RemoteException{
		return nome;
	}
	
	public double getMed1() throws RemoteException{
		return med1;
	}
	
	public double getMed2() throws RemoteException{
		return med2;
	}
	
	public double getMedf() throws RemoteException{
		return medf;
	}
	
	public void calcularMedia() throws RemoteException{
		medf = (med1 + med2)/2;
	}

	public boolean isApproved() throws RemoteException{
		boolean aux = false;
		if (medf>=5){
			aux = true;
		}
		return aux;
	}
}