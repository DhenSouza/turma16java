package listaPraticaMatrizes;

import java.util.Scanner;

public class ExercicioPraticaMatriz2 {

	/*
	 *		Ler um número N e depois uma matriz quadrada NxN com números inteiros. Depois, mostrar na tela a soma dos
			elementos de cada linha da matriz.
			Entrada:
			A entrada contém o número N, depois os dados da matriz.
			Saída:
			A saída contém os números representando a soma dos elementos de cada linha da matriz.
	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int L, M; 
		
		System.out.println("Informe o numeros de linhas da matriz: ");
		L = leia.nextInt();
		
		System.out.println("Informe o numeros de Colunas da matriz: ");
		M = leia.nextInt();
		
		
		int [][] matriz = new int [L][M];
		int [] vetor = new int [L];
		
		for(int linha=0; linha<L; linha++) {
			System.out.printf("Digite os elementos da %d linha: \n", linha+1);
			for(int coluna=0; coluna<M; coluna++)
			{
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		for (int linha = 0; linha < L; linha ++) {
	        vetor[linha] = 0;
	        for (int coluna = 0; coluna < M; coluna++) {
	            vetor[linha] = vetor[linha] + matriz[linha][coluna];
	        }
	    }
		System.out.println("\n");
		
		for (int i = 0; i < L; i ++) {
	        System.out.printf(" |%d| ", vetor[i]);
	    }

		
		leia.close();
	}

}
