package empresa;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

public class MainCadFun {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
	
		List <Empregado> lista = new ArrayList<>();
		
		System.out.println("Digite o numero de empregados:");
		int numero = leia.nextInt();
		for(int i=1; i<=numero;i++) {
			
			System.out.println("Funcionario: "+ i);
			System.out.println("terceiro S/N:");
			char op = leia.next().toUpperCase().charAt(0);
			
			System.out.println("Informe o nome: ");
			String nome = leia.next();
			System.out.println("Informe a Matricula:");
			int matricula = leia.nextInt();
			
			System.out.println("Informe as horas trabalhadas: ");
			int horas = leia.nextInt();
			System.out.println("Informe o valor das Horas trabalhadas: ");
			int valorHora = leia.nextInt();
			if (op == 'S')
			{
				
				System.out.println("Digite o valor do acrescimo: ");
				double acrescimo = leia.nextDouble();
				lista.add(new Terceiro(nome, matricula, horas, valorHora, acrescimo));
				
			}
			else if(op == 'N')
			{
				
				lista.add(new Empregado(nome, matricula, horas, valorHora));
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for(Empregado emp : lista) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.salario()));
		}
		
		
		
		leia.close();
	}

}
