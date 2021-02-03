package BANK16;


public class Conta {

	private String numero;
	private String cpf;
	private double saldo;

	public Conta(String numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public String getNumeroConta() {
		return numero;
	}

	public void setNumeroConta(String numero) {
		this.numero = numero;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCPF() {
		return cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void debitar(Double valor) {
		
		if (valor <= 0) {
			saldo -= valor;
		}
		else
		{
			System.out.println("Saldo insuficiente!");
		}
		
	}
	public void creditar(double valor) {
		saldo += valor;
	}
	

	
	
	
}
