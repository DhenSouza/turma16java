package exercicio7;

public class ObjPaciencia {

	public static void main(String[] args) {
		Paciente paciente = new Paciente("joão ", 4569, "Gases");
		
		System.out.println("Nome: \t Registro:  Descrição: ");
		System.out.println(paciente.nome + " \t\t" + paciente.registro+ "\t" + paciente.descricao);
	}

}
