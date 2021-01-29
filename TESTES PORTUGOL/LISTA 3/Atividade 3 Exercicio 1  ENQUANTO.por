programa
{
	
	funcao inicio()
	{
		// EXERCICIO 1 - ENQUANTO
		/*
		 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
		 * apresente no final o total do somatório, a média e o total de valores lidos. 
		 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo 
		 * valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
		 */

		 inteiro numero = 0, somaTotal = 0, totalValores = 0 
		 real contador = 0.00
		 
		 real media = 0.00 


			enquanto (numero >= 0)
			{
		
		 	escreva("Informe um valor positivo: ")
		 	leia(numero)

				se (numero > 0)
				{
					somaTotal += numero
					totalValores += 1
				     contador ++
				} 
				
			}

			 media =  (somaTotal / contador)
			 escreva ("A soma total: " + somaTotal)
			 escreva (" \n A media dos numeros é:  " + media)
			 escreva("\n Total de numeros é: ",  totalValores)
			  	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 731; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */