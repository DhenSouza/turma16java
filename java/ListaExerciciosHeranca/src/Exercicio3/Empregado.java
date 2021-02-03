package Exercicio3;

import Exercicio1.Pessoa;

public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private int salarioBase = 1000;
	private int imposto = 150;

	public Empregado(String nome, String endereco, String telefone, int codigoSetor) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
	}
	
	public double vencimentoSalario () {
		
		salarioBase += imposto;
		return salarioBase;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public int getImposto() {
		return imposto;
	}
	
}
