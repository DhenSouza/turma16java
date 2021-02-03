package Exercicio5;

import Exercicio1.Pessoa;

public class Operario extends Pessoa{

	private double valorProducao = 10;
	private double comissao;
	private double salarioBase = 1000;
	
	public Operario(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		
	}
	
	public  double calculoComissao() {
		comissao = salarioBase;
		for(int i=0; i<valorProducao; i++) {
			comissao += valorProducao;
		}
		return comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	
}
