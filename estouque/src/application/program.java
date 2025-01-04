package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product produto = new Product();
		System.out.println("digite o produto:");
		System.out.println("nome:");
		produto.nome = sc.nextLine();
		System.out.println("preço:");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade:");
		produto.qtd = sc.nextInt();
		
		System.out.println(produto);
		
		System.out.println("adicionar produtos");
		int qtd = sc.nextInt();
		produto.addProd(qtd);
		
		
		System.out.println(""); 
		System.out.println("atualizando " + produto);
		
	
		System.out.println("remover produtos");
		 qtd = sc.nextInt();
		produto.removerProd(qtd);
		
		
		System.out.println(""); 
		System.out.println("atualizando " + produto);
		sc.close();
		
		
	}

}
