package listaPraticaVetor;

import java.util.Scanner;

public class ExercicioPratica5 {

	public static void main(String[] args) {
		/*
		 * c
		 */
		Scanner leia = new Scanner(System.in);
		final int N = 5;
		int [] numero = new int[N];
		int contador = 0;
		double media = 0.00, soma = 0.00;
		
		for(int i=0;i<N;i++) {
			System.out.println(" \nDigite os numeros no Vetor: ");
			numero[i] = leia.nextInt();
			soma += numero[i];
			if((numero[i]%2) == 0) {
				contador++;
			}else {
				System.out.printf(" %d é IMPAR", numero[i]);
			}
		}
		media = soma / contador;
		System.out.printf("\n A media dos numeros pares é de: %f", media);
		leia.close();
	}

}
