package exercicio6;

public class CB {

	public static void main(String[] args) {

		ContaBancaria genildo = new ContaBancaria("Conta Poupança", "Itau", "457896-856");
		
		System.out.println("Tipo da Conta: \t Agencia:  Conta: ");
		System.out.println(genildo.descrição + " \t\t" + genildo.agencia+ "\t" + genildo.codigo);
		
	}

}
