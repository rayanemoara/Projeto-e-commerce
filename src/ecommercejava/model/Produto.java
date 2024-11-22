package ecommercejava.model;

public class Produto {

	private double preco;
	private int codigo;
	private int tipo;
	
	public Produto(double preco, int codigo, int tipo) {
		super();
		this.preco = preco;
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		String tipo ="";
		
		switch (this.tipo) {
		
		case 1: 
			tipo = "Camiseta";
			break;
			
		case 2:
			tipo = "Calça";
			break;
			
		case 3: 
			tipo = "Tênis";
			break;
			
		}
	
		System.out.println("\n___________________");
		System.out.println("\nDados do Produto: ");
		System.out.println("___________________");
		System.out.println("\nCódigo: " + this.codigo);
		System.out.println("Tipo: " + tipo);
		System.out.println("Preço: R$" + this.preco);
		
		
	}

	public static void listarTodos() {
		
	}

	}
