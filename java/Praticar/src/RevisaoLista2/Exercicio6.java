package RevisaoLista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.printf("Informe seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.printf("\nOl� %s Sua faixa de idade est� em, Infantil A", nome);
		}
		else if(idade >= 8 && idade <= 11) {
			System.out.printf("\nOl� %s Sua faixa de idade est� em, Infantil B", nome);
		}
		else if(idade >= 12 && idade <= 13) {
			System.out.printf("\nOl� %s Sua faixa de idade est� em, Juvenil A", nome);
		}
		
		else if(idade >= 14 && idade <= 17) {
			System.out.printf("\nOl� %s Sua faixa de idade est� em, Juvenil B", nome);
		}
		else if(idade >= 18)
		{
			System.out.println("Sua faixa de idade � Adulto");
		}
		else
		{
			System.out.println("Voce n�o pode, esta fora da faixa de idades.");
		}
		leia.close();
	}

}
