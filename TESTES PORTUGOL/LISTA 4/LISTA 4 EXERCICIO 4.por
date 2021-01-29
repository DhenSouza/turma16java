programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * LISTA 4 - Exercicio 4
		 * 
		 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
		 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal
		 * 
		 */
		inteiro matriz  [3][3], soma = 0
		para (inteiro linha = 0; linha < 3; linha++)
		{
			para (inteiro coluna =0; coluna < 3; coluna++)
			{
				matriz[linha][coluna] = Util.sorteia(1, 9)

				se(linha == coluna)
				{
					soma += matriz [linha][coluna]
				}

				escreva(matriz[linha][coluna], " ")
			}
			escreva("\n")
		}
		escreva("\nA soma da diagonal principal é de: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 656; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */