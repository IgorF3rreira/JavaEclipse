package entities;

public class PessoaJuridica extends Pessoa {

	private int FuncNum;
	
	public PessoaJuridica() {
		
	}
	
	

	public PessoaJuridica(String name, Double rendaAnual, int funcNum) {
		super(name, rendaAnual);
		FuncNum = funcNum;

	}



	public int getFuncNum() {
		return FuncNum;
	}

	public void setFuncNum(int funcNum) {
		FuncNum = funcNum;
	}

	
	
	Double res ;
	public Double taxJuridica() {
		if(getFuncNum() > 10) {
			 res =  getRendaAnual() * 14.0;
	
		}else {
			res = getRendaAnual() * 16.0;
		}
	return res;
		
	}
	
	@Override
	public String toString() {
		return getName() + ": $" + taxJuridica() ;
	}
	
	
}
