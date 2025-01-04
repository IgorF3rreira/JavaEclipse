//Resolvendo problema sem orientacão a objetos

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
	System.out.println("digite o tamanho dos lados do triangulo x");
	x.a= sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	
	System.out.println("digite o tamanho dos lados do triangulo y");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
			
	
	
	
	double areaX = x.area();
	

	
	double areaY = y.area();
	
	System.out.printf("a area do triangulo x = %.4f%n ",areaX);
	System.out.printf("a area do triangulo y = %.4f%n ",areaY);
	
	if(areaX > areaY) {
		System.out.println("maior area é do triangulo X");
		
	}else {
		System.out.println("maior area é do triangulo Y");
		}
	
	sc.close();
	}
	
	
	
	}
	
