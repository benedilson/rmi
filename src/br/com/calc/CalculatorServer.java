package br.com.calc;

import java.rmi.Naming;

public class CalculatorServer {
	public CalculatorServer() {
		try {
			Calculator c = new CalculatorImple();
			Naming.rebind("RMI://127.0.0.1:1020/CalculatorServer", c);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new CalculatorServer();
	}
}
