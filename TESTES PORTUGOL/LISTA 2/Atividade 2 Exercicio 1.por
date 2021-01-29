programa
{
	
	funcao inicio()
	{

		/*João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se 
		 * houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. Caso contrário 
		 * mostrar tais variáveis com o conteúdo ZERO.
		 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
		 * deve pagar um multa de R$ 4,00 por quilo excedente
		 */

		 //ATIVIDADE 1
		 
		 inteiro pesoTomate, excesso = 0, valorMulta=0
		 const inteiro multa = 4

		 escreva("Digite quanto Kg esta carregando:")
		 leia(pesoTomate) 


		se (pesoTomate > 50)
		{
			excesso = (( pesoTomate - 50) * 4)
			escreva("Voce ultrapassou o limite de peso, deverá pagar uma multa de: R$ "+ excesso)
		}
		senao se (pesoTomate <= 50)
		{
			pesoTomate = 0
			excesso = 0
			escreva("Voce esta dentro do peso aceitavel!" )
			escreva("Seu valor dentro dos limites é de: " + excesso + "\n" +pesoTomate)
		}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1026; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */