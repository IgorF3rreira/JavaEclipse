package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//criar a variavel file com o caminho especificado para poder encontrar o arquivo
		// o objeto vai encapsular o caminho
		File file = new File("C:\\temp\\teste.txt");
		
		//instanciar o scanner para o file
		Scanner sc = null;
		
		//colocando o try porque pode dar um IOexception como erro
		try {
			sc = new Scanner(file);
			//usando o has pra saber se tem linha no arquivo que queremos acessar
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				
			}
		}catch(IOException e) {
			System.out.println("Erro " + e.getMessage());
		}finally {
			//para poder fechar o recurso de scanner independente se deu certo ou errado o try
			//Usando o if porq pode dar uma excessao por conta dele reconhecer como nulo o scanner
			if(sc != null) {
			sc.close();
			}
		}

	}

}
