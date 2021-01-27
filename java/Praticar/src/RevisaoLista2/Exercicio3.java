package RevisaoLista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double n1,n2,n3,n4;
		
		System.out.println("Informe o valor do Primeiro Numero: ");
		n1 = leia.nextDouble();
		
		System.out.println("Informe o valor do Segundo Numero: ");
		n2 = leia.nextDouble();
		
		
		System.out.println("Informe o valor do Terceiro Numero: ");
		n3 = leia.nextDouble();
		
		
		System.out.println("Informe o valor do Quarto Numero: ");
		n4 = leia.nextDouble();
		
		Math.sqrt(n1);
		Math.sqrt(n2);
		Math.sqrt(n3);
		Math.sqrt(n4);
		
		if(n3 >= 1000) {
			System.out.printf("O valor da raiz quadrada do Terceiro numero é: %f ", n3);
		}
		else
		{
			System.out.printf("O valor da raiz quadrada do Primeiro numero é: %f ", n1);
			System.out.printf("\n O valor da raiz quadrada do Segundo numero é: %f ", n2);
			System.out.printf("\nO valor da raiz quadrada do Quarto numero é: %f ", n4);
		}
		
		leia.close();
	}

}
