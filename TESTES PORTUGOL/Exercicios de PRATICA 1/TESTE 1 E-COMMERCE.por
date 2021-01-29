programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro numeroItens = 5
		cadeia produtos [numeroItens] = {"Blusa","Jaqueta","Bota","Meia","Calça"}
		cadeia selecionaProdutos [numeroItens], codigoProduto
		real precoProduto [numeroItens] = {50.5,60.5,70.5,5.5,60.5}
		inteiro quantidade [numeroItens], opcao = 0
		caracter pergunta = '1'

		escreva("[Codigo do produto] [Nome produto] [Estoque] [Valor Unitario]\n")
		faca
		{
			se(opcao == 0){					
			para(inteiro i=0;i<numeroItens;i++)
			{	
				quantidade[i] = 10			
			}
			}
		para(inteiro i=0;i<numeroItens;i++)
		{
			selecionaProdutos[i] = "# "+(i+1)
			escreva("|","# ",(i+1),"\t|\t",produtos[i],"\t|\t",quantidade[i],"\t|\t",precoProduto[i],"\n")
		}
			escreva("\n Informe o codigo do produto que deseja: ")
			leia(codigoProduto)
		para(inteiro i=0;i<numeroItens;i++)
		{
			se(codigoProduto == selecionaProdutos[i])
			{
			escreva("\n Voce selecionou o produto: ", produtos[i])
			escreva("\n Informe a quantidade que deseja do produto: ")
			leia(quantidade[i])
			}
			
		}
		escreva("\n Deseja continuar? Digite 1 - Sim OU 2 - Não ")
		leia(pergunta)
		} enquanto(pergunta == '1')
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 976; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */