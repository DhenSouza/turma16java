package testesAula;

public class Produto {

	public String codigo;
	public String descricao;
	public double valorUnitario;
	
	
	public Produto(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Produto(String descricao) {
		this.descricao = descricao;
	}

	public Produto(String codigo, double valorUnitario, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
