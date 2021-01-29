package listaPraticaVetor;

import java.util.Scanner;

public class ExercicioPratica2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int [] numeros = new int [5];
		int cont1 = 0, cont2 = 0;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Informe os numeros do Vetor: ");
			numeros[i] = leia.nextInt();
			
			if((numeros[i] % 2) == 0)
			{
				cont1++;
			}
			else 
			{
				cont2++;
			}
		}
		for(int i : numeros)
		{
			if(i % 2 ==0) {
				System.out.println(i);
			}
		}
		
		System.out.printf ("Total de numeros Pares: %d", cont1);
		System.out.printf ("\n Total de numeros impares: %d", cont2);
		leia.close();
	}

}
