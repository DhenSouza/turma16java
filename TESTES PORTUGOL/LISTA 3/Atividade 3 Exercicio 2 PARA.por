programa
{
	
	funcao inicio()
	{
		//EXERCICIO 2 - PARA
		/*Desenvolver um sistema que efetue 
		 * a soma de todos os números ímpares que são  múltiplos de três e que se 
		 * encontram no conjunto dos números de 1 até 500.
		 */

			inteiro totalImpar = 0
		
		para (inteiro x=1; x <= 500; x++)
		{
			se (x %2 == 1 e x %3== 0)
			{
				totalImpar += x
			}
		}

		escreva("A soma de impares multiplos de 3 é: " + totalImpar)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 431; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */