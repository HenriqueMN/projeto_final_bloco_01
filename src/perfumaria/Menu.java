package perfumaria;

import java.io.IOException;
import java.util.Scanner;

import perfumaria.controller.PerfumariaController;
import perfumaria.model.Cabelo;
import perfumaria.model.Esmalte;

public class Menu {
	
	/*
	 * Funções
	 */
	
	// Função para interromper o fluxo de programa até a tecla enter ser pressionada (uso, no geral, para o usuário poder ler antes do programa seguir)
	public static void pressEnter() {
		try {
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

	public static void main(String[] args) {
		/*
		 * Criação do Scanner e das variáveis
		 */
		int opcao;
		Scanner input = new Scanner(System.in);
		
		/*
		 * Informação dos produtos
		 */
		
		String nome;
		int id, tipo = 0, tipoEsmalte = 0, tipoCabelo = 0;
		float preco;
		
		/*
		 * Instanciando o Controller
		 */
		
		PerfumariaController controlador = new PerfumariaController();
		
		/*
		 * Testes - comentar depois
		 */
		
		/*
		// Teste dos esmaltes
		Esmalte esmalte01 = new Esmalte("Primavera alegre", 1, 1, 3.99f, 1);
		Esmalte esmalte02 = new Esmalte("Outono triste"   , 2, 1, 5.99f, 2);
		Esmalte esmalte03 = new Esmalte("Verão brilhante" , 3, 1, 6.99f, 3);
		
		System.out.println("          ESMALTES          ");
		System.out.println("----------------------------");
		esmalte01.visualizar();
		esmalte02.visualizar();
		esmalte03.visualizar();
		
		pressEnter();
		input.nextLine();
		
		// Teste dos cabelos
		Cabelo cabelo01 = new Cabelo("Liso eterno"		  , 4, 2, 25.99f, 1);
		Cabelo cabelo02 = new Cabelo("Ondulado praieiro"  , 5, 2, 30.99f, 2);
		Cabelo cabelo03 = new Cabelo("Cacheado intrincado", 6, 2, 32.99f, 3);
		Cabelo cabelo04 = new Cabelo("Crespo poderoso"	  , 7, 2, 35.99f, 4);
		
		System.out.println("           CABELOS           ");
		System.out.println("-----------------------------");
		cabelo01.visualizar();
		cabelo02.visualizar();
		cabelo03.visualizar();
		cabelo04.visualizar();
		
		pressEnter();
		
		*/
		
		/*
		 * Cabeçalho
		 */
		System.out.println("*****************************");
		System.out.println("*                           *");
		System.out.println("*       PERFUMARIA 69       *");
		System.out.println("*                           *");
		System.out.println("*****************************");
		System.out.println("Esmaltes e produtos de cabelo");
		System.out.println("------------------------------");
		System.out.println("\nPressione Enter para exibir o menu.");
		pressEnter();
		
		/*
		 * Menu
		 */
		
		// Loop para repetir quantas vezes o usuário desejar
		do {
			
			// Menu de opções
			System.out.println("\n");
			System.out.println("******************************");
			System.out.println("*            MENU            *");
			System.out.println("******************************");
			System.out.println("O que gostaria de fazer?");
			System.out.println("------------------------------");
			
			System.out.println("            OPÇÕES            " + "\n" +
					           "  1 - Adicionar produto" 		+ "\n" + 
							   "  2 - Listar todos os produtos" + "\n" +
							   "  3 - Consultar produto por ID" + "\n" +
							   "  4 - Atualizar produto" 		+ "\n" +
							   "  5 - Remover produto " 		+ "\n" +
							   "  0 - Sair"					   );
			System.out.println("------------------------------");
			
			System.out.print("Digite a opção desejada: ");
			opcao = input.nextInt();
			
			// Fecha o Scanner e termina o programa
			if (opcao == 0) {
				System.out.println("\n------------------------------");
				System.out.println("Obrigado por usar a Perfumaria 69!");
	            input.close(); // Fecha o Scanner
				System.exit(0); // Termina a execução do programa, sem executar mais nenhuma linha de código
			}
			
			// Switch...Case para cada opção
			switch(opcao) {
			
			// Adicionar produto
			case 1:
				
				/*
				 * Cabeçalho
				 */
				System.out.println("\n");
				System.out.println("*****************************");
				System.out.println("*     ADICIONAR PRODUTO     *");
				System.out.println("*****************************");
				System.out.println("-----------------------------");
				
				/*
				 * Leitura dos atributos
				 */
				
				// Limpa o cachê
				input.nextLine(); 
				
				// Leitura do nome do produto
				System.out.print("Digite o nome do produto: ");
				nome = input.nextLine();
				
				// Leitura do preço do produto
				System.out.println("------------------------------");
				System.out.print("Digite o preço do produto: ");
				preco = input.nextFloat();
				
				// Gerar o ID do produto
				id = controlador.gerarId();
				
				// Laço Do...While para garantir que a opção escolhida seja 1 ou 2
				do {
					System.out.println("\nEscolha o tipo do produto: " + "\n" + 
									   "1 - Produto para unhas" 	   + "\n" +
									   "2 - Produto para cabelos");
					System.out.println("------------------------------");
					
					// Leitura do tipo
					System.out.print("Digite a opção desejada: ");
					tipo = input.nextInt();
					
					// Laço condicional para informar o usuário de que a escolha é inválida caso outro número seja digitado
					if(tipo < 1 || tipo > 2) {
						System.out.println("Tipo inválido. Por favor, escolha uma opção válida");
						System.out.println("\nPressione Enter para escolher novamente.");
						pressEnter();
					}
					
				}while(tipo < 1 || tipo > 2);
				
				// Switch...Case com o tipo do produto
				switch(tipo) {
				
				// Estruturas similares às que foram usadas para a leitura do Tipo, mas com outros valores
				case 1 -> { // Esmaltes
					do {
						System.out.println("\nEscolha o acabamento do esmalte: " + "\n" + 
										   "1 - Cremoso" 						 + "\n" + 
										   "2 - Fosco" 							 + "\n" +
										   "3 - Gel");
						System.out.println("------------------------------");
						
						System.out.print("Digite a opção desejada: ");
						tipoEsmalte = input.nextInt();
						
						if(tipoEsmalte < 1 || tipoEsmalte > 3) {
							System.out.println("\nTipo inválido. Por favor, escolha uma opção válida.");
							System.out.println("\nPressione Enter para escolher novamente.");
							pressEnter();
						}else {
							
							// Cria o produto
							controlador.criarProduto(new Esmalte(nome, id, tipo, preco, tipoEsmalte));
						}
						
					}while(tipoEsmalte < 1 || tipoEsmalte > 3);
				}
				
				case 2 -> {// Cabelo
					do {
						System.out.println("\nEscolha o tipo de cabelo " + "\n" + 
								   		   "1 - Lisos" 				     + "\n" + 
								   		   "2 - Ondulados" 				 + "\n" +
								   		   "3 - Cacheados" 				 + "\n" + 
								   		   "4 - Crespos");
						System.out.println("------------------------------");
						
						System.out.print("Digite a opção desejada: ");
						tipoCabelo = input.nextInt();
						
						if(tipoCabelo < 1 || tipoCabelo > 4) {
							System.out.println("\nTipo inválido. Por favor, escolha uma opção válida.");
							System.out.println("\nPressione Enter para escolher novamente.");
							pressEnter();
						}else {
							
							// Cria o produto
							controlador.criarProduto(new Cabelo(nome, id, tipo, preco, tipoCabelo));
						}
						
					}while(tipoCabelo < 1 || tipoCabelo > 4);
				}
				}
				
				System.out.println("\nPressione Enter para continuar.");
				pressEnter();
				break;
			
			// Listar todos os produtos
			case 2:
				
				/*
				 * Cabeçalho
				 */
				
				System.out.println("\n");
				System.out.println("*****************************");
				System.out.println("*      LISTAR PRODUTOS      *");
				System.out.println("*****************************");
				System.out.println("-----------------------------");
				
				/*
				 * Chamada do método listarTodos() do controller
				 */
				
				controlador.listarTodos();
				
				System.out.println("\nPressione Enter para continuar.");
				pressEnter();
				break;
				
			// Consultar produto por ID
			case 3:
				
				/*
				 * Cabeçalho
				 */
				
				System.out.println("\n");
				System.out.println("****************************");
				System.out.println("* CONSULTAR PRODUTO POR ID *");
				System.out.println("****************************");
				System.out.println("----------------------------");
				
				/*
				 * Leitura do ID
				 */
				System.out.print("Digite o ID do produto que você deseja consultar: ");
				id = input.nextInt();
				
				/*
				 * Chamada do método consultarPorId() do controller
				 */
				controlador.consultarPorId(id);
				
				System.out.println("\nPressione Enter para continuar.");
				pressEnter();
				break;
				
			// Atualizar produto
			case 4:
				
				/*
				 * Cabeçalho
				 */
				
				System.out.println("\n");
				System.out.println("*****************************");
				System.out.println("*     ATUALIZAR PRODUTO     *");
				System.out.println("*****************************");
				System.out.println("-----------------------------");
				
				/*
				 * Leitura do ID do produto a ser atualizado
				 */
				
				System.out.print("Digite o ID do produto que você deseja atualizar: ");
				id = input.nextInt();
				
				/*
				 * Leitura dos novos valores de cada atributos - Código igual ao de adicionar produto
				 */
				
				input.nextLine(); // Limpa o cachê
				
				// Lê o novo nome
				System.out.print("Digite o nome do produto: ");
				nome = input.nextLine();
				
				// Lê o novo preço
				System.out.println("------------------------------");
				System.out.print("Digite o preço do produto: ");
				preco = input.nextFloat();
				
				// Lê o novo tipo
				do {
					System.out.println("\nEscolha o tipo do produto: " + "\n" + 
									   "1 - Produto para unhas" 	   + "\n" +
									   "2 - Produto para cabelos");
					System.out.println("------------------------------");
					
					System.out.print("Digite a opção desejada: ");
					tipo = input.nextInt();
					
					if(tipo < 1 || tipo > 2) {
						System.out.println("Tipo inválido. Por favor, escolha uma opção válida");
						System.out.println("\nPressione Enter para escolher novamente.");
						pressEnter();
					}
					
				}while(tipo < 1 || tipo > 2);
				
				// Lê o novo tipo de acabamento/tipo de cabelo
				switch(tipo) {
				case 1 -> {
					do {
						System.out.println("\nEscolha o acabamento do esmalte: " + "\n" + 
										   "1 - Cremoso" 						 + "\n" + 
										   "2 - Fosco" 							 + "\n" +
										   "3 - Gel");
						System.out.println("------------------------------");
						
						System.out.print("Digite a opção desejada: ");
						tipoEsmalte = input.nextInt();
						
						if(tipoEsmalte < 1 || tipoEsmalte > 3) {
							System.out.println("\nTipo inválido. Por favor, escolha uma opção válida.");
							System.out.println("\nPressione Enter para escolher novamente.");
							pressEnter();
						}else {
							
							// Atualiza o produto
							controlador.atualizarProduto(new Esmalte(nome, id, tipo, preco, tipoEsmalte));
						}
						
					}while(tipoEsmalte < 1 || tipoEsmalte > 3);
				}
				case 2 -> {
					do {
						System.out.println("\nEscolha o tipo de cabelo " + "\n" + 
								   		   "1 - Lisos" 				     + "\n" + 
								   		   "2 - Ondulados" 				 + "\n" +
								   		   "3 - Cacheados" 				 + "\n" + 
								   		   "4 - Crespos");
						System.out.println("------------------------------");
						
						System.out.print("Digite a opção desejada: ");
						tipoCabelo = input.nextInt();
						
						if(tipoCabelo < 1 || tipoCabelo > 4) {
							System.out.println("\nTipo inválido. Por favor, escolha uma opção válida.");
							System.out.println("\nPressione Enter para escolher novamente.");
							pressEnter();
						}else {
							
							// Atualiza o produto
							controlador.atualizarProduto(new Cabelo(nome, id, tipo, preco, tipoCabelo));
						}
						
					}while(tipoCabelo < 1 || tipoCabelo > 4);
				}
				}
				
				System.out.println("\nPressione Enter para continuar.");
				pressEnter();
				break;
				
			// Remover produto
			case 5:
				
				/*
				 * Cabeçalho
				 */
				
				System.out.println("\n");
				System.out.println("*****************************");
				System.out.println("*      REMOVER PRODUTO      *");
				System.out.println("*****************************");
				System.out.println("-----------------------------");
				
				/*
				 * Leitura do ID do produto que será removido
				 */
				
				System.out.print("Digite o ID do produto que você deseja remover: ");
				id = input.nextInt();
				
				/*
				 * Chamada do método deletarProduto() do controller
				 */
				controlador.deletarProduto(id);
				
				System.out.println("\nPressione Enter para continuar.");
				pressEnter();
				break;
				
			// Opção inválida
			default:
				System.out.println("\n------------------------------");
				System.out.println("Opção inválida. Por favor, digite uma opção válida.");
				System.out.println("\nPressione Enter para voltar ao menu.");
				pressEnter();
			}
			
		}while(opcao != 0);
	}
}
