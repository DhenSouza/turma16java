package encaps;

public class TestandoFuncionario {

	public static void main(String[] args) {

		Funcionario alberto = new Funcionario();
		
		alberto.setNome("Alberto");
		alberto.setSalario(2500);
		
		System.out.println(alberto.getNome()+ " " + alberto.getSalario());
	}

}
