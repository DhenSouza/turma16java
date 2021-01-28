package aulas3;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		System.out.println("Entre com sua idade: ");
		idade = leia.nextInt();
		
		while(idade >= 1) 
		{
			System.out.printf("\n Sua idade: %d", idade);
			if(idade >= 18) 
			{
				System.out.printf("\n Voce é de maior ");
			}
			
			else
			{
				System.out.printf("\n Voce é de menor ");
			}
			System.out.println("\n Entre com sua idade: ");
			idade = leia.nextInt();
		}
		leia.close();
	}

}
