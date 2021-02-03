package entidadeExemplo2;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMainProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o nome: ");
		String nome = sc.next();
		
		System.out.println("informe o Salario Liquido: ");
		double salarioLiquido = sc.nextDouble();
		
		System.out.println("informe a Taxa: ");
		double tax = sc.nextDouble();
		
		Empregador jorge = new Empregador(nome,salarioLiquido,tax);
		
		System.out.println();
		System.out.println("Employee: " + jorge);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		jorge.incrementoSalario(percentage);
		System.out.println();
		System.out.println("Updated data: " + jorge);
		sc.close();
	}

}
