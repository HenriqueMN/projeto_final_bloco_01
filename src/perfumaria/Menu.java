package perfumaria;

import java.io.IOException;
import java.util.Scanner;

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
				break;
			
			// Listar todos os produtos
			case 2:
				break;
				
			// Consultar produto por ID
			case 3:
				break;
				
			// Atualizar produto
			case 4:
				break;
				
			// Remover produto
			case 5:
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
