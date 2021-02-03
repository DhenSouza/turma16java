package Exercicio6;

import Exercicio1.Pessoa;

public class Vendedor extends Pessoa{
	
	private double valorVendas = 1500;
	private double comissao = 10;
	public Vendedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	public double calculoComissao() {
		comissao *= valorVendas / 100;
		return comissao;
	}
}
