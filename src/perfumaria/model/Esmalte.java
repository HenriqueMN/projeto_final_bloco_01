package perfumaria.model;

public class Esmalte extends Produto{ // Criação da classe Esmalte que herda os atributos da classe Produto
	
	/*
	 * Atributos
	 */
	
	private int acabamento;
	
	/*
	 * Método construtor
	 */

	public Esmalte(String nome, int id, int tipo, float preco, int acabamento) {
		super(nome, id, tipo, preco);
		this.acabamento = acabamento;
	}
	
	/*
	 * Get e Setter
	 * 
	 */
	public int getAcabamento() {
		return acabamento;
	}

	public void setAcabamento(int acabamento) {
		this.acabamento = acabamento;
	}
	
	/*
	 * Métodos adicionais
	 */
	
	@Override
	public void visualizar() {
		
		// Criação da variável que irá armazenar o tipo de acabamento
		
		String tipoAcabamento = "";
		
		// Switch...Case que "traduz" o tipo int para o tipo String
		switch(this.acabamento) {
		case 1 -> tipoAcabamento = "Cremoso";
		case 2 -> tipoAcabamento = "Fosco";
		case 3 -> tipoAcabamento = "Gel";
		}

		super.visualizar();
		System.out.println("  Acabamento: " + tipoAcabamento);
	}
}
