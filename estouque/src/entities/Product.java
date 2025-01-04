package entities;

public class Product {

	public String nome;
	public double preco;
	public int qtd;
	
	public double valorTotal() {
		return preco * qtd;
	}
	
	public void addProd(int qtd) {
		this.qtd += qtd;
	}
	
	public void removerProd(int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return nome + ", R$ " + String.format("%.2f", preco) + ", " + qtd + " unidades , total: R$ " + valorTotal();
	}
}
