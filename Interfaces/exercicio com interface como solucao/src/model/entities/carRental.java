package model.entities;


import java.time.LocalDateTime;

public class carRental {

	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Vehicle vehicle;
	private invoice Invoice;
	
	public carRental() {
		
	}

	public carRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle ) {

		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public invoice getInvoice() {
		return Invoice;
	}

	public void setInvoice(invoice invoice) {
		Invoice = invoice;
	}
	
	
	


	
	
}
