package perfumaria.model;

public class Cabelo extends Produto {// Criação da classe Cabelo que herda os atributos da classe Produto
	
	/*
	 * Atributos
	 */
	
	private int cabelo;
	
	/*
	 * Método construtor
	 */

	public Cabelo(String nome, int id, int tipo, float preco, int cabelo) {
		super(nome, id, tipo, preco);
		this.cabelo = cabelo;
	}
	
	/*
	 * Get e Setter
	 * 
	 */

	public int getCabelo() {
		return cabelo;
	}

	public void setCabelo(int cabelo) {
		this.cabelo = cabelo;
	}
	
	/*
	 * Métodos adicionais
	 */
	
	@Override
	public void visualizar() {
		
		// Criação da variável que irá armazenar o tipo de acabamento
		
		String tipoCabelo = "";
		
		// Switch...Case que "traduz" o tipo int para o tipo String
		switch(this.cabelo) {
		case 1 -> tipoCabelo = "Lisos";
		case 2 -> tipoCabelo = "Ondulados";
		case 3 -> tipoCabelo = "Cacheados";
		case 4 -> tipoCabelo = "Crespos";
		}

		super.visualizar();
		System.out.println("  Indicado para cabelos: " + tipoCabelo);
	}

}
