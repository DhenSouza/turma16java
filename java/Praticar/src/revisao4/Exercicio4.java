package revisao4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double F = 0.00, C = 0.00;
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor dos celcius: ");
		C = leia.nextDouble();
		
		F = C * 1.8 + 32;
		
		if(F >= 0 && F < 100) {
			System.out.printf("Valor convertido de Celsius a Fahrenheit: %.3f", F);
		}
		
		else {
			System.out.println("Não esta no padrao entre 0 e 100 graus");
		}
leia.close();
	}

}
