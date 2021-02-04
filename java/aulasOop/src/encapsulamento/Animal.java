package encapsulamento;

public abstract class Animal {
	protected String nome;
	protected double tamanho;
	protected double peso;
	
	
	public Animal(String nome, double peso) {
		
		this.nome = nome;
		this.peso = peso;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getTamanho() {
		return tamanho;
	}


	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	} 
	
	abstract String movimentacao();
	
	abstract double kmHora();
	
	abstract String emitirSom();
	
	abstract String necessidadesFisiologicas();
}
