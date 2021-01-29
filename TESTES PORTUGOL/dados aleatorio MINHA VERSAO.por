programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{

	/*LISTA 4 - ATIVIDADE 2 
		 * 
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os 
		 * lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
		 * e apresente também quantas foram as ocorrências da maior pontuação.
		 * 
		 */

	const inteiro TAMANHO = 10
		inteiro lancamento [TAMANHO], maiorValor = 0, contador = 0
		real media = 0.00, soma = 0.00

		para(inteiro i = 0 ; i < TAMANHO; i++)
		{
			lancamento [i] = Util.sorteia(1,6)
			soma += lancamento [i]
			se(lancamento [i] >= maiorValor)
			{
				se (lancamento [i] > maiorValor )
				{
					contador ++
				}
				senao 
				{
					contador = 1
				}
				maiorValor = lancamento [i]
			
			}

			escreva ("\n os valores desse dado é: ",lancamento [i] )
		}

		media = soma / TAMANHO

		escreva ("\n media é : ", media )
		escreva ("\n O maior valor dos numeros atribuidos é : ", maiorValor, " e o numero apareceu: ",contador, " vezes" )

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 806; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */