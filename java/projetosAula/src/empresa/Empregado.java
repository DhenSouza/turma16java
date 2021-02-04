package empresa;

public  class Empregado {
	
	private String nome;
	private int matricula;
	private double horas;
	private double valorHora;

	
	public Empregado(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	public Empregado(String nome, int matricula, double horas, double valorHora) {
		this.horas = horas;
		this.valorHora = valorHora;
		this.nome = nome;
		this.matricula = matricula;
	}

	public double salario()
	{
		return horas * valorHora;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public String getNome() {
		return nome;
	}
	
}
