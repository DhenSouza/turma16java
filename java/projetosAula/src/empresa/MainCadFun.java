package empresa;

import java.util.Locale;
import java.util.Scanner;

public class MainCadFun {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a matricula: ");
		int matricula = leia.nextInt();
		leia.nextLine();
		System.out.println("Digite o nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Digite o valor das horas trabalhadas: ");
		double horas = leia.nextDouble();
		System.out.println("Digite as Horas trabalhadas: ");
		double valorHora = leia.nextDouble();
		System.out.println("terceiro S/N:");
		char op = leia.next().toUpperCase().charAt(0);
		
		if (op == 'S')
		{
			System.out.println("Digite o valor do acrescimo: ");
			double acrescimo = leia.nextDouble();
			Empregado func1 = new Terceiro(nome, matricula, horas, valorHora, acrescimo);
			System.out.println("matricula: "+ func1.getMatricula());
			System.out.println("nome: "+ func1.getNome());
			System.out.println("salario: "+ func1.salario());
			
		}
		else if(op == 'N')
		{
			Empregado func1 = new Empregado(nome, matricula, horas, valorHora);
			System.out.println("matricula: "+ func1.getMatricula());
			System.out.println("nome: "+ func1.getNome());
			System.out.println("salario: "+ func1.salario());
		}

		
	}

}
