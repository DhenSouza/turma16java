programa
{
	
	funcao inicio()
	{
		// questao numero 1
		
		inteiro diasDoAno = 365
		inteiro diasDoMes = 30
		inteiro dias,meses,idade, total

		escreva ("Digite os anos da pessoa: ")
		leia (idade)

		escreva ("digite os Meses: ")
		leia (meses)
		
		escreva ("Digite os Dias: ")
		leia(dias)

		 total = ((idade * diasDoAno) + (meses * diasDoMes) + dias)

		 escreva("a sua idade em dias é: " +  total)

   		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 73; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */