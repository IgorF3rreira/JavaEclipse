package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lists {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Marcos");
		
		//para adicionar em uma posição especifica sem dar problema na lista
		list.add(2,"igor");
		
		System.out.println(list.size());
		
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		//remover com predicado (exemplo: remover todas as pessoas que cujo nome começam com a letra 'M')
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		
		
		System.out.println("------------------------------");
		//encontrar posição de usuario
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		//usuarios que foram removidos da lista ficam com sua posição negativa 
		System.out.println("Index of  Marcos: " + list.indexOf("Marcos"));
		
		
		
		System.out.println("------------------------------");
		//filtrar lista , temos que criar uma nova lista , passsar os valores
		//da lista que estamos queremos aplicar o filtro atrves do stream
		//vamos colocar o predicato igual quando remóve 
		//e depois transformar o stream em uma lista
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		
		System.out.println("------------------------------");
		//encontrar o primeiro elemento com base no seu predicado
		String name  = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse("nao existe");
		System.out.println(name);
		
		
		
		
	}

}
