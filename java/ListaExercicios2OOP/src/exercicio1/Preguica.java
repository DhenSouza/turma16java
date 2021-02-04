package exercicio1;

public class Preguica extends Animal implements AnimalInterface{
	

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		return "Assovia";
	}

	@Override
	public String movimentar() {
		// TODO Auto-generated method stub
		return "Subir em arvore";
	}
	
	
}
