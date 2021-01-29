programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//EXERCICIO 1 - PARA

		/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o 
		 * salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.   
		 */

		real  salario = 0.0, mediaSalario = 0.0, mediaFilhos = 0.0, maiorSalario = 0.0, percentualSalario = 0.0 
		inteiro filhos
		real totalSalario = 0.0, totalFilhos = 0.0
		real contador = 0.00
		const inteiro POPULACAO = 5
		 
		para(inteiro x=0; x < POPULACAO; x++)
		{
			escreva("Informe a  renda: ")
			leia(salario)

			escreva("Digite o numero de filhos: ")
			leia(filhos)

			totalSalario = totalSalario + salario
			totalFilhos += filhos
			
			se(salario > maiorSalario)
			{
				maiorSalario = salario
			}
			se (salario <= 100)
			{
				contador ++
			}
		}

		mediaSalario = totalSalario / POPULACAO
		mediaFilhos = totalFilhos / POPULACAO
		percentualSalario = ((contador / POPULACAO) * 100.00)
	

		escreva("A media dos salarios: R$ ", mediaSalario)
		escreva("\nA media de filhos : ", mediaFilhos)
		escreva("\nO maior salario é de: " , maiorSalario)
		escreva("\n Numero de pessoas que ganham até R$ 100: " , contador, "Percentual de: ",percentualSalario, " % ")
		

		escreva( mediaSalario )

		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1128; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */