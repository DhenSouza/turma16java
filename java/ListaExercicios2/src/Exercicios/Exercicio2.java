package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*
		 * EXERCICIO 2
		 * Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		Scanner leia = new Scanner(System.in);
		
		int numero1,numero2,numero3, x;
		
		System.out.println("Informe o valor do Primeiro Numero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Informe o valor do Segundo Numero: ");
		numero2 = leia.nextInt();
		
		System.out.println("Informe o valor do Terceiro Numero: ");
		numero3 = leia.nextInt();
		
		if(numero1 > numero2) {
			x = numero2;
			numero2 = numero3;
			numero3 = x;
		}
		else if(numero2 > numero3) {
			x = numero2;
			numero2 = numero3;
			numero3 = x;
		}
		else if(numero1 > numero2) {
			x = numero1;
			numero1 = numero2;
			numero2 = x;
		}
		else if(numero1 <= 0 && numero2 <= 0 && numero3 <= 0)
		{
			System.out.printf("\n Numero Invalido");
		}
		else if(numero1 == numero2 && numero1 == numero3 && numero2 == numero1 && numero2 == numero3 && numero3 == numero1 && numero3 == numero2)
		{
			System.out.printf("\n Numero Invalido");
		}
		System.out.printf("\n Ordem crescente: %d,%d,%d", numero1, numero2, numero3);
		leia.close();
	}

}
