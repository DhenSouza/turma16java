package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		
		final int quantidade = 10;
		int [] lancamentos = new int [10];
		int maiorValor = 0, cont = 0;
		double media = 0.00, soma = 0.00;
		
		for(int i=0; i<quantidade; i++)
		{
			lancamentos[i] = random.nextInt(6);
			soma += lancamentos[i];
			
			if (lancamentos[i] >= maiorValor)
			{
				
				if(lancamentos[i] == maiorValor)
				{
					cont++;
				}
				else
				{
					cont = 1;
				}
			maiorValor = lancamentos[i];
		}
		
	}
		for(int i=0; i<quantidade; i++) {
			System.out.printf("\n Lançamento da º %d Posição ", (i+1));
			System.out.printf(" é igual: %d", lancamentos[i]);
		}
		
		media = soma / quantidade;
		System.out.printf("\n A soma dos valores informado pelo dado é de: %.2f", soma);
		System.out.printf("\n A media dos valores informado pelo dado é de: %.2f", media);
		System.out.printf("\n O maior valor gerado é: %d", maiorValor);
		System.out.printf("\n O numero que mais apareceu foi: %d", cont);
		leia.close();
	}

}
