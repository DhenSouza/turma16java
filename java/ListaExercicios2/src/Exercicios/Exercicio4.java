package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/* EXERCICIO 4 
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
		 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		Scanner leia = new Scanner(System.in);
		
		
		double numero, raiz = 0.0;
		
		System.out.println("Informe um numero: ");
		numero = leia.nextDouble();
		
		if(numero %2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("\n Este numero � Par %.2f, a Raiz quadrada dele �: %.2f", numero,raiz);
		}
		else
		{
			raiz = Math.sqrt(numero);
			System.out.printf("\n Este numero � Impar %.2f, a Raiz quadrada dele �: %.2f", numero,raiz);
		}
		leia.close();
	}

}
