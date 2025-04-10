package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {
	
	//BLOCO TRY-WITH-RESOURCES
	
	//UM JEITO MAIS LEGIVEL PARA O CÓDIGO TORNANDO ELE MUITO MAIS PRATICO

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		String path = "C:\\temp\\teste.txt";
		
	//COLOCANDO AS VARIAVEIS DE LEITURA DIRETO NO BLOCO TRY, ASSIM NAO PRECISAMOS COLOCAR UM BLOCO FINALY GRANDE
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		
			
			//PARA PODER LER UMA LINHA DO ARQUIVO , SE O ARQ TIVER NO FINAL ELE VAI RETORNAR NULO
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("erro " + e.getMessage());
		}
		
		}
		
	}


