package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int cont = sc.nextInt();
		int [] v = new int[cont];
		int [] v2 = new int[cont];
		
		for(int i=0; i<cont; i++) {
			v[i] = sc.nextInt();
			if(v[i] < 0) {
			v2[i] = v[i];
			}
		}
		
		System.out.println("NUMEROS NEGATIVOS");
		
		for(int i=0; i<cont; i++) {
			
		if(v2[i] < 0) {
		System.out.println(v2[i] );
		}
		}
		
		
		sc.close();
	}

}
