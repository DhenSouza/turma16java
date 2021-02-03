package Exercicio2;

import Exercicio1.Pessoa;

public class Fornecedor extends Pessoa{

	private double valorCredito;
	private double valorDivida = 5000;

	public Fornecedor(String nome, String endereco, String telefone,double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
	}
	
	public double obterSaldo()
	{
		double obterSaldo = valorCredito - valorDivida;
		return obterSaldo;
	}

	public double getValorCredito() {
		return valorCredito;
	}
	
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	public double getValorDivida() {
		return valorDivida;
	}
	
	/*public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}*/
	
}
