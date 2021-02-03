package Exercicio3;

import Exercicio1.Pessoa;

public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private double salarioBase = 1000;
	private double calcSalario = 0.00;
	private double imposto = 0.15;

	public Empregado(String nome, String endereco, String telefone, int codigoSetor) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
	}
	
	public double vencimentoSalario () {
		calcSalario = salarioBase;
		calcSalario *= imposto;
		salarioBase -= imposto;
		return salarioBase;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getImposto() {
		return imposto;
	}
	
}
