package exercicio4;

public class ObjFuncionario {

	public static void main(String[] args) {

		Funcionario orochi = new Funcionario();
		
		orochi.setNome("Orochi");
		orochi.setSalario(2500);
		
		System.out.println("Nome funcionario: " + orochi.getNome()+ "\n " + "Salario do Funcionario: " + orochi.getSalario());
	}

}
