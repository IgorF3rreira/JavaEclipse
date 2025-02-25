package entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct() {
		
	}
	
	
	

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}




	public Double getCustomsFree() {
		return customsFee;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFee = customsFree;
	}
	
	public double totalPrice() {
		return super.getPrice() + customsFee;
	}
	

	@Override
	public String toString() {
		return  super.getName() + " $ " + totalPrice()  + "(Customs Fee: $ " + customsFee + ")";
	}
	
	
	
}
