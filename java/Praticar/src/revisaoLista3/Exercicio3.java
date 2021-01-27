package revisaoLista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero = 0, soma = 0, quantidade = 0, cont = 0;
		double media = 0.0;
		while(numero >= 0) 
		{
			System.out.println("Informe um valor positivo: ");
			numero = leia.nextInt();
			if(numero > 0) {
				soma += numero ;
				quantidade += 1;
				cont ++;
			}
		}
		
		media = soma / cont;
		System.out.println("Soma Total: " + soma);
		System.out.println ("A media dos valores é: " + media);
		System.out.println("Total de numeros efetuados: " + quantidade);
		leia.close();
	}

}
