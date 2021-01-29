package aulas4;

import java.util.Scanner;

public class PaulistinhaVetores {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		//String times [] = new String [4]; 
		String times [] = {"PALMEIRAS", "SFC", "SANTOS", "CORINTHIANS"};
		int pontos [] = new int [4];
		char resultado, opcao;
		
		for(int i=0; i<4; i++)
		{
			System.out.printf("\n RODADA %d - \n", i+1);
			
			for(int x=0; x<4;x++)
			{
				System.out.println(times[x] + "\t G - ganhou \t P - Perdeu \t E - Empatou");
				resultado = leia.nextLine().toUpperCase().charAt(0);
				
				if(resultado == 'G')
				{
					pontos[x] += 3;
				}
				else if(resultado == 'E')
				{
					pontos[x] += 1;
				}
				else if(resultado == 'P')
				{
					pontos[x] += 0;
				}
				System.out.println();
			}
			System.out.println();
		}
		
		for(int i = 0; i<4; i++)
		{
			System.out.printf(" \n Finalizou com %d", pontos[i], "pontos! \n ");
		}
		
		System.out.println("Escolha um time");
		
		leia.close();
	}

}
