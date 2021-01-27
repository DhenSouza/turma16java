import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double idadePessoa, anos, meses, dias;
		System.out.println("Digite a quantidade de dias da Pessoa: ");
		idadePessoa = ler.nextDouble();
		
		anos = (idadePessoa/365);
		meses = ((idadePessoa % 365)/30);
		dias = ((idadePessoa % 365)%30);
		
		System.out.println("\n Total em anos: "+ anos);
		System.out.println("\n Total em meses: " + meses);
		System.out.println("\n Total em dias: " + dias);
		
		ler.close();
	}

}
