package entities;

public class Empregados {

	private String nome;
	private String email;
	private Double salario;
	
	
	public Empregados(String nome, String email, Double salario) {
		
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Empregado: " + nome + ", email:" + email + ", salario:  R$"+ salario + "";
	}

	
	
	
	
}
