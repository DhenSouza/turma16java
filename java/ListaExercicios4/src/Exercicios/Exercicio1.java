package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int [] vetor = new int[5];
		int maior = 0;
		
		for(int i = 0; i <5; i++)
		{
			System.out.println("Informe um valor para cada posição: ");
			vetor[i] = leia.nextInt();
			
			if(vetor[i] > maior)
			{
				maior = vetor[i];
			}
		}
		
		for(int i=0; i < 5; i++)
		{
			System.out.printf("\n Os valores Digitados: %d", i+1);
			System.out.printf(" = %d \n", vetor[i]);
		}
		
		System.out.println("O maior valor entre os numeros é: " + maior);
		leia.close();
	}

}
