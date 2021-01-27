package RevisaoLista2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double base = 0.0, altura = 0.0, triangulo = 0.0; 
		
		System.out.println("Informe o valor de Base; ");
		base = leia.nextDouble();
		
		System.out.println("Informe o valor de Altura; ");
		altura = leia.nextDouble();
		
		if(base > 0 && altura > 0) {
			triangulo = ((base * altura) / 2);
			System.out.println("O valor do Triangulo: " + triangulo);
		}
		else
		{
			System.out.println("Valores invalido ! ");
		}
		
		
		
		leia.close();
	}

}
