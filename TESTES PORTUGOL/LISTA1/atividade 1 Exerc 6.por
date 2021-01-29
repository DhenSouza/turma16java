programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		// Exercicio 6
		// Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
		//P(x1, y1) e P(x2, y2), escreva a distância entre eles. 


		real x1, x2, y1, y2, valor1, valor2, potencia1, potencia2, resultado, raiz

		escreva ("Digite o valor de x1: ")
		leia (x1)

		escreva ("Digite o valor de x2: ")
		leia (x2)

		escreva ("Digite o valor de y1: ")
		leia (y1)

		escreva ("Digite o valor de y2: ")
		leia (y2)

		valor1 = (x2-x1)
		valor2 = (y2-y1)

		potencia1 = Matematica.potencia(valor1,2)
		potencia2 = Matematica.potencia(valor2,2)

		resultado = potencia1 + potencia2

		raiz = Matematica.raiz(resultado, 2)

		escreva("o resultado é; " + raiz)
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 776; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */