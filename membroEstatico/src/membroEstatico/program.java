package membroEstatico;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class program {

	
	
	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("enter radius");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n",Calculator.PI);
		  
		sc.close();
		
		
//	Posso usar o Calculator(classe ) sem precisar criar uma variavel da classe,
//		eu deixo os contrutores como static e ai só coloco o nome da classe como no exemplo
		
		
	}
	


}
