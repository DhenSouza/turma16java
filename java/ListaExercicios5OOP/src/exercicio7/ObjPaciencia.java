package exercicio7;

public class ObjPaciencia {

	public static void main(String[] args) {
		Paciente paciente = new Paciente("jo�o ", 4569, "Gases");
		
		System.out.println("Nome: \t Registro:  Descri��o: ");
		System.out.println(paciente.nome + " \t\t" + paciente.registro+ "\t" + paciente.descricao);
	}

}
