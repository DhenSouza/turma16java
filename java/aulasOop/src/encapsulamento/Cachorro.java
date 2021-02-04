package encapsulamento;

public class Cachorro extends Animal implements AnimalInterface, AlimentacaoInterface{
	
	String raca;
	double tamanho;
	double km;

	public Cachorro(String nome, String raca, double peso) {
		super(nome, peso);
		this.raca = raca;
	}

	
	public double getTamanho() {
		return tamanho;
	}


	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}


	public void latir()
	{
		System.out.println("Dog esta latindo !");
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	String movimentacao() {
		return "Estou correndo";
	}


	@Override
	double kmHora() {
		double somaDosValores = 10.0 + 15.0;
		setKm(somaDosValores);
		return  0;
	}


	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}


	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "estou latindo";
	}


	@Override
	
	public String necessidadesFisiologicas() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String comoSeAlimentar() {
		// TODO Auto-generated method stub
		return null;
	}
}
