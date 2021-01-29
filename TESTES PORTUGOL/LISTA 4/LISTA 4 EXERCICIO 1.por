programa
{
	
	funcao inicio()
	{


	/* LISTA 4 - EXERCICIO 1
	*
	*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o 
	*escreva em seguida. Encontre após a maior pontuação e a apresente. 

	*
	 */
		real atividade [5], maior = 0.00
		inteiro x = 0
		

		para(inteiro i = 0; i < 5; i++)
		{
		escreva("Digite na posição: ", (i + 1), " um valor " )
		leia(atividade[i])

		se(atividade[i] > maior)
		{
			maior = atividade[i]
		}

		}

		para(inteiro i = 0; i < 5; i++)
		{
			
		escreva("\n Os valores digitados são: ",i+1, " : " ,  atividade[i])
		
		}

		escreva(" \n O maior valor é: ", maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */