package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0; 
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		do
		{
			soma += numero; 
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if (numero == 0)
			{
				numero = 0;
			}
		} while(numero > 0);
		
		System.out.printf("\n A soma dos numeros informados é de: %d", soma);
		
		leia.close();
	
	}

}
