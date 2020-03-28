import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Servidor
{
     public static void main(String args[]) 
    {        
        try 
       {
            // Criar o objeto 
            Aluno aserv = new Aluno();
			
			LocateRegistry.createRegistry(1099);
            
            // Cadastrando o objeto no registry
            Naming.rebind("//localhost/aluno",aserv);
            
			
			System.out.println("cadastrando aluno");
       }
       catch (Exception e) 
      {
          System.out.println("erro: " + e.getMessage());
       }
   }
}
