
public class TestaCondicional {

	public static void main(String[] args) {

		int idade = 10;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voce não tem 18, mas pode entrar" + "Pois esta acompanhado");

			} else {
				System.out.println("Não pode entrar");
			}

		}
		System.out.println();
	}

}
