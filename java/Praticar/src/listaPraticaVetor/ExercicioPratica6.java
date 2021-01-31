package listaPraticaVetor;

import java.util.Scanner;

public class ExercicioPratica6 {

	public static void main(String[] args) {
		/*
		 * 	Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Depois, mostrar na tela o nome
			da pessoa mais velha.
		 */
		Scanner leia = new Scanner(System.in);
		final int N = 3;
		String [] nomes = new String [N];
		int [] idades = new int [N];
		int contador = 0, idadeMaior = 0, maisVelho = 0;
		
		for(int i=0; i<N; i++) {
			System.out.println("Informe os nomes a seguir: ");
			nomes[i] = leia.next();
			
			System.out.println("Informe também a sua Idade: ");
			idades[i] = leia.nextInt();
			
		}
		
		idadeMaior = idades[0];
		maisVelho = 0;
		
		for (int i = 0; i < N; i++) {
	        if (idades[i] > idadeMaior) {
	            idadeMaior = idades[i];
	             maisVelho = i;
	        }
	    }
		
		System.out.printf("O mais velho entre os nomes informados é: %s", nomes[maisVelho]);
		leia.close();
	}

}
