package br.com.calc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImple extends UnicastRemoteObject implements Calculator {

	protected CalculatorImple() throws RemoteException {
		super();
	}
	
	public long add(long a, long b) throws RemoteException {
		return a + b;
	}
	
}
