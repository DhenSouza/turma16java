package listaPraticaFor;

import java.util.Random;
import java.util.Scanner;


public class Exercicio1For {

	public static void main(String[] args) {
		/*
		 * 	Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
			X, se for o caso.
		 */
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		int numero;
		 
		numero = random.nextInt(5);
		while(numero == 0)
		{
			numero = random.nextInt(5);
		}
		System.out.println(numero);
		for (int i = 1; i <= 10; i++) 
		{
			numero = i;
            if (numero % 2 != 0) 
            {
            	System.out.printf("\n Numeros Impares: %d",numero);
            }else {
            	System.out.println("\n");
            }
        }
		
		leia.close();
	}

}
