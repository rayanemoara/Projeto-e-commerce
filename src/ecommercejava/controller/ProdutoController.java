package ecommercejava.controller;

import java.util.ArrayList;

import ecommercejava.model.Produto;
import ecommercejava.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto>estoque = new ArrayList<Produto>();
	
	int codigo = 0;
	

	@Override
	public void listarTodos() {
		for (var produto: estoque) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
		estoque.add(produto);
		System.out.println("Produto " + produto.getCodigo() +  " adicionado ao estoque!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		var procuraNoEstoque = procurarProduto(produto.getCodigo());
		if (procuraNoEstoque!= null) {
		estoque.set(estoque.indexOf(procuraNoEstoque), produto);
		System.out.println("Atualizado com sucesso!");
		
		} else {
			System.out.println("Produto não foi encontrado.");
		}
		
	}

	@Override
	public void excluir(int codigo) {
		var produto = procurarProduto(codigo);
		if (produto != null) {
			if (estoque.remove(produto) == true) {
				System.out.println("\nO Produto de código: " + codigo + " foi removido com sucesso!");
			}
		} else {
			System.out.println("\nO produto de código: " + codigo + " não existe no Estoque!");
		}
		
		
	}
	
	public int gerarCodigo() {
		return ++ codigo;
	}
	
	@Override
	public Produto procurarProduto(int codigo) {
		for (Produto produto : estoque) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}
		
		return null;
	}


		

	public String getNome() {
		return null;
	}

	
	}