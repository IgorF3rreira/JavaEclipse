package model.entities;

public class Usuario {
	private Integer numConta;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Usuario() {
		
	}
	
	

	public Usuario(Integer numConta, String titular, Double saldo, Double limiteSaque) {
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	//método de deposito
	public double deposito(double valor) {
		return saldo += valor;
		
	}
	
	public double saque(double valor) {
		return saldo -= valor;
	}
	
	@Override
	public String toString() {
		return "Número da contaa: " 
				+ numConta 
				+ "Titular: "
				+ titular
				+ "Saldo inicial: "
				+ saldo
				+ "Limite para saque: "
				+ limiteSaque;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	
	
}


