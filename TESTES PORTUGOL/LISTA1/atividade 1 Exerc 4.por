programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro  a, b, c 
		real d, r, s

		escreva("Digite o valor de A:\n ")
		leia(a)

		escreva("Digite o valor de B:\n ")
		leia(b)

		escreva("Digite o valor de C:\n ")
		leia(c)

		r = Matematica.potencia(a + b , 2.0)
		s = Matematica.potencia( b + c , 2.0)
		d = (r + s)/2

		escreva("o resultado: " + d)

		
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */