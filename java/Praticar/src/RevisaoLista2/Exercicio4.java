package RevisaoLista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1=0;
		
		System.out.println("Informe o valor de um Numero, para descobrir se é IMPAR OU PAR: ");
		num1 = leia.nextInt();
		
		if(num1 %2 == 0) {
			System.out.printf("Esse numero: %d é Par", num1);
		}
		else {
			System.out.printf("Esse numero: %d é Impar", num1);
		}
		
		leia.close();
	}

}
