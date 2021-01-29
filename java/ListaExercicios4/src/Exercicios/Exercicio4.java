package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		
		int [][] matriz = new int [3][3];
		int soma  = 0;
		
		for(int linha=0; linha<3;linha++)
		{
			for(int coluna = 0; coluna <3; coluna++)
			{
				matriz[linha][coluna] = random.nextInt(5);
				
				if(coluna == linha)
				{
					soma += matriz[linha][coluna];
				}
				
				System.out.printf("  |%d|  ", matriz[linha][coluna]);
			}
			System.out.println("\n");
		}
		System.out.printf("\n A soma da linha sobre a coluna é de: %d", soma);
		leia.close();
	}

}
