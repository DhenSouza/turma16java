package listaPraticaVetor;

import java.util.Scanner;

public class ExercicioPratica1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int N = 10;
		double [] numeros = new double [N];
		double maiorNumero = 0.00;
		
		for(int i=0; i<N; i++)
		{
			System.out.println("Digite N numeros para o Vetor: ");
			numeros[i] = leia.nextDouble();
			if(numeros[i] > maiorNumero)
			{
				maiorNumero = numeros[i];
			}
		}
		System.out.println("O maior numero é: " + maiorNumero);
 		leia.close();
	}

}
