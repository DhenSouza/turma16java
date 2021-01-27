package revisaoLista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double soma = 0.0;
		
		for(double i = 1; i < 500; i++) 
		{
			if((i %2) == 1 && (i % 3) == 0) {
				soma += i; 
			}
		}
		System.out.println(soma);
		leia.close();
	}

}
