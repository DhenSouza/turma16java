
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais: ");
		
		int idade = 20;
		int quantidadePessoa = 3;
		
		//boolean acompanhado = quantidadePessoa >= 2;
		
		boolean acompanhado; 
		
		if (quantidadePessoa >= 2) {
			
			 acompanhado = true;
		} else {
			 acompanhado = false; 
		}

		System.out.println("Valor acompanhado: " + acompanhado);
		
		if (idade >= 18 && acompanhado) { // || quer dizer OU
			System.out.println("Seja bem vindo");
		} else {

			System.out.println("Não pode entrar");

		}
	}
}
