package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pessoas = 0, idade, sexo, emo = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0,outrosCalmos = 0,
				jovensCalmos = 0, adultosNervosos = 0;
		
		while(pessoas <=  2 ) 
		{
			System.out.print("\n Informe seu sexo, digite (1-feminino / 2-masculino / 3- Outros): ");
			sexo = leia.nextInt();
			
			while (sexo < 1 || sexo > 3)
			{
				System.out.println("Numero digitado invalido, digite as opções novamente: ");
				System.out.print("\n Informe seu sexo, digite (1-feminino / 2-masculino / 3- Outros): ");
				sexo = leia.nextInt();
			}
			
			System.out.println("\n Informe Seu estado emocional, digite (1 - calma / 2 - nervosa / 3 - agressiva");
			emo = leia.nextInt();
			
			while (emo < 1 || emo > 3)
			{
				System.out.println("\n Numero digitado invalido, digite as opções novamente: ");
				System.out.println("\n Informe Seu estado emocional, digite (1 - calma / 2 - nervosa / 3 - agressiva");
				emo = leia.nextInt();
			}
			
			System.out.println("\n Informe Sua Idade: ");
			idade = leia.nextInt();
			
			while (idade < 0 )
			{
				System.out.println("\n Numero digitado invalido, digite as opções novamente: ");
				System.out.println("\n Informe Sua Idade: ");
				idade = leia.nextInt();
				
			}
			if (emo == 1) {
				
				pessoasCalmas ++;
				if(sexo == 3) 
				{
					outrosCalmos++;
				}
				if(idade < 18)
				{
					jovensCalmos++;
				}
			}
			else if (emo == 2)
			{
				if(sexo == 1)
				{
					mulheresNervosas++;
					
				}
				if(idade > 40)
				{
						adultosNervosos++;
				}
			}
			else if (emo == 3 && sexo == 2)
			{
					homensAgressivos++;
			}
		
				pessoas++;
		}
		
		System.out.printf(" \n o Total de pessoas calmas %d", pessoasCalmas);
		System.out.printf("\n O total de mulheres nervosas: %d", mulheresNervosas);
		System.out.printf("\n O total de Homens Agressivos: %d", homensAgressivos);
		System.out.printf("\n O total de outros Calmos: %d", outrosCalmos);
		System.out.printf("\n O total de pessoas acima de 40 anos Nervosos: %d", adultosNervosos);
		System.out.printf("\n O total de pessoas abaixo de 18 anos Calmos: %d", jovensCalmos);
		
		leia.close();
	}

}
