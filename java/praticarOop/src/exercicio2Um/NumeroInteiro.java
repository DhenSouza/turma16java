package exercicio2Um;

public class NumeroInteiro {

	private int numero;
	private String palavra;
	public NumeroInteiro() {
		
	}
	
	public void imprimir(int qtde, String texto) {
		//Scanner leia = new Scanner(System.in);
		for(int i=0; i < qtde; i++) {
			System.out.println(texto);
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	
}
