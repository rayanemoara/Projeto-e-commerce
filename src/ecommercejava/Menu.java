package ecommercejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    int quantidade;

    // Informações sobre produto
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

class Usuario {
    String nome;
    String email;

    // Criar conta
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}

class Carrinho {
    List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.preco * produto.quantidade;
        }
        return total;
    }
}

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Produto> produtosDisponiveis = new ArrayList<>();
        Carrinho carrinho = new Carrinho();
        Usuario usuario = null;
  
        while (true) {
        	System.out.println("\n -------------------------- ");
        	System.out.println("|1.      Criar conta        |");
        	System.out.println("|2.     Listar produtos     |");
            System.out.println("|3.   Adicionar ao carrinho |");
            System.out.println("|4.    Finalizar compra     |");
            System.out.println("|0.          Sair           |");
            System.out.println(" --------------------------- ");

        // Cadastro de produtos
        
        produtosDisponiveis.add(new Produto("Camiseta", 29.99, 10));
        produtosDisponiveis.add(new Produto("Calça", 59.99, 5));
        produtosDisponiveis.add(new Produto("Tênis", 99.99, 4));

        boolean sair = false;
        while (!sair) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	 // Criar conta
                    System.out.println("Digite seu nome:");
                    String nome = scanner.next();
                    System.out.println("Digite seu email:");
                    String email = scanner.next();

                    usuario = new Usuario(nome, email);
                    System.out.println("\nConta criada com sucesso!");
                    break;
                
                case 2:
                	// Listar produtos
                    for (Produto produto : produtosDisponiveis) {
                        System.out.println(produto.nome + " - R$" + produto.preco);
                    }
                    break;
                    
                case 3:
                	 System.out.println("Digite o código do produto:");
                	 scanner.nextLine();
                     String nomeProduto = scanner.nextLine();

                     System.out.println("\nItem " + nomeProduto + " adicionado ao carrinho!");
                     
                     break;
                
                case 4:
                	System.out.println("O total da sua compra ficou no valor de: R$" + carrinho.calcularTotal());
                   
                    break;
                    
                case 0:
                    System.out.println("Obrigado e volte sempre!");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
}