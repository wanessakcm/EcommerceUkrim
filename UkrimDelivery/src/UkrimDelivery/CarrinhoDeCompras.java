package UkrimDelivery;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;




public class CarrinhoDeCompras {
	
	Scanner leia = new Scanner (System.in);
	private List<ProdutosOrganicos> carrinho = new ArrayList<>();

	public CarrinhoDeCompras() {
		
	}

	public List<ProdutosOrganicos> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(List<ProdutosOrganicos> carrinho) {
		this.carrinho = carrinho;
	}
	
	public void adicionarItem(ProdutosOrganicos codigo) {
		carrinho.add(codigo);
	}
	
	public void removerItem(int indice) {
		if (indice >= 0 && indice < carrinho.size());{// O indice tem que ser  menor que o tamanho da minha lista de itens
			carrinho.remove(indice);
		}	
	}
	public void mostrarCarrinho() {
		
		for(ProdutosOrganicos item : carrinho) {
			
			if (carrinho.isEmpty()) {
				System.out.println("\nO seu carrinho está vazio, adicione algum produto!");
			}else {
				item.mostrarInformacoes();
				System.out.println("Total:  R$" +calcularTotal());
			}
		}   
		
		
	}
	public  double calcularTotal() {
		double total = 0;
		for(ProdutosOrganicos codigo : carrinho  ) {
			total += codigo.getPreco();
		}
		return total;
	}
	
	public void fazerCadastro() {
		
		System.out.println("Nome: ");
		String nomeCliente = leia.nextLine();
		
		System.out.println("\nEndereço: "); 
		String enderecoCliente = leia.nextLine();
		
		System.out.println("\nTelefone: ");
		String telefoneCliente = leia.nextLine();
		
		System.out.println("\nCadastro realizado com sucesso, Boas Compras!");
		
	}
	
	public void limparCarrinho() {
		carrinho.clear();
	}
	
	public void finalizarCompra() {
		
		System.out.println("\nEscolha a Forma de Pagamento:");
		System.out.println("\n1- Cartão de Crédito ou Débito");
		System.out.println("\n2- PIX");
		System.out.println("\n\t\t0- SAIR");
		int opcaoPagamento = leia.nextInt();
		 switch (opcaoPagamento) {
		 case 1: 
			 System.out.println("\nPagamento realizado no Cartão com SUCESSO!");
			 break;
		 case 2 : 
			 System.out.println("\nPagamento realizado no PIX com SUCESSO!");
			 break;
		 case 0 : 
			 System.out.println("\nSaindo...");
			 break;
		 default:
			 System.out.println("\nOpçãp Inválida!");
		 }
	}
	




}
