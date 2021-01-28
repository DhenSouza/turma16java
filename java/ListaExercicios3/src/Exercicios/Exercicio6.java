package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		/*
		 * Escrever um programa que receba vários 
		 * números inteiros no teclado. E no final imprimir a média dos números
		 *  múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */
		Scanner leia = new Scanner(System.in);
		
		double numeros = 0.0, cont = 0.0, soma = 0.0;
		double media = 0.0; 
		
		do
		{
			System.out.print(" Informe um valor: ");
			numeros = leia.nextInt();
			
			if(numeros %3 == 0 && numeros != 0 )
			{
				soma += numeros;
				cont ++;
			}
			
			System.out.print(" Digite 0 para finalizar o Program ! ");
			numeros = leia.nextInt();
			
		} while(numeros != 0);
		
		if(cont != 0)
		{
		media = soma / cont;
		System.out.printf("\n A media dos numeros de 3: %.2f", media);
		}
		else
		{
			System.out.println("Numero diferente de multiplo de 3");
		}
		leia.close();
	}

}
