package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<=10;i++)
		{
			if(i == 0)
			{
				System.out.println("Zero é Neutro!");
			}
			
			else if (i % 2 == 0) {
				System.out.printf("\n O Numero %d, é Par!", i);
			}
			else
			{
				System.out.printf("\n O Numero %d, é Impar!", i);
			}
		}
		leia.close();
	}

}
