package listaPraticaMatrizes;

import java.util.Scanner;

public class ExercicioPraticaMatriz1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int M = 3, N = 3;
		
		int [][] matriz = new int [M][N];
		
		for(int linha=0;linha<M;linha++)
		{
			for(int coluna=0;coluna<N;coluna++)
			{
				System.out.println("Informe os Numeros da Matriz:" );
				matriz[linha][coluna] = leia.nextInt();
				
			}
		}
		System.out.println("\n");
		for(int linha=0;linha<M;linha++)
		{
			for(int coluna=0;coluna<N;coluna++)
			{
				if(matriz[linha][coluna] < 0) {
					System.out.printf("\n  Negativos: [%d]", matriz[linha][coluna]);
				}
				else {
					System.out.printf("\n Positivos: %d", matriz[linha][coluna]);
				}
				
			}
		}
	}

}
