package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*	EXERCICIO 1 
		 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 */

		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Informe o valor de N1: ");
		n1 = leia.nextInt();
		
		System.out.println("Informe o valor de N2: ");
		n2 = leia.nextInt();
		
		System.out.println("Informe o valor de N3: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3)
		{
			System.out.println("N1 � maior !");
		}
		
		else if(n2 > n1 && n2 > n3)
		{
			System.out.println("N2 � maior: ");
		}
		
		else if(n3 > n1 && n3 > n2)
		{
			System.out.println("N3 � maior: ");
		}
		else
		{
			System.out.println("Invalido !");
		}
		leia.close();
	}

}
