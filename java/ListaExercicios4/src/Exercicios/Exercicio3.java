package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		
		int [][] N1 = new int [4][6];
		int [][] N2 = new int [4][6];
		
		int [][] M1 = new int [4][6];
		int [][] M2 = new int [4][6];
		
		for(int linha =0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna <6; coluna++)
			{
				N1[linha][coluna] = random.nextInt(5);
				N2[linha][coluna] = random.nextInt(5);
				
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}
		}
		System.out.println("\n");
		for(int linha =0; linha < 4; linha++)
		{
			System.out.println("\n");
			for(int coluna = 0; coluna <6; coluna++)
			{
				System.out.printf("  |%d|  ", M1[linha][coluna]);
			}
		}
		System.out.println("\n");
		for(int linha =0; linha < 4; linha++)
		{
			System.out.println(" \n");
			for(int coluna = 0; coluna <6; coluna++)
			{
				System.out.printf("  |%d|  ", M2[linha][coluna]);
			}
		}
		leia.close();
	}

}
