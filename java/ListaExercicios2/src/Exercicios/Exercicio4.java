package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/* EXERCICIO 4 
		 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
		 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 */
		Scanner leia = new Scanner(System.in);
		
		
		double numero, raiz = 0.0;
		
		System.out.println("Informe um numero: ");
		numero = leia.nextDouble();
		
		if(numero %2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("\n Este numero é Par %.2f, a Raiz quadrada dele é: %.2f", numero,raiz);
		}
		else
		{
			raiz = Math.sqrt(numero);
			System.out.printf("\n Este numero é Impar %.2f, a Raiz quadrada dele é: %.2f", numero,raiz);
		}
		leia.close();
	}

}
