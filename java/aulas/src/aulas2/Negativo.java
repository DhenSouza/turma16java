package aulas2;

import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		double numero;
		
		
		System.out.println("Informe um numero natural");
		numero = ler.nextDouble();
		
		if (numero < 0)
		{
			System.out.println("Numero Negativo!");
		}
		
		else if(numero %3 == 0)
		{
			System.out.println("este numero é IMPAR !");
		}
		
		else
		{
			System.out.println("Numero é PAR");
		}
		
		ler.close();
	}

}
