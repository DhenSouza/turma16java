programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()

	// Atividade 7
	/*Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	 * (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	 */
	 
	{
		real base = 0.00 , altura = 0.00 , area = 0.00
		
		escreva("Digite a base do triangulo: ")
		leia(base)

		escreva("Digite a altura do triangulo: ")
		leia(altura)

		linha()
		
		se(base > 0 e altura > 0)
		{
			area = ((base * altura) / 2)
			escreva("A area do triangulo é: " + Mat.arredondar(area, 2))
		}
		senao
		{
			escreva("Voce digitou um numero negative ou zero, vai dar não")
		}
		

	linha()
	}

	funcao linha(){
		escreva("\n-----------------------------------------------\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 661; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */