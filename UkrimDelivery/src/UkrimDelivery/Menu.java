package UkrimDelivery;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		List<ProdutosOrganicos> catalogo = ListaProdutos.criarCatalogoProdutos();
		ListaProdutos produtos = new ListaProdutos();
		
		int resposta;
		int opcao; 
		
		System.out.println("\n\t    Bem-vindo ao Ukrim Delivery!\n");
		keyPress();
		
		
		while (true) {
			
			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><>");
			System.out.println("                   Ukrim Delivery                     ");
			System.out.println("     <>    Organicos Xukuru na sua Mesa     <>        ");
			System.out.println("     <>    Incentive a agricultura familiar <>        ");
			System.out.println("                                                      ");
			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><>");
			System.out.println("                                                      ");
			System.out.println("                 -----  MENU  -----                   ");
			System.out.println("                                                      ");
			System.out.println("  <1> - Fazer Cadastro                                ");
			System.out.println("  <2> - Produtos                                      ");
			System.out.println("  <3> - Itens em Promoção                             ");
			System.out.println("  <4> - Carrinho de Compras                           ");
			System.out.println("  <5> - Escolha Forma de Pagamento                    ");
			System.out.println("  <6> - Sobre nós                                     ");
			System.out.println("  <7> - Sair                                          ");
			System.out.println("                                                      ");
			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><>");
			System.out.println("            ENTRE COM A OPÇÃO DESEJADA:               ");
			System.out.println("                                                      ");
			
			
			try {
					opcao = leia.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			if(opcao==7) {
				System.out.println("\n\t\tSaindo... ");
			}
			
			switch (opcao) {
			
			case 1 : 
				System.out.println("\n\t\t<><><><><><> Faça seu Cadastro <><><><><><>");
				carrinho.fazerCadastro();
				keyPress();
				break;
				
			
			case 2 :
				System.out.println("\n<><><><><><><><><><><><><> CATÁLOGO DE PRODUTOS <><><><><><><><><><><><><>\n");
				produtos.mostrarCatalogo(catalogo);
				System.out.println("\n\t\tDeseja adicionar algum desses itens ao carrinho?  1- Sim ou 2- Não:");
				resposta = leia.nextInt();
				
				if (resposta==1) {
				
					System.out.println("\n\t\tDigite o número de um item para ADICIONAR ao carrinho: ");
					int item = leia.nextInt();
					carrinho.adicionarItem(catalogo.get(item-1));
					System.out.println("\n\t\tItem adicionado com sucesso!");
					carrinho.mostrarCarrinho();
					
				}else {
					System.out.println("\n\t\tRetornando ao MENU...");
				}
		
				
				keyPress();
				break;
				
			case 3 :
				System.out.println("\n<><><><><><><><><><><><> %  PRODUTOS EM PROMOÇÃO  % <><><><><><><><><><><><>");
				produtos.mostrarPromocoes(catalogo);
				System.out.println("\n\t\tDeseja adicionar algum desses itens ao carrinho?  1- Sim ou 2- Não:");
				resposta=leia.nextInt();
				
				if (resposta==1) {
					
					System.out.println("\n\t\tDigite o número de um item para ADICIONAR ao carrinho: ");
					int item = leia.nextInt();
					carrinho.adicionarItem(catalogo.get(item-1));
					System.out.println("\n\t\tItem adicionado com sucesso!");
					carrinho.mostrarCarrinho();
					
				}else {
					System.out.println("\n\t\tRetornando ao MENU...");
				}
				
				keyPress();
				break;
				
			case 4 :
				
				System.out.println("\n<><><><><><> CARRINHO DE COMPRAS <><><><><><>\n");
				carrinho.mostrarCarrinho();
				System.out.println("\nDeseja: \n1-ADICIONAR PRODUTOS  \n2- LIMPAR CARRINHO   \n3-FINALIZAR COMPRA \n0-SAIR ");
				resposta=leia.nextInt();
				switch(resposta) {
				
					case 1 :
						
						produtos.mostrarCatalogo(catalogo);
						System.out.println("\nDigite o número de um item para ADICIONAR ao carrinho: ");
						int item = leia.nextInt();
						carrinho.adicionarItem(catalogo.get(item-1));
						System.out.println("\n\t\tItem adicionado com sucesso!");
						carrinho.mostrarCarrinho();
						
					break;
					
					case 2 :
						carrinho.limparCarrinho();
						System.out.println("\nTodos os itens removidos! ");
						
					break;
					
					case 3 :
						carrinho.finalizarCompra();
						keyPress();
						break;
				}
				keyPress();
				break;
				
			case 5 : 
				carrinho.finalizarCompra();
				keyPress();
				break;
				
			case 6 :
			
			}
			
	}

  }
		private static void keyPress() {
		
		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
