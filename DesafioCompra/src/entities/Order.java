package entities;




import entities.enums.OrderStatus;

public class Order {

	private String date;
	private OrderStatus status;
	
	
	public  Order() {
		
	}


	public Order(String date, OrderStatus status) {
	
		this.date = date;
		this.status = status;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Order moment " + date + "\n" + "Order status: " + status ;
	}
	
	
	
	
	
	
	
	
}
