package model.services;

import java.time.Duration;

import model.entities.carRental;
import model.entities.invoice;

public class RentalServices {
	private Double pricePerHour;
	private Double pricePerday;
	
	private BrazilTaxService taxService;

	public RentalServices(Double pricePerHour, Double pricePerday, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerday = pricePerday;
		this.taxService = taxService;
	}
	
	public void processInvoice(carRental CarRental) {
		
		double minutes = Duration.between(CarRental.getStart(), CarRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		
		//fazer o codigo para colocar a condicional de q se passar 12 horas de uso vai ser cobrado o dia~
		double basicPayment;
		if(hours <= 12.0) {
			//a funcão math.ceil esta sendo usado para arredondar as horas , essa funcao pega o teto do numero
			basicPayment = pricePerHour * Math.ceil(hours);
		}else {
			//calcular as horas em dias
			basicPayment = pricePerday * Math.ceil(hours / 24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		CarRental.setInvoice(new invoice(basicPayment, tax));
	}
	
	
}
