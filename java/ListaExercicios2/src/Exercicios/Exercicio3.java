package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*
		 * EXERCICIO 3
		 * Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto
		 */
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.printf("\n Informe sua Idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Sua Categoria � INFANTIL.");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Sua Categoria � JUVENIL.");
		}
		else if(idade >= 18 && idade <= 28) {
			System.out.println("Sua Categoria � ADULTO.");
		}
		else
		{
			System.out.println("Categoria invalida !");
		}
		leia.close();
	}

}
