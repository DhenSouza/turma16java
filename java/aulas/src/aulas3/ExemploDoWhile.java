package aulas3;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		/*
		 * Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
		 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.

		 */
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int numero = leia.nextInt();
		int soma = 0;
		do
		{
			soma += numero;
			numero -= 1;
			
			System.out.printf("\n soma: %d", soma);
			System.out.printf("\n numero: %d", numero);
		} while(numero >= 0);
		System.out.println(soma);
		leia.close();
	}

}
