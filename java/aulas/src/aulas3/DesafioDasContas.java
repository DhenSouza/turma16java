package aulas3;

import java.util.Scanner;

public class DesafioDasContas {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double CC = 0.0, contador = 0, saldoAtual;
		char opcao;
		
			for (int i = 0; i <=3; i++)
			{
				do
				{
					System.out.println("Deseja emitir o Talão? S/N");
					opcao = leia.next().charAt(0);
					
				if(opcao == 'S' || opcao == 's')
				{
					System.out.printf("Voce pode emitir o Talão 3 vezes !, utilizado %d vezes!", i);
					
				}
				
				System.out.println("Continuamos? S/N:  ");
				opcao = leia.next().charAt(0);
				
				}while(i < 3);
				
			}
		
		leia.close();
	}

}
