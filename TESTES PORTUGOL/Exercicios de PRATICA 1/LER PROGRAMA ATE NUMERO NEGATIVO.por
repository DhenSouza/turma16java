programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*	Escrever um programa que leia uma quantidade desconhecida de números e conte quantos
			deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados
			deve terminar quando for lido um número negativo.
		*/
		inteiro numero = 0, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, repetir
		

		escreva("Digite o numero de vezes que deseja repetir a contagem: ")
		leia(repetir)

		para (inteiro i=0; i < repetir; i++)
		{
			escreva("\nInforme o numero desejado de 1 até 100 ")
			escreva("\n Se escolher um numero negativo irá sair do programa: ")
			leia(numero)

			se(numero > 0 e numero <= 25)
			{
				contador1 += 1
				escreva(" Intervalo de 0 a 25 existem: ", contador1, " numeros")
			}
			senao se(numero > 25 e numero <= 50 )
			{
				contador2 += 1
				escreva("\n Intervalo de 26 a 50 existem: ", contador2, " numeros")
			}
			senao se(numero > 50 e numero <= 75 )
			{
				contador3 += 1
				escreva("\n Intervalo de 51 a 75 existem: ", contador3, " numeros")
			}
			senao se(numero > 75 e numero <= 100 )
			{
				contador4 += 1
				escreva("\n Intervalo de 76 a 100 existem: ", contador4, " numeros")
			}
			senao se(numero < 0)
			{
				pare
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 506; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */