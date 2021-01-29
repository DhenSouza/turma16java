programa
{
	
	funcao inicio()
	{
/*Faça um sistema que leia um número inteiro e mostre uma 
 * mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.				
 */

 	//ATIVIDADE 4

 		inteiro natural

 		escreva("digite um numero natural: ")
 		leia(natural)

 		se (natural < 0)
 		{
 			escreva("O número " + natural + " é negativo")
 		}
 		senao se (natural > 0)
 		{
 			escreva ("O número " + natural + " positivo")
 		}
 		 senao se (natural %2 == 0){
		escreva(" e também é PAR")
 		}
 		senao
 		{
 			escreva(" e também é IMPAR")
 		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */