package perfumaria.controller;

import java.util.ArrayList;

import perfumaria.model.Produto;
import perfumaria.repository.PerfumariaRepository;

public class PerfumariaController implements PerfumariaRepository{
	
	// Criação da ArrayList e do ID para autoincrementar
	
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private int id = 0;
	
	/*
	 * Métodos auxiliares
	 */
	
	// Método que busca o produto pelo ID e, se encontrar, retorna o produto, caso contrário, retorna null
	public Produto buscarProduto(int id) {
		for (var produto : produtos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
	
	// Método que gera automaticamente um id para o produto com base na variável id
	public int gerarId() {
		return ++id;
	}
	
	/*
	 * Métodos CRUD
	 */
	
	// Create
	@Override
	public void criarProduto(Produto produto) {
		
		// Adiciona o produto na ArrayList
		produtos.add(produto);
		
		// Mensagem de operação bem-sucedida
		System.out.println("\n\nO produto " + produto.getNome() + " foi registrado com sucesso.");
	}
	
	// Read all
	@Override
	public void listarTodos() {
		
		// Lista todos os produtos
		System.out.println("      Lista de Produtos      ");
        for (var produto : produtos) {
			produto.visualizar();
		}    
		
	}
	
	// Read one
	@Override
	public void consultarPorId(int id) {
		
		// Procura o produto com base em seu ID
        var produto = buscarProduto(id);
		
        // Caso a função buscarProduto retorne um produto, os detalhes desse produto são escritos no console
		if (produto != null) {
			produto.visualizar();
			
		// Caso a função retorne nulo, a mensagem de falha é escrita
		}else {
			System.out.println("\n\nO produto com ID número: " + id + " não foi encontrado.");
		}
	}
	
	// Update
	@Override
	public void atualizarProduto(Produto produto) {
		
		// Procura o produto com base em seu id
        var buscaProduto = buscarProduto(produto.getId());
		
        // Caso não retorne nulo, o produto é atualizado com base no produto fornecido e a mensagem de sucesso é exibida.
		if (buscaProduto != null) {
			produtos.set(produtos.indexOf(buscaProduto), produto); // Atualiza o produto
			System.out.println("\n\nO produto com ID número: " + produto.getId() + " foi atualizado com sucesso.");
		
		// Caso retorne nulo, a mensagem de falhla é exibida
		}else {
			System.out.println("\n\nO produto com ID número: " + produto.getId() + " não foi encontrado.");
		}
		
	}
	
	// Delete
	@Override
	public void deletarProduto(int id) {
		
		// Procura o produto com base em seu id
        var buscaProduto = buscarProduto(id);
		
        // Caso não retorne nulo, o produto é removido da ArrayList e a mensagem de sucesso é exibida
		if (buscaProduto != null) {
			if(produtos.remove(buscaProduto) == true)
				System.out.println("\n\nO produto com ID número: " + id + " foi deletado com sucesso.");
			
		// Caso retorne nulo, a mensagem de falha é exibida
		}else {
			System.out.println("\n\nO produto com ID numero: " + id + " não foi encontrado para ser removido.");
		}
		
	}

}
