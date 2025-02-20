package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("ENTER CLIENT DATA: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("email:");
		String email = sc.nextLine();
		
		System.out.print("Birth date: ");
		String birthDateString = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date birthDate = sdf.parse(birthDateString);
		
		//criando dados do cliente
		Client client = new Client(name, email, birthDate);
	
		//teste para ver se esta funcionado a impressao do cliente
		//System.out.println(client);
		
		System.out.println("ENTER ORDER DATA: ");
		
		
		LocalDateTime date = LocalDateTime.now();
		
		//para fazer a formatacao da data e hora
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
		 
		 //formatando a data
		 String formattedDate = date.format(formatter);
		
		System.out.println("Status: ");
		String Status = sc.nextLine();
			
		//criar o status do procedimento da compra antes de prosseguir 
		Order status = new Order( formattedDate , OrderStatus.valueOf(Status));
		
		
		System.out.print("how many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		//criar o vetor para armazenar os dados de acordo com a quantidade de repetição do laço
		 List<OrderItem> orderItems = new ArrayList<>();
		
		// List<Product> products = new ArrayList<>();
	
		
		// Variável para calcular o preço total
	        double totalPrice = 0.0;
	        
		for(int i = 0 ; i < n; i++) {
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			Product product = new Product(productName, price);
		 
		 
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			OrderItem orderItem = new OrderItem(product,quantity, price);
			
			orderItems.add(orderItem);
			
			// Calcularo preço total
            totalPrice += orderItem.subTotal();  
			
			
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("ORDER SUMMARY");
		System.out.println(status);
		System.out.println(client);
		System.out.println("Order items: ");
		System.out.println(orderItems);
		System.out.println("========");
		System.out.println("Total Price: " + totalPrice);
		
		
		
		sc.close();
		
	}

}