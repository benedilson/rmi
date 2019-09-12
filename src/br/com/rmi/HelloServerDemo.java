package br.com.rmi;

import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.rmi.RMISecurityManager; 
import java.rmi.server.UnicastRemoteObject; 

/* 
Classname: HelloServerDemo 
Purpose: The RMI server. 
*/
public class HelloServerDemo extends UnicastRemoteObject implements Hello {

	public HelloServerDemo() throws RemoteException {
		super();
	}
	
	public String Hello() {
		System.out.println("Invocation to Hello was succesful!"); 
		return "Hello World from RMI server!"; 
	}
	
	public static void main(String[] args) {
		try {
			//Creates an object of the HelloServer class.
			HelloServerDemo obj = new HelloServerDemo();
			
			//Bind this object instance to the name "HelloServer".
			Naming.rebind("Hello", obj);
			System.out.println("Ligado no registro");
		}
		catch (Exception ex) {
			System.out.println("error: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
}
