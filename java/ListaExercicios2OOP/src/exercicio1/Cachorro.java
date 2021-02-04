package exercicio1;

public class Cachorro extends Animal implements AnimalInterface{

	private String raca;
	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;

	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Latir";
	}

	@Override
	public String movimentar() {
		// TODO Auto-generated method stub
		return "Correndo...";
	}


}
