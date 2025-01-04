package application;




import java.util.Scanner;

import entities.Account;

public class conta {
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
			Account pessoa;
			
			System.out.println("Número da conta: ");
			int numero =  sc.nextInt();
			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Deseja fazer um deposito inicial? ");
			char res = sc.next().charAt(0);
			if(res == 'y') {
				System.out.println("Digite o valor: ");
				double depositoInicial = sc.nextDouble();
				pessoa = new Account(numero, nome, depositoInicial);
			}else {
				pessoa = new Account(numero,nome);
			}
			
			
			System.out.println("CONTA ABERTA");
			pessoa.contaInicial();
			

			pessoa.depositar(500);
			
			System.out.println("ATUALIZANDO -------");
			
			pessoa.ContaDeposito();

		
			pessoa.saque(800);
			System.out.println("ATUALIZANDO -------");
			pessoa.ContaSaque();
		}
		
		
	}


