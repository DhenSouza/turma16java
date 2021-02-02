package exercicio5;

public class Patinete {

	String cor; 
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	void acelera(double quantidade)
	{
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
		
	}
	
	public void mostrarTela ()
	{
	System.out.println("\n Cor do Produto: " + cor + " "+ "Modelo: "+  modelo);
	}
	
	
}
