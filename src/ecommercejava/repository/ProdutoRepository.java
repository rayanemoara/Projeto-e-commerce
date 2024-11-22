package ecommercejava.repository;

import ecommercejava.model.Produto;

public interface ProdutoRepository {

	// CRUD
		public Produto procurarProduto(int codigo);
		public void listarTodos();
		public void cadastrar(Produto produto);
		public void atualizar(Produto produto);
		public void excluir(int codigo);

}