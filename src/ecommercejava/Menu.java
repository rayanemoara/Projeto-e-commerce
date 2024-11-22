package ecommercejava;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommercejava.model.Produto;
import ecommercejava.model.Calça;
import ecommercejava.model.Camiseta;
import ecommercejava.model.Tenis;
import ecommercejava.model.Usuario;
import ecommercejava.controller.ProdutoController;


public class Menu {

	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();
		
		Carrinho carrinho = new Carrinho();
		
		Scanner scanner = new Scanner(System.in);
		int opcao, codigo, tipo;
        double preco;
		
        Calça calça = new Calça(59.90d, 1, 2);
		produtos.cadastrar(calça);
        
        Camiseta camiseta = new Camiseta(29.90d, 2, 1);
        produtos.cadastrar(camiseta);
        
        Tenis tenis = new Tenis(79.90d, 3, 3);
        produtos.cadastrar(tenis);
		
		while (true) {

			while (true) {
	        	System.out.println("\n -------------------------- ");
	        	System.out.println("|1.      Criar Conta        |");
	        	System.out.println("|2.     Listar produtos     |");
	            System.out.println("|3.   Adicionar ao carrinho |");
	            System.out.println("|4.    Finalizar compra     |");
	            System.out.println("|0.          Sair           |");
	            System.out.println(" --------------------------- ");

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				scanner.nextLine();
				opcao = 0;
			}

				if (opcao == 9) {
					System.out.println("\nMoara's Jeans e Calçados, Seu esquadrão da Moda!");
					sobre();
					scanner.close();
					System.exit(0);
			}
				
				
				switch (opcao) {
				case 1:
					System.out.println("Digite seu nome:");
                    String nome = scanner.next();
                    System.out.println("Digite seu email:");
                    String email = scanner.next();

                System.out.println("\nConta criada com sucesso!");
                    break;

				case 2:
					System.out.println("\nLista dos produtos");
	                   produtos.listarTodos();
	                   break;
				
				case 3:
					
					System.out.println("Adicionar um item ao carrinho");
					System.out.print("Item: ");
					codigo = scanner.nextInt();
					carrinho.adicionarProduto(produtos.procurarProduto(codigo));
					pressKey();
                    
					System.out.println("\nItem adicionado ao carrinho!");
                    
                    break;
					
				case 4:
					
					System.out.println("\nO total da sua compra ficou no valor de: R$" + carrinho.calcularTotal());
					
					break;
					
				case 0:
					
					System.out.println("\nCompra finalizada! Obrigada e volte sempre!");
                    System.exit(0);
                    break;
                    
				default:
                    System.out.println("Opção inválida.");
                    
				}
				
			}
			
			   }

		}
		
			   private static void pressKey() {
		
	}

			public static void sobre() {
				System.out.println("\n--------------------------------------------------");
				System.out.println("Projeto Desenvolvido por: Rayane Moara da Silva");
				System.out.println("Contato - moararayane@gmail.com");
				System.out.println("GitHub - https://github.com/rayanemoara");
				System.out.println("----------------------------------------------------");

			   }

				public static void keyPress() {

					try {

						System.out.println("\n\nPressione Enter para Continuar...");
						System.in.read();

					} catch (IOException e) {

						System.out.println("Você pressionou uma tecla diferente de enter!");
					}
				}
			}