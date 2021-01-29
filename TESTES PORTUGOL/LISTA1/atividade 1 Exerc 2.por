programa
{
	
	funcao inicio()
	{
		// Questão Numero dois
   		inteiro idadePessoa, anos, meses, dias

   		escreva("Digite a quantidade de dias da pessoa: ")
   		leia(idadePessoa)

   		anos = (idadePessoa / 365)
   		meses = ((idadePessoa % 365) / 30)
   		dias = ((idadePessoa % 365) % 30)

   		escreva("\n total em anos: " + anos)
   		escreva("\n total em meses: " + meses)
   		escreva("\n Total em dias: " + dias)

   		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */