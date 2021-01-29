programa
{

	const inteiro percentualDistribuidor = 28
	const inteiro percentualImposto = 45
	
	funcao inicio()
	{
		real custoFabrica, custoConsumidor, valorDistribuidor, valorImposto
		

		 escreva("Informe o custo de fabrica:  ")
		 leia(custoFabrica)

		 valorDistribuidor = (custoFabrica + (custoFabrica * percentualDistribuidor))

		 valorImposto = (custoFabrica + (custoFabrica * percentualImposto / 100))

		 custoConsumidor = custoFabrica + valorDistribuidor + valorImposto


		 escreva("O custo ao consumidor é: " + custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 519; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */