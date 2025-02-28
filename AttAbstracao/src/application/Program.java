package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n ; i++) {
			System.out.println("Tax payer #" + i+1 + " data:");
			
			System.out.print("Individual or company (i/c)? ");
		
			char ch = sc.next().charAt(0);	sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.println("Health expenditures: ");
				double expense = sc.nextDouble();
				
				list.add(new PessoaFisica(name, rendaAnual, expense) );
				
			}else {
				System.out.println("Numbers of employees: ");
				int emp = sc.nextInt();
				
				list.add(new PessoaJuridica(name, rendaAnual, emp));
			}
			
			
			
			
			
		}
		
		System.out.println();
		  for (Pessoa pessoa : list) {
	            System.out.println(pessoa); // O método toString será chamado automaticamente
	        }
		
		
	}

}