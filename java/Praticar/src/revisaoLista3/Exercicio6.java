package revisaoLista3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int numero = 0, soma = 0;
		
		System.out.println("Informe o numero: ");
		numero = leia.nextInt();
		
		do {
			
			soma += numero;
			numero -= 1;
			
		}while(numero >= 0);
		
		
		System.out.println(soma);
		leia.close();
	}
}
