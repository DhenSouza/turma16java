programa
{
	
	funcao inicio()
	{
		//faça um programa que o numero seja natural, e dizer se o numero é par ou impar. 
		// se o usuario digitar numero 0 mostrar na tela "é neutro", negativo imprimir na tela "não é considerado"
		//SE O USUARIO DIGITA UM NUMERO NEGATIVO, MENSAGEM DE DECULPAS MAIS NÃO FAZ NADA

		linha()
		pulaLinha()
		inteiro natural

		escreva("Digite um numero Natural: ")
		leia(natural)

		se (natural == 0)
		{
			escreva ("Desculpa, mas esse numero é neutro")
			
		} 
		senao se(natural < 0)
		{
			escreva("Desculpa, numeros negativos não se aplica")
		} 
		senao 
		{
			se (natural %2 == 0)
			{
				escreva("Seu numero é Par")
			}
			senao 
			{
				escreva ("Seu numero é impar")
			}
		}
		pulaLinha()
		linha()
		
	}

		
	funcao linha() // Metodo- modulo - subprograma
	{
		escreva ("-----------------------------------------------------")
	}

	funcao pulaLinha()
	{
		escreva ("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 739; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */