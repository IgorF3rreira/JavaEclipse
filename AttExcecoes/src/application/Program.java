package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre na sua conta ");
		System.out.print("Número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Titular: ");
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		sc.next();
		Double saldoInicial = sc.nextDouble();
		System.out.print("Limite de saque: ");
		Double limiteSaque = sc.nextDouble();
		sc.close();
		
		
	}

}
