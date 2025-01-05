package application2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;


public class listDesafio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> list = new ArrayList<>();
		
		System.out.println("Quantos funcionarios serão registrados? ");
		int n = sc.nextInt(); 
		
		for (int i=0; i<n; i++) {
			
			System.out.println();
			System.out.println("Empregado #" + (i+1) + " ");
			System.out.print("Id: ");		
			Integer id = sc.nextInt();
			
			//nao deixar o usuario colocar um id ja exisstente
			while(hasId(list, id)){
				System.out.println("id existente, tente outro:");
				id = sc.nextInt();
			}
			
			System.out.println("nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Empregado emp = new Empregado(id, nome, salario);
			
			list.add(emp);
			
		}
		
		
		System.out.println("coloque o id do funcionario que você deseja aumentar o salario: ");
		int procuraId = sc.nextInt();
		
		//outro metodo de achar o id com uma linha de codigo somente , usando o stream
		Empregado emp = list.stream().filter(x -> x.getId() == procuraId).findFirst().orElse(null);
		
		
		//codigo para complementar a funcao de percorrer a lista la em baixo
		//Integer pos = posicao(list, procuraId);
		
		
		if(emp == null) {
			System.out.println("Esse id nao existe");
		}else {
			System.out.print("coloque a porcentagem: ");
			double porcentagem = sc.nextDouble();
			emp.aumentoSalario(porcentagem);
			
		}
		
		
		System.out.println();
		System.out.println("Lista de funcionarios:");
		for(Empregado e : list ) {
			System.out.println(e);
		}
	
		
		sc.close();
	}
	
	//achar o id percorrendo a lista com uma funcao
	
	static Integer posicao (List<Empregado> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id)
			return i;
		}
	
	return null;
	
	
}
	//funcao para validar o id (verificar se ele ja existe )
	public static  boolean hasId(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}




