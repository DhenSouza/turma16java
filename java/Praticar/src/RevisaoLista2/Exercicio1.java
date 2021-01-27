package RevisaoLista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		final double multa = 4;
		double pesoTomates, excesso = 0.0; 
		
		System.out.print("Informe o peso dos Tomates: ");
		pesoTomates = leia.nextDouble();
		
		if(pesoTomates > 50)
		{
			excesso = ((pesoTomates - 50)*multa);
			System.out.printf("Voce Ultrapassou o Limite, devera pagar uma multa (por kilo)de R$ %f ", excesso);
		}
		else if(pesoTomates <= 50)
		{
			System.out.println("Esta tudo Ok! ");
		
			excesso = 0;
			pesoTomates = 0;
			System.out.printf("\n Zerado ! %.2f %.2f ", excesso, pesoTomates);
		}
		
		leia.close();
	}

}
