package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Vehicle;
import model.entities.carRental;
import model.services.BrazilTaxService;
import model.services.RentalServices;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);;

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.println("Modelo do carro:");
		String carModel = sc.nextLine();
		System.out.println("Retirada dd/MM//yyyy HH:mm ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno dd/MM//yyyy HH:mm ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
	
		carRental cr = new carRental(start, finish, new Vehicle(carModel));
		
		System.out.println("coloque o preco por hora");
		double pricePerHour = sc.nextDouble();
		System.out.println("coloque o preço por dia");
		double pricePerDay = sc.nextDouble();
		
		RentalServices rentalservices = new RentalServices(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalservices.processInvoice(cr);
		
		
		System.out.println("Fatura");
		System.out.println("pagamento basico " + cr.getInvoice().getBasicPayment());
		System.out.println("imposto " + cr.getInvoice().getTax());
		System.out.println("total " + cr.getInvoice().getTotalPayment());
		
		sc.close();
	}

}
