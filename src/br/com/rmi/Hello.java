package br.com.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Classname: Hello
 * Commengt: The remote interface.
 */
public interface Hello extends Remote {

	String Hello() throws RemoteException;
	
}
