package ecommercejava;

import ecommercejava.model.Produto;

public class Carrinho {

	float valorTotal = 0;
	
	public void adicionarProduto(Produto produto) {
		valorTotal += produto.getPreco();
	}

	public float calcularTotal() {
		return valorTotal;
	}

}
