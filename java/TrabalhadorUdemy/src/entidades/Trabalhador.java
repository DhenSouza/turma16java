package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.Enums.LevelTrabalho;

public class Trabalhador {

	private String nome;
	private LevelTrabalho level;
	private double salarioBase;
	
	
	private Departamento departamento;
	private List <HorasContratos> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}
	
	public Trabalhador(String nome, LevelTrabalho level, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LevelTrabalho getLevel() {
		return level;
	}
	public void setLevel(LevelTrabalho level) {
		this.level = level;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public List<HorasContratos> getContratos() {
		return contratos;
	}
	
	
	
	public void addContratos(List<HorasContratos> contratos) {
		contratos.add((HorasContratos) contratos);
	}
	
	public void removeContratos(List<HorasContratos> contratos) {
		contratos.remove(contratos);
	}
	
	public double calcSalario(double ano, double mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(HorasContratos c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
				
			}
		}
		return soma;
	}

	public void addContratos(HorasContratos contrato) {
		// TODO Auto-generated method stub
		
	}
	
}
