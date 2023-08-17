package UkrimDelivery;

import java.util.ArrayList;

public class ProdutosOrganicos {
	
	private String nome;
	private double preco;
	private boolean emPromocao;
	
	public ProdutosOrganicos(String nome, double preco, boolean emPromocao) {
		this.nome = nome;
		this.preco = preco;
		this.emPromocao = emPromocao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isEmPromocao() {
		return emPromocao;
	}

	public void setEmPromocao(boolean emPromocao) {
		this.emPromocao = emPromocao;
	}
	
	public void mostrarInformacoes() {
		System.out.println("\nProduto:"+getNome());
		System.out.println("\nPreço:  - R$"+getPreco());
		System.out.println("\n------------------------");
		
	}



	
}
