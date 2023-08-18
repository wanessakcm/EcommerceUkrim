package UkrimDelivery;

import java.util.ArrayList;

public class ProdutosOrganicos {
	
	private String nome;
	private float preco;
	private boolean emPromocao;
	
	public ProdutosOrganicos(String nome, float preco, boolean emPromocao) {
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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public boolean isEmPromocao() {
		return emPromocao;
	}

	public void setEmPromocao(boolean emPromocao) {
		this.emPromocao = emPromocao;
	}
	
	public void mostrarInformacoes() {
		System.out.println("\nProduto: "+getNome());
		System.out.println("\nPreço:  - R$ "+getPreco());
		System.out.println("\n------------------------");
		
	}



	
}
