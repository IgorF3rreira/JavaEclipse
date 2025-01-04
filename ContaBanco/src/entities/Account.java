package entities;

public class Account {

	private int number;
	private String nome;
	private double saldo;
	
	
	public Account(int number, String nome) {
		this.number = number;
		this.nome = nome;

	}


	public Account(int number, String nome, double depositoInicial) {
		this.number = number;
		this.nome = nome;
		depositar(depositoInicial);
	}


	public int getNumber() {
		return number;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}


	public void depositar(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saldo -= valor + 5.0;
	}


	public void contaInicial() {
		System.out.println("Account [Numero conta =" + number + ", nome=" + nome + ", saldo=" + saldo + "]");
	}
	
	
	public void ContaDeposito() {
		System.out.println("Numero Conta = " + number + " -- Saldo : R$ " + saldo +" ");
	}

	
	public void ContaSaque() {
		System.out.println("Numero Conta = " + number + " -- Saldo : R$ " + saldo +" ");
	}
	
	
	
	
	
}
