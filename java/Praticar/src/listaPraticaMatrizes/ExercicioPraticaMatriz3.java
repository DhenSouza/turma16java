package listaPraticaMatrizes;

import java.util.Scanner;

public class ExercicioPraticaMatriz3 {

		/*
		 * Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento de cada linha. Suponha n�o haver
			empates.
			Entrada: A entrada cont�m o n�mero N, depois os dados da matriz.
			Sa�da: A sa�da cont�m os n�meros representando o maior elemento de cada linha da matriz.
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
		
		System.out.printf("Os maiores valores das linhas da matriz � de: %d",  maior);
		
		leia.close();
	}

}
