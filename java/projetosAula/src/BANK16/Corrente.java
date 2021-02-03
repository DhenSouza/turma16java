package BANK16;

public class Corrente extends Conta{
	
	int qtMesTalao;

	public Corrente(String numero, String cpf, int qtMesTalao) {
		super(numero, cpf);
		this.qtMesTalao = qtMesTalao;
	}
	
	public int getQtMesTalao() {
		return qtMesTalao;
	}

	public void emitirTalao(int qtde) {
		for(int i=0; i<3;i++) {
		System.out.println("Imprimindo..." + qtde);
		qtde++;
		}
	}

}
