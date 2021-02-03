package Exercicio1;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private char vivoOunao;
	
	public Pessoa() {
		
	}
	
		public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
		
	public Pessoa(char vivoOunao) {
		this.vivoOunao = vivoOunao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

public char getVivoOunao() {
		return vivoOunao;
	}

	public void setVivoOunao(char vivoOunao) {
		this.vivoOunao = vivoOunao;
	}

public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
