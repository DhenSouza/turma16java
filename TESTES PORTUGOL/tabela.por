programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		// pAULISTINHA
		/* CORINTHIANS, SPFC, PALMEIRAS, SANTOS
		 * Ganha - 3 pontos
		 * perdeu - 0 pontos
		 * empate - 1 ponto
		 * faca um programa que peça se cada time G - ganhou,  P- perdeu, E- empatou
		 * em 4 rodadas
		 * no final mostra o nome de cada time e seus respectivos pontos
		 */
			// CORINTHIANS - G - ganhou P- Perdeu ou E - empatou [G/P/E]

		cadeia times [] = {"CORINTHIANS","PALMEIRAS", "SANTOS", "SPFC"}
		inteiro pontos [4]
		cadeia resposta
		

		para(inteiro i = 0; i < 4; i++)
		{
			escreva("Rodada ", (i+1), "\n")
			para(inteiro y = 0; y < 4; y++)
			{
				escreva(times[y], " G - ganhou,  P- perdeu, E- empatou: ")
				leia(resposta)
				resposta = Texto.caixa_alta(resposta)
				se (resposta == "G")
				{
					pontos[y] = pontos[y] + 3
				}
				senao se (resposta == "E")
				{
					pontos[y] = pontos[y] + 1
				}
				senao se (resposta == "P")
				{
					pontos[y] = pontos[y] + 0
				}
			}
		
		escreva("\n")
		}
		escreva("\n")
		para(inteiro z=0; z<4;z++)
		{
			escreva(times[z], " Finalizou com ", pontos[z], " pontos!!\n")
		}

		 
	}
	 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1136; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */