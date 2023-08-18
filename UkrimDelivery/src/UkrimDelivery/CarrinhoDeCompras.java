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
			}
			
		}   
		
		
	}
	public  float calcularTotal() {
		float total = 0;
		for(ProdutosOrganicos codigo : carrinho  ) {
			total += codigo.getPreco();
			
		}
		System.out.println("Total: R$ - "+total);
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
			 System.out.println("\nObrigada e volte sempre!");
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
	
	public void  sobreNos() {
		
		System.out.println("\t\t\t\t\t\tNossa História\r\n"
				+ "\r\n"
				+ "\tTerra Xukuru Orgânicos nasceu do desejo de valorizar e honrar a sabedoria tradicional dos povos indígenas Xukuru do Ororubá,\n que por gerações vêm cuidando das terras e cultivando alimentos de maneira sustentável e em harmonia com a natureza. Nosso\n projeto surge como um elo entre essas comunidades e você, conscientizando sobre a importância da preservação ambiental e do\n apoio às economias locais.\r\n\n"
				+ "\r\n"
				+ "\t\t\t\t\t\tNossa Missão\r\n"
				+ "\r\n"
				+ "\tNossa missão é dupla e intrinsecamente entrelaçada. Em primeiro lugar, estamos comprometidos em oferecer produtos orgânicos\n de alta qualidade, cultivados sem o uso de pesticidas ou produtos químicos prejudiciais, proporcionando a você alimentos\n mais saudáveis e nutritivos. Em segundo lugar, acreditamos que a comercialização desses produtos é uma forma poderosa de\n empoderar as comunidades Xukuru do Ororubá, ajudando-as a alcançar autonomia econômica e a manter vivas suas tradições culturais.\r\n\n"
				+ "\r\n"
				+ "\t\t\t\t\t\tNossos Produtos\r\n"
				+ "\r\n"
				+ "\tCada item em nosso catálogo é cuidadosamente selecionado para garantir que você receba produtos frescos, saborosos e genuínos,\n que carregam consigo a história e os valores das comunidades que os cultivam. De frutas exuberantes a vegetais vibrantes,\n ervas aromáticas e cereais nutritivos, nossa variedade reflete a diversidade das plantações Xukuru do Ororubá e a riqueza do\n solo que as nutre.\r\n\n"
				+ "\r\n"
				+ "\t\t\t\t\t      Compromisso Ambiental\r\n"
				+ "\r\n"
				+ "\tA Terra Xukuru Orgânicos tem um compromisso inabalável com a preservação ambiental e a sustentabilidade. Trabalhamos em harmonia\n com a natureza, seguindo práticas agrícolas que respeitam o ciclo natural dos cultivos e minimizam os impactos negativos no\n ecossistema. Através da nossa parceria com as comunidades Xukuru do Ororubá, também promovemos a conservação das florestas e o\n uso responsável dos recursos naturais.\r\n\n"
				+ "\r\n"
				+ "\t\t\t\t\t\t  Impacto Social\r\n"
				+ "\r\n"
				+ "\tAo escolher a Terra Xukuru Orgânicos, você está contribuindo diretamente para o fortalecimento das comunidades indígenas Xukuru\n do Ororubá. Parte de nossas receitas é reinvestida em projetos de educação, saúde e desenvolvimento sustentável dentro dessas\n comunidades, buscando criar um ciclo virtuoso de prosperidade e bem-estar.\r\n\n"
				+ "\r\n"
				+ "\tAgradecemos por fazer parte desta jornada conosco. Cada compra que você realiza não é apenas um ato de consumo, mas uma escolha\n consciente por alimentos saudáveis, pela preservação cultural e pela promoção da justiça social. Juntos, estamos construindo um\n futuro mais resiliente, mais justo e mais conectado com a essência da terra.\r\n\n"
				+ "\r\n"
				+ "\n\t\tSeja bem-vindo à Ukrim Delivery, onde as raízes do passado sustentam o crescimento do futuro.");
		
		System.out.println("\n\n\t\t\t\t\t\t Retornando ao MENU...");
	}
	




}
