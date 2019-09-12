package br.com.calc;

import java.rmi.Naming;

public class CalculatorClient {
	public static void main(String[] args) {
		try {
			Calculator c = (Calculator) Naming.lookup("//127.0.0.1:1020/CalculatorServer");
			System.out.println("Adi��o: " + c.add(20, 15));
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
