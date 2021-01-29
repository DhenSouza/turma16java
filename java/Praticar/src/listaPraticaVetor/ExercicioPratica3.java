package listaPraticaVetor;

import java.util.Random;
import java.util.Scanner;

public class ExercicioPratica3 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
		cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
		 */
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		int [] A = new int [6];
		int [] B = new int [6];
		int [] C = new int [6];
		
		for(int i=0; i<6;i++)
		{
			A[i] = random.nextInt(6);
			System.out.printf(" \n Conteudo : %d \t contador %d ",A[i], i+1);
		}
		linha(20);
		for(int i=0; i<6;i++)
		{
			B[i] = random.nextInt(6);
			System.out.printf(" \n Conteudo : %d \t contador %d ",B[i], i+1);
		}
		
		linha(20);
		for(int i=0; i<6;i++)
		{
			C[i] = A[i] + B[i];
			
		}
		linha(20);
		for(int i=0; i<6;i++)
		{
			System.out.printf("\n Os valores somados de A + B é: %d \n", C[i]);
			
		}
		leia.close();
	}
	
	public static void linha(int tamanho)
	{
		for(int i=0; i<tamanho; i++)
		{
			System.out.print("══");
		}
	}

}
