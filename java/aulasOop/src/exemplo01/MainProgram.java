package exemplo01;

public class MainProgram {

	public static void main(String[] args) {

		PessoaFisica cliente1 = new PessoaFisica("001", "03/02/2021", "Dani");
		
		cliente1.solicitarEmprestimoPF();
	}

}
