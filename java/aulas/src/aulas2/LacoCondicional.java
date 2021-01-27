package aulas2;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.printf("\n Informe a sua idade: ");
		
		idade = leia.nextInt();
		
		leia.nextLine();
		System.out.printf("\n Informe seu nome: ");
		nome = leia.nextLine();
		leia.close();
		
		System.out.printf("\n Seu nome: %s", nome);
		System.out.printf("\n Sua Idade: %d", idade);
		
		if(idade >= 18)
		{
			System.out.printf("\n Voce é maior de Idade !");
		}
		else if(idade >= 1 && idade < 18)
		{
			System.out.printf("\n Voce é menor de Idade !");
			
		}
		else 
		{
			System.out.printf("\n IDADE INVALIDA LIXO !");
		}
	}

}
