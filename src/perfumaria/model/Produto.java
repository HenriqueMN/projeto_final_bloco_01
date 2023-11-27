package perfumaria.model;

public abstract class Produto { // Criação da classe abstrata Produto
	
	/*
	 * Atributos
	 */
	
	private String nome;
	private int id, tipo;
	private float preco;
	
	/*
	 * Método construtor
	 */
	
	public Produto(String nome, int id, int tipo, float preco) {
		this.nome = nome;
		this.id = id;
		this.tipo = tipo;
		this.preco = preco;
	}
	
	/*
	 * Getters e Setters
	 */
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	/*
	 * Métodos adicionais
	 */
	
	public void visualizar() {
		
		// Criação da variável que irá armazenar o tipo de produto
		
		String tipoProduto = "";
		
		// Switch...Case que "traduz" o tipo int para o tipo String
		switch(this.tipo) {
		case 1 -> tipoProduto = "Produto para unhas";
		case 2 -> tipoProduto = "Produto para cabelo";
		}
		
		System.out.println("-----------------------------");
		System.out.println("  Nome: "  + this.nome   + "\n" +
						   "  ID: "    + this.id	 + "\n" +	  
						   "  Tipo: "  + tipoProduto + "\n" +
						   "  Preço: " + this.preco       );
	}

	
	
}
