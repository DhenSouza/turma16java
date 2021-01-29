programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro vetor [3]
		inteiro matriz [3][3]

			// INFORMAR O VALOR DO VETOR TAMANHO 3
		escreva("Informe os valores do vetor 3 posições")
		escreva("\n")

		para(inteiro i = 0; i <3; i++)
		{
			escreva("Digite os tres valores do vetor: ")
			leia(vetor[i])
		}
		// INFORMAR OS VALORES DA MATRIZ 3X3
		
		para(inteiro linha=0; linha <3; linha++)
		{
			para(inteiro coluna=0; coluna <3; coluna++)
			{
				escreva("Informa os valores da matriz 3x3: ")
				leia(matriz[linha][coluna])
			}
		}
			//Exibir os valores do vetor
		para(inteiro i = 0; i <3; i++)
		{
			escreva("\n Os valores do Vetor \n ", vetor[i])
		}
		//Exibir os valores da Matriz
		
		para(inteiro linha=0; linha <3; linha++)
		{
			para(inteiro coluna=0; coluna <3; coluna++)
			{
				escreva("|", matriz[linha][coluna],"|")
			}
		}


		//Multiplicar vetor e matriz

		para(inteiro linha=0; linha <3; linha++)
		{
			para(inteiro coluna=0; coluna <3; coluna++)
			{
				matriz[linha][coluna] = vetor[linha] * matriz[linha][coluna]
			}
		}

		// exibir valores multiplicados]
		para(inteiro linha=0; linha <3; linha++)
		{
			para(inteiro coluna=0; coluna <3; coluna++)
			{
				escreva("\n ", matriz[linha][coluna])
			}
		}

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 72; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 7, 10, 5}-{matriz, 8, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */