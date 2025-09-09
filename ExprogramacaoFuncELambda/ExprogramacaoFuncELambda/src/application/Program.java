package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Empregados;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("coloque o diretório do arquivo: ");
		String arquivo = sc.nextLine();
		
		System.out.println("coloque o valor do salario limite: ");
		Double salario = sc.nextDouble();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(arquivo))){
			
			List<Empregados> list = new ArrayList<>();
			
			String linha = br.readLine();
			while(linha != null) {
				
				String [] espaco = linha.split(",");
				list.add(new Empregados(espaco[0], espaco[1], Double.parseDouble(espaco[2])));
				linha = br.readLine();
			}
			
			double somaSalario = list.stream()
					.filter(n -> n.getNome().toLowerCase().startsWith("a"))
					.map(s -> s.getSalario())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Soma dos salarios: " + String.format("%.2f", somaSalario));
			
			List<String> nomes = list.stream()
					.map(n -> n.getNome())
					.collect(Collectors.toList());
			
			
			
			Comparator<String> ord = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			
			List<String> email = list.stream()
					.filter(e -> e.getSalario() > salario)
					.map(e -> e.getEmail())
					.sorted(ord)
					.collect(Collectors.toList());
			
			email.forEach(System.out::println);
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
