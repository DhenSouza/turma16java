package entidadeExemplo2;

public class Empregador {

	private String nome;
	private double salarioLiquido;
	private double tax;
	
	public Empregador(String nome, double salarioLiquido, double tax) {
		this.nome = nome;
		this.salarioLiquido = salarioLiquido;
		this.tax = tax;
	}

	public double netSalario() {
		return salarioLiquido - tax;
	}
	
	public void incrementoSalario(double porcentagem) {
		 salarioLiquido += salarioLiquido * porcentagem / 100.00;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", netSalario());
		}
}
