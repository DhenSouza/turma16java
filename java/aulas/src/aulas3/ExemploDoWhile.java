package aulas3;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  de 1 at� ele. 
		 * Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.

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
