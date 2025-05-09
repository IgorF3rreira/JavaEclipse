package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
			
			System.out.println("Room Number:");
			int number = sc.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			// o metoddo after serve para testar se uma data é depois da outra
			
			if(!checkOut.after(checkIn)) {
			System.out.println("Error in resevation: check-out date  must be after check-in date");
			}else {
				Reservation reservation = new Reservation(number, checkIn, checkOut);
				System.out.println("Reservation " + reservation);
				
				System.out.println();
				System.out.println("Enter the data to update the reservation: ");
				System.out.println("Check-in date (dd/MM/yyyy): ");
				 checkIn = sdf.parse(sc.next());
				System.out.println("Check-out date (dd/MM/yyyy): ");
				 checkOut = sdf.parse(sc.next());
				 
				 Date now = new Date();
				 if(checkIn.before(now) || checkOut.before(now)) {
					 System.out.println("Error in reservation: Reservation date for update must be future!");
					 
				 }else if(!checkOut.after(checkIn)){
					 System.out.println("Error in resevation: check-out date  must be after check-in date");
				 }else {
					 
				 reservation.updateDates(checkIn, checkOut);
				 System.out.println("Reservation: " + reservation);
				 }
			}
		
		sc.close();
		
	}

}
