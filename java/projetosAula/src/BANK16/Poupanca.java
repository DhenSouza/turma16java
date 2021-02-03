package BANK16;

public class Poupanca extends Conta{
	
	private int dataAniversario;

	public Poupanca(String numero, String cpf, int dataAniversario) {
		super(numero, cpf);
		this.dataAniversario = dataAniversario;
	}
	

	public int getDataAniversario() {
		return dataAniversario;
	}


	public void setDataAniversario(int dataAniversario) {
		this.dataAniversario = dataAniversario;
	}


	public void aniversario(int dia) {
		
		double correcao = super.getSaldo()* 0.0005;
		if(dia == dataAniversario) {
			super.creditar(correcao);
			
		}
	}
}
