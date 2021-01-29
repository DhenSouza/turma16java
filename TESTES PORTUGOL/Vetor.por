programa
{
	
	funcao inicio()
	{
		// Matrizes

		//Denise
		//Lucas
		//Candido
		//Carolina

		//solicite o nome de 4 alunos
		//suas respectivas notas
		// mostre na tela o nome e do lado a nota
		// a maior nota informada


		cadeia nomeAlunos [4]
		inteiro notaAlunos[4]
		

		/*nomeAlunos [0] = "Candido"
		nomeAlunos [1] = "Athos"
		nomeAlunos [2] = "Andressa"
		nomeAlunos [3] = "Gisele"
		*/

		para (inteiro i = 0; i < 4; i++)
		{
			escreva("Digite  nome do alune: " )
			leia(nomeAlunos[i])

			escreva("Digite a nota do alune: ")
			leia(notaAlunos[i])
		}
		para (inteiro i = 0; i < 4; i++)
		
		{
		escreva("O nome do alune é: ", nomeAlunos[i], " \ne a sua nota é: ", notaAlunos[i])
		}

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 509; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */