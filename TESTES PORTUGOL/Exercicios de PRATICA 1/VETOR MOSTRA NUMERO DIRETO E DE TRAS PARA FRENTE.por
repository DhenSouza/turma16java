programa
{
	
	funcao inicio()
	{
		/*
	 	* 	Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código
			inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se
			for 2, mostre o vetor na ordem inversa. Caso, o código for diferente de 1 e 2, escreva uma	
			mensagem informando que o código inválido.
		 */

	 	real vetor1 [5]
	 	inteiro codigo [5]
	 	inteiro pergunta
	 	const real N = 5.0

	 	para(inteiro i=0; i < N; i++)
	 	{
	 		escreva("\n Digite 5 numeros reais no primeiro vetor: ")
	 		leia(vetor1[i])
	 	}

	 	escreva("\n")
	 	escreva("Informe o codigo: \t : 0 para finalizar : \t : 1 mostrar vetor de forma direta : \t 2 para ser na ordem inversa ")
	 	leia(pergunta)

	 	se(pergunta == 1)
	 		{
	 		para(inteiro i=0; i<N; i++)
	 		{
	 			escreva("\n Vetor contagem esquerda para direita : ", "\t Posição: ", i+1 , "\t valor ", vetor1[i])
	 		}
	 		}
	 	senao se(pergunta == 2)
	 		{
	 			para(inteiro i=4; i >= 0; i--)
	 		{
	 			escreva("\n Vetor contrario: ", "\t Posição: ", i-1 , "\t valor ", vetor1[i])
	 		}
	 		}
	 	senao se(pergunta == 0)
	 		{
	 			escreva("Programa finalizado! ")
	 		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1130; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */