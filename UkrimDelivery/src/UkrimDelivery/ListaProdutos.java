package UkrimDelivery;

import java.util.ArrayList;

import java.util.List;


public class ListaProdutos  {
	
	

	public static List<ProdutosOrganicos> criarCatalogoProdutos() {
    	
        List<ProdutosOrganicos> catalogoProdutos = new ArrayList<>();
        
        catalogoProdutos.add(new ProdutosOrganicos("Mandioca - (1 Kg)", 3.95f, false));
        catalogoProdutos.add(new ProdutosOrganicos("Banana - (12 unidades)", 2.45f, false));
        catalogoProdutos.add(new ProdutosOrganicos("Manga Rosa - (4 unidades)", 4.20f, true));
        catalogoProdutos.add(new ProdutosOrganicos("Manga Espada - (4 unidades)", 3.50f, true));
        catalogoProdutos.add(new ProdutosOrganicos("Acerola - (500 g)", 3.00f, true));
        catalogoProdutos.add(new ProdutosOrganicos("Umbu - (500 g)", 4.00f, false));
        catalogoProdutos.add(new ProdutosOrganicos("Beiju - (1 Kg)", 5.50f, false));
        catalogoProdutos.add(new ProdutosOrganicos("Goma de Tapioca - (1 kg)", 5.00f, false));
        catalogoProdutos.add(new ProdutosOrganicos("Laranja - (5 unidades)", 3.90f, false));
        catalogoProdutos.add(new ProdutosOrganicos("Carambola - (8 unidades)", 3.90f, true));
        catalogoProdutos.add(new ProdutosOrganicos("Farinha de Mandioca - (1 Kg)", 5.60f, false));
        catalogoProdutos.add(new ProdutosOrganicos("Seriguela - (600 g)", 6.00f, false));
        catalogoProdutos.add(new ProdutosOrganicos("Cajá - ( 500 g)", 6.20f, false));
        catalogoProdutos.add(new ProdutosOrganicos("Pitomba - (400 g)", 3.20f, true));
        catalogoProdutos.add(new ProdutosOrganicos("Araçá - (400 g)", 4.10f, true));
        catalogoProdutos.add(new ProdutosOrganicos("Jambo Rosa - (8 unidades)", 4.00f, true));
        catalogoProdutos.add(new ProdutosOrganicos("Pinha - (4 unidades)", 6.15f, false));
        catalogoProdutos.add(new ProdutosOrganicos("Mamão - (2 unidades)", 4.45f, true));
        
        
        
        return catalogoProdutos;
    }
	
	
	  public  void mostrarCatalogo(List<ProdutosOrganicos> catalogo) {
	    	
	        for (int i = 0; i < catalogo.size(); i++) {
	            ProdutosOrganicos produto = catalogo.get(i);
	            System.out.println((i + 1) + ". " + produto.getNome() + " - R$ " + produto.getPreco());
	        }
	    }

	    public  void mostrarPromocoes(List<ProdutosOrganicos> catalogo) {
	    	
	        for (int i = 0; i < catalogo.size(); i++) {
	            ProdutosOrganicos produto = catalogo.get(i);
	            if (produto.isEmPromocao()) {
	                System.out.println((i + 1) + ". " + produto.getNome() + " - R$ " + produto.getPreco());
	            }
	        }
	    }
	    
	    
}
