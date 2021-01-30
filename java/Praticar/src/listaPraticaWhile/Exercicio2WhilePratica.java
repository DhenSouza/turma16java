package listaPraticaWhile;

import java.util.Scanner;

public class Exercicio2WhilePratica {

	/*
	 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int X,Y;
		
		while(true)
		{
			System.out.println("Informe o Valor de X: ");
			X = leia.nextInt();
			
			System.out.println("Informe o Valor de Y: ");
			Y = leia.nextInt();
			
			
			if(X > 0 && Y > 0) {
				System.out.println("\t PRIMEIRO");
			}
			else if(X < 0  && Y > 0 ) {
				System.out.println(" \t SEGUNDO");
			}
			else if(X < 0  && Y < 0 ) {
				System.out.println(" \t TERCEIRO");
			}
			else
			{
				System.out.println(" \t Quarto");
			}
		}
		
	}

}
