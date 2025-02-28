package entities;

public class PessoaFisica extends Pessoa {

	private Double expense;
	
	public PessoaFisica() {
		
	}
	
	

	public PessoaFisica(String name, Double rendaAnual, Double expense) {
		super(name, rendaAnual);
		this.expense = expense;
	}



	public Double getExpense() {
		return expense;
	}

	public void setExpense(Double expense) {
		this.expense = expense;
	}
	
	
	
	Double res ;
	public Double taxFisica() {
		if(getRendaAnual() < 2000.00 && expense > 0) {
			 res = (getRendaAnual() * 15.0) - (expense * 50.0);
	
		}else if(getRendaAnual() > 2000.00 && expense > 0 ) {
			 res = (getRendaAnual() * 25.0) - (expense * 50.0);
		}
	return res;
		
	}



	@Override
	public String toString() {
		return getName() + ": $" + taxFisica() ;
	}
	
	
	
	
}
