package perfumaria.repository;

import perfumaria.model.Produto;

public interface PerfumariaRepository {
	
	/*
	 * Métodos CRUD (Create Read Update Delete)
	 */
	
	public void criarProduto(Produto produto);
	public void listarTodos();
	public void consultarPorId(int id);
	public void atualizarProduto(Produto produto);
	public void deletarProduto(int id);

}
