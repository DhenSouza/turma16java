package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int  idade = 0,pessoas21 = 0, pessoas50 = 0;
		
		System.out.println("Informe a sua Idade: ");
		idade = leia.nextInt();
		
		while(idade != -99)
		{
				if(idade < 21)
				{
					pessoas21 ++;
				}
				else if(idade > 50)
				{
					pessoas50++;
				}
			System.out.println("Digite a idade OU para encerrar digite -99: ");
			idade = leia.nextInt();
		}
		
		System.out.printf(" \n O total de pessoas com menos de 21 anos é de: %d", pessoas21);
		System.out.printf("\n O total de pessoas acima dos 50 anos é de: %d",  pessoas50);
	
		leia.close();
	}

}
