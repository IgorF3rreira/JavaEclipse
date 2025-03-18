package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
			//Fazer o try para para poder tratar o código, vamos jogar então
			//todo esse código para o try fazer o tratamento de exceções
			try {
				System.out.println("Room Number:");
				int number = sc.nextInt();
				System.out.println("Check-in date (dd/MM/yyyy): ");
				Date checkIn = sdf.parse(sc.next());
				System.out.println("Check-out date (dd/MM/yyyy): ");
				Date checkOut = sdf.parse(sc.next());
				
				// o metoddo after serve para testar se uma data é depois da outra
				
				
					Reservation reservation = new Reservation(number, checkIn, checkOut);
					System.out.println("Reservation " + reservation);
					
					System.out.println();
					System.out.println("Enter the data to update the reservation: ");
					System.out.println("Check-in date (dd/MM/yyyy): ");
					 checkIn = sdf.parse(sc.next());
					System.out.println("Check-out date (dd/MM/yyyy): ");
					 checkOut = sdf.parse(sc.next());
					
					 reservation.updateDates(checkIn, checkOut);
					 System.out.println("Reservation: " + reservation);
			}catch(ParseException e) {
				System.out.println("Invalid date format");
			}catch(DomainException e) {
				System.out.println("Error in reservation " + e.getMessage());
			}
			//catch com o runtime para qualquer erro inesperado
			catch(RuntimeException e) {
				System.out.println("Unexpected error");
			}
		
		sc.close();
		
	}

}
