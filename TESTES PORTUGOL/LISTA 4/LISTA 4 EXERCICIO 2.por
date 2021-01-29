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

		 inteiro lancamentos [10], maiorValor = 0, contador = 0
		 real media = 0.00, soma = 0.00
		
		 
		para (inteiro i=0; i < 10; i++)
		{
			lancamentos [i] = Util.sorteia(1, 6)
			soma += lancamentos[i]
			se (lancamentos[i] >= maiorValor)
			{

				se(lancamentos[i] == maiorValor)
				{
					contador++
				}
				senao 
				{
					contador = 1
				}
				maiorValor = lancamentos[i]
				
			}
		}
		para (inteiro i = 0; i < 10; i++)
		{
			escreva("\n Lançamento de dado: ", (i+1), "º é igual: ", lancamentos [i] )
		}

		media = soma / 10
		escreva("\nA soma dos valores do dado é: ", soma)
		escreva("\nA media dos valores é: ", media)
		escreva("\nA O maior valor é: ", maiorValor, " e apareceu: ", contador, " vezes" )

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 752; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */