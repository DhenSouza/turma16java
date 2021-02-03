package Exercicio4;
import Exercicio1.Pessoa;

public class Administrador extends Pessoa{

	public double getAjudaDeCustos() {
		return ajudaDeCustos;
	}

	private double ajudaDeCustos;
	
	public Administrador(String nome, String endereco, String telefone, double ajudaDeCusto) {
		super(nome, endereco, telefone);
		
		this.ajudaDeCustos = ajudaDeCusto;
	}
	
	public void ajuda() {
		System.out.println("\tCalculo de Viagem e estadias!");
	}
}
