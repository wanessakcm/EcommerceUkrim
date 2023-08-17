package UkrimDelivery;

import java.util.ArrayList;

import java.util.List;


public class ListaProdutos  {
	
	

	public static List<ProdutosOrganicos> criarCatalogoProdutos() {
    	
        List<ProdutosOrganicos> catalogoProdutos = new ArrayList<>();
        
        catalogoProdutos.add(new ProdutosOrganicos("Mandioca", 3.99, false));
        catalogoProdutos.add(new ProdutosOrganicos("Banana", 2.49, false));
        catalogoProdutos.add(new ProdutosOrganicos("Manga Rosa", 4.29, true));
        catalogoProdutos.add(new ProdutosOrganicos("Manga Espada", 3.50, true));
        catalogoProdutos.add(new ProdutosOrganicos("Acerola", 3.00, true));
        catalogoProdutos.add(new ProdutosOrganicos("Umbu", 4.00, false));
        catalogoProdutos.add(new ProdutosOrganicos("Beiju", 3.50, false));
        catalogoProdutos.add(new ProdutosOrganicos("Goma de Tapioca", 5.00, false));
        catalogoProdutos.add(new ProdutosOrganicos("Laranja", 3.90, false));
        catalogoProdutos.add(new ProdutosOrganicos("Carambola", 3.99, true));
        catalogoProdutos.add(new ProdutosOrganicos("Farinha de Mandioca", 5.60, false));
        catalogoProdutos.add(new ProdutosOrganicos("Seriguela", 6.00, false));
        catalogoProdutos.add(new ProdutosOrganicos("Cajá", 6.20, false));
        catalogoProdutos.add(new ProdutosOrganicos("Pitomba", 3.20, true));
        catalogoProdutos.add(new ProdutosOrganicos("Araçá", 4.10, true));
        catalogoProdutos.add(new ProdutosOrganicos("Jambo Rosa", 4.00, true));
        catalogoProdutos.add(new ProdutosOrganicos("Pinha", 6.15, false));
        catalogoProdutos.add(new ProdutosOrganicos("Mamão", 4.45, true));
        
        
        
        return catalogoProdutos;
    }
	
	
	  public  void mostrarCatalogo(List<ProdutosOrganicos> catalogo) {
	    	
	        for (int i = 0; i < catalogo.size(); i++) {
	            ProdutosOrganicos produto = catalogo.get(i);
	            System.out.println((i + 1) + ". " + produto.getNome() + " - R$" + produto.getPreco());
	        }
	    }

	    public  void mostrarPromocoes(List<ProdutosOrganicos> catalogo) {
	    	
	        for (int i = 0; i < catalogo.size(); i++) {
	            ProdutosOrganicos produto = catalogo.get(i);
	            if (produto.isEmPromocao()) {
	                System.out.println((i + 1) + ". " + produto.getNome() + " - R$" + produto.getPreco());
	            }
	        }
	    }
	    
	    
}
