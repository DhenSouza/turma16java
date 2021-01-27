package RevisaoLista2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int  numero;
		
		System.out.println("Informe um numero: ");
		numero = leia.nextInt();
		
		if(numero > 100) {
			System.out.printf("O numero digitado é: %d", numero);
		}
		else
		{
			numero = 0;
			System.out.printf("O numero foi Zerado pois é menor que 100 Numero: %d", numero);
		}
		leia.close();
	}

}
