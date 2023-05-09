package ProdutoArray;

public class Produto {

	private String nome;
	private double valor;
	
	Produto (String nome,double valor2){
		
		this.nome = nome;
		this.valor = valor2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
	
}
