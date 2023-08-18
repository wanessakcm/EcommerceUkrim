package UkrimDelivery;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import UkrimDelivery.util.*;




public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		List<ProdutosOrganicos> catalogo = ListaProdutos.criarCatalogoProdutos();
		ListaProdutos produtos = new ListaProdutos();
		
		int resposta;
		int opcao; 
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"                                                                                                          ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"                                            BEM VINDO AO                                                  ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"                                                                                                          ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"                                                                                                          ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\t██╗   ██╗██╗  ██╗██████╗ ██╗███╗   ███╗    ██████╗ ███████╗██╗     ██╗██╗   ██╗███████╗██████╗ ██╗   ██╗ ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\t██║   ██║██║ ██╔╝██╔══██╗██║████╗ ████║    ██╔══██╗██╔════╝██║     ██║██║   ██║██╔════╝██╔══██╗╚██╗ ██╔╝ ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\t██║   ██║█████╔╝ ██████╔╝██║██╔████╔██║    ██║  ██║█████╗  ██║     ██║██║   ██║█████╗  ██████╔╝ ╚████╔╝  ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\t██║   ██║██╔═██╗ ██╔══██╗██║██║╚██╔╝██║    ██║  ██║██╔══╝  ██║     ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗  ╚██╔╝   ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\t╚██████╔╝██║  ██╗██║  ██║██║██║ ╚═╝ ██║    ██████╔╝███████╗███████╗██║ ╚████╔╝ ███████╗██║  ██║   ██║    ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\t ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚═╝     ╚═╝    ╚═════╝ ╚══════╝╚══════╝╚═╝  ╚═══╝  ╚══════╝╚═╝  ╚═╝   ╚═╝    ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"                                                                                                          ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"                      ONDE AS RAÍZES DO PASSADO SUSTENTAM O PROGRESSO DO FUTURO                           ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"                                                                                                          ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"                                                                                                          ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\t  Somos mais do que um simples e-commerce, somos uma conexão direta com a riqueza da terra, a tradição   \nancestral e a sustentabilidade ambiental. Nossa missão é promover e preservar a cultura e os saberes do   \npovo indígena Xukuru do Ororubá, ao mesmo tempo em que levamos até você os melhores produtos orgânicos    \ncultivados por essas comunidades agrícolas familiares.\t\t\t\t                          ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"                                                                                                          ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"                                                                                                          ");
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n\n <>\t\t\t\t     <>    Boas Compras!    <>  \t\t\t\t       <> ");
		keyPress();
		
		
		while (true) {
			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+
					           "<><><><><><><><><><><><><><><><><><><><><><><><><><><>");
			System.out.println("                                                      ");
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
			System.out.println("                                                      "+Cores.TEXT_RESET);
			
			
			try {
					opcao = leia.nextInt();
			}catch(InputMismatchException e) {
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			if(opcao==7) {
				System.out.println(Cores.TEXT_WHITE_BOLD+"\n\t\tSaindo... ");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1 : 
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n<><><><><><><><><><><><><> FAZER CADASTRO <><><><><><><><><><><><><>\n"+Cores.TEXT_RESET);
				carrinho.fazerCadastro();
				keyPress();
				break;
				
			
			case 2 :
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n<><><><><><><><><><><><><> CATÁLOGO DE PRODUTOS <><><><><><><><><><><><><>\n"+Cores.TEXT_RESET);
				produtos.mostrarCatalogo(catalogo);
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n\tDeseja adicionar algum desses itens ao carrinho?  1- Sim ou 2- Não:"+Cores.TEXT_RESET);
				resposta = leia.nextInt();
				
				if (resposta==1) {
				
					System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n\t\tDigite o número de um item para ADICIONAR ao carrinho: "+Cores.TEXT_RESET);
					int item = leia.nextInt();
					carrinho.adicionarItem(catalogo.get(item-1));
					System.out.println("\n\t\tItem adicionado com sucesso!");
					carrinho.mostrarCarrinho();
					carrinho.calcularTotal();
					
				}else {
					System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n\t\tRetornando ao MENU...");
				}
		
				
				keyPress();
				break;
				
			case 3 :
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n<><><><><><><><><><><><> %  PRODUTOS EM PROMOÇÃO  % <><><><><><><><><><><><>"+Cores.TEXT_RESET);
				produtos.mostrarPromocoes(catalogo);
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n\t\tDeseja adicionar algum desses itens ao carrinho?  1- Sim ou 2- Não:"+Cores.TEXT_RESET);
				resposta=leia.nextInt();
				
				if (resposta==1) {
					
					System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n\t\tDigite o número de um item para ADICIONAR ao carrinho: "+Cores.TEXT_RESET);
					int item = leia.nextInt();
					carrinho.adicionarItem(catalogo.get(item-1));
					System.out.println("\n\t\tItem adicionado com sucesso!");
					carrinho.mostrarCarrinho();
					carrinho.calcularTotal();
					
				}else {
					System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n\t\tRetornando ao MENU...");
				}
				
				keyPress();
				break;
				
			case 4 :
				
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n<><><><><><> CARRINHO DE COMPRAS <><><><><><>\n"+Cores.TEXT_RESET);
				carrinho.mostrarCarrinho();
				carrinho.calcularTotal();
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\nDeseja: \n1-ADICIONAR PRODUTOS  \n2- LIMPAR CARRINHO   \n3-FINALIZAR COMPRA \n0-SAIR "+Cores.TEXT_RESET);
				resposta=leia.nextInt();
				switch(resposta) {
				
					case 1 :
						
						produtos.mostrarCatalogo(catalogo);
						System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\nDigite o número de um item para ADICIONAR ao carrinho: "+Cores.TEXT_RESET);
						int item = leia.nextInt();
						carrinho.adicionarItem(catalogo.get(item-1));
						System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n\t\tItem adicionado com sucesso!"+Cores.TEXT_RESET);
						carrinho.mostrarCarrinho();
						carrinho.calcularTotal();
						
					break;
					
					case 2 :
						carrinho.limparCarrinho();
						System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\nTodos os itens removidos! "+Cores.TEXT_RESET);
						
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
				System.out.println("\n\t\t\t\t\t\t  SOBRE NÓS\n\n\n");
				carrinho.sobreNos();
				keyPress();
				break;
			
			}
			
	}

  }
		private static void keyPress() {
		
		try {

			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND+"\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
