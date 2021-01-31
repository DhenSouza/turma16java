package listaPraticaMatrizes;

import java.util.Scanner;

public class ExercicioPraticaMatriz3 {

		/*
		 * Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento de cada linha. Suponha não haver
			empates.
			Entrada: A entrada contém o número N, depois os dados da matriz.
			Saída: A saída contém os números representando o maior elemento de cada linha da matriz.
		 */
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int N, maior = 0; 
		
		System.out.println("Informe a ordem da matriz: ");
		N = leia.nextInt();
	
		int [][] matriz = new int [N][N];
		
		for(int linha=0; linha<N;linha++) {
			for(int coluna =0; linha<N; linha++)
			{
				System.out.println("Informe os valores da matriz: ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		for(int linha=0; linha<N;linha++) {
			maior = matriz[linha][0];
			for(int coluna =0; linha<N; linha++)
			{
				if(matriz[linha][coluna] > maior) {
					maior = matriz[linha][coluna];
				}
			}
		}
		
		System.out.printf("Os maiores valores das linhas da matriz é de: %d",  maior);
		
		leia.close();
	}

}
