package revisao4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia  = new Scanner(System.in);
		double numero;
		
		System.out.println("Informe um numero: ");
		numero = leia.nextDouble();
		
		numero = Math.pow(3, numero);
		
		System.out.println(numero);
		leia.close();
	}

}
