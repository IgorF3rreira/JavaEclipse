package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Product(name, preco);
			
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++ ) {
			soma += vect[i].getPreco();
		}
		
		double avg = soma/n;
		
		System.out.printf("A média dos preços é de: %.2f%n",avg);
		
		sc.close();
	}
  
}
