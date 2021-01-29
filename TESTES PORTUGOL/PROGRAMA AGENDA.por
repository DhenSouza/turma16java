programa
{
	
	funcao inicio()
	{
		cadeia AGENDA[24][31] // 0-23 e 0-30
		cadeia nome
		inteiro dia = 0, hora = 0
		caracter opcao 

		//aqui vai ter o inicio do loop


		escreva("Informe seu nome: ")
		leia(nome)

		
		faca 
		{
	
		escreva("Escolha um dia para cadastro [1/31]: ")
		leia(dia)

		enquanto(dia <= 0 ou dia > 31)
		{
			escreva("data informada incorreta! Escolha uma data entre 1 e 31: ")
			leia(dia)
		}
		
		dia -= 1 // ajuste oara evitar o estouro da matriz, pois é de 0 a 30
		escreva("Escolha a hora do evento [0 - 23]: ")
		leia(hora)

		enquanto(hora < 0 ou hora > 23)
		{
			escreva("\n Hora informada incorreta, escolha entre 0 e 23 horas: ")
			leia(hora)
		}

		escreva("\n Informe o evento que ocorrera nesta data e Hora: ")
		leia(AGENDA[hora][dia])

		escreva("Deseja continuar?  se SIM digite - 1 se NAO digite - 2:  ")
		leia(opcao)

		se(opcao == '2')
		{
			pare
		}

		} enquanto(opcao == '1')
 
		escreva("Olá ", nome, "\n Os eventos que irao ocorrer na data e hora serão: ")
		para ( inteiro x = 0; x < 31; x++)
		{
			para( inteiro y =0; y < 24; y++)
			{
				se (AGENDA[y][x] != "")
				{
					escreva("\n Dia : ",x+1," hora: ", y, " : ", AGENDA[y][x], "\n")
				}
				
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 674; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {AGENDA, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */