package exercicio1;

public class Cavalo extends Animal implements AnimalInterface{

	private String raca;
	public Cavalo(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Relincha";
	}

	@Override
	public String movimentar() {
		// TODO Auto-generated method stub
		return "Correndo ...";
	}


}
