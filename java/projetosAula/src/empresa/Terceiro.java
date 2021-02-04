package empresa;

public class Terceiro extends Empregado{

	private double acrescimo;
	
		public Terceiro(String nome, int matricula,double horas, double valorHora, double acrescimo) {
		super(nome,matricula, horas, valorHora);
		this.acrescimo = acrescimo;
	
	}

	@Override
	public double salario() {
		acrescimo = super.getHoras() * (super.getValorHora()+(super.getValorHora()*acrescimo));
;
		return acrescimo;
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	
	
}