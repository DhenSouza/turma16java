programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * 	Elabore um programa que calcule o que deve ser pago por um produto, considerando o
			preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da
			tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
			adequado.
			Código Condição de pagamento
			1 À vista em dinheiro ou cheque, recebe 20% de desconto
			2 À vista no cartão de crédito, recebe 15% de desconto
			3 Em duas vezes, preço normal de etiqueta sem juros
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 */

		 cadeia produtos [] = {"Sabonete", "Bolacha", "Leite"}
		 cadeia codigoProduto [3]
		 cadeia selecionaProduto
		 inteiro precoProduto = 0
		 caracter condicaoAvista = '1', condicaoCredito = '2', duasVezes = '3', tresVezes = '4', continua = 'S'

		 escreva("Codigo \t\t Produto \t Preço \n")

		para(inteiro i=0; i < 3; i++)
		{
			precoProduto = Util.sorteia(4, 10)
			codigoProduto[i] = "P " + (i+1)
			escreva(codigoProduto[i], "\t", produtos[i]," ", "\t", precoProduto, "\n")

		}

		escreva("Informe o codigo do produto que deseja: ")
		leia(selecionaProduto)
		limpa()

		
		
		para(inteiro x=0;x<3;x++)
		{
			
			se(selecionaProduto == codigoProduto[x])
			{
				escreva("Voce selecionou o produto ", produtos[x], "\n")

				
				escreva("Informe a condição do produto, se for a vista ou cheque digite 1 ")
				leia(condicaoAvista)
					ponto()
					limpa()
				escreva(" \n Se for a vista no Cartao de Credito digite 2 ")
				leia(condicaoCredito)
					ponto()
					limpa()
				escreva("\n Se for parcelado em duas vezes digite 3  ")
				leia(duasVezes)
					ponto()
					limpa()
				escreva("\n Se for parcelado em tres vezes digite 4 ")
				leia(tresVezes)
					ponto()
					limpa()
				se (condicaoAvista == '1')
				{
					precoProduto = ((precoProduto * 20) / 100)
					escreva("\n Seu desconto é de 20% ")
				}
				
				senao se(condicaoCredito == '2')
				{
					precoProduto = ((precoProduto * 15) / 100)
					escreva("\n Seu desconto é de 15% ")
				}
				//Damon
				senao se(duasVezes == '3')
				{
					precoProduto = precoProduto
					escreva("\n Voce não teve desconto")
				}
				senao se(tresVezes == '4')
				{
					precoProduto += 10
					escreva("\n teve um acrescimo de 10%")
				}
				senao
				{
					escreva("Opção incorreta, por gentileza informar a opção correta ")
				}

				escreva(" \n O valor do produto com o desconto é de: ", precoProduto)
			}
		}
	}

	funcao ponto()
	{
		escreva("═══════════════════════════════════════════════════════════")//ASCII

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */