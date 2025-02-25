package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		List<Product>  list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("PRODUCT #" + i+1 + " DATA: " );
			
			//fazer a verificação para sabe se é um produdo usado ou importado
			System.out.print("Commom, use or imported (c/u/i) ? ");
			char ch = sc.next().charAt(0);
			//////////////////////////////
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(ch == 'i') {
				
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				Product prod = new ImportedProduct(name, price, customsFee);
				list.add(prod);
				
			}else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String data = sc.nextLine(); 
						
				//colocar mascara na data para ficar formatada 
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				Date dataFormatada = sdf.parse(data);
				
				Product prod = new UsedProduct(name, price, dataFormatada);
				list.add(prod);
				
			}else {
				
				Product prod = new Product(name,price);
				list.add(prod);
			}
			
			
			
			
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		System.out.println();
		for(Product prod : list) {
			System.out.println(prod.toString());
		}
		
	
		sc.close();
		
		

	}

}
