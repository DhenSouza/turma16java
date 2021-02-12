package exercicio1;

public class Carro {

	private String modelo;
	private String estado;
	private int ano;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	
	
	public Carro() {
	}
	public Carro(String modelo) {
		this.modelo = modelo;
	}
	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public Carro(String modelo, int ano, double velocidadeAtual, String estado) {
		this.modelo = modelo;
		this.ano = ano;
		this.velocidadeAtual = velocidadeAtual;
		this.estado = estado;
	}
	public String liga() {
		System.out.println("O carro esta ligado...");
		return estado;
	}
	public void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}

	public double mudarMarcha() {
		if(this.velocidadeAtual < 0)
		{
			return -1;
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40)
		{
			return 1;
		}
		if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80)
		{
			return 2;
		}
		if(this.velocidadeAtual >= 80 && this.velocidadeAtual < 120)
		{
			return 3;
		}
		if(this.velocidadeAtual >= 120 && this.velocidadeAtual < 220)
		{
			return 4;
		}
		if(this.velocidadeAtual >= 220 && this.velocidadeAtual < 320)
		{
			return 5;
		}
		else
		{
			return this.velocidadeMaxima;
		}
		
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
	
	
}
