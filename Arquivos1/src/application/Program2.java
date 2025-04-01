package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FILE READER 
		// BUFFEREDREADER
		
		
		String path = "C:\\temp\\teste.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			//A INSTANCIA DO BUFFERED É A PARTIR DO FR , PEGA A STREAM BASICA E USA NO BUFFER QUE DEIXA MAIS RAPIDO A LEITURA E FLEXIVEL
			br = new BufferedReader(fr);
			
			//PODE TBM CODAR ESSA PARTE DESTE JEITO ABAIXO
			//br = new BufferedReader(fr = new FileReader(path));
			
			//PARA PODER LER UMA LINHA DO ARQUIVO , SE O ARQ TIVER NO FINAL ELE VAI RETORNAR NULO
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("erro " + e.getMessage());
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				//para caso nao consiga fechar os leitores ele mostra direitinho o erro que aconteceu
				e.printStackTrace();
			}
			
		}
		
	}

}
