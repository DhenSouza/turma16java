programa
{
	
	funcao inicio()

	{
		caracter resposta
		cadeia agenda[24][31], nome
		inteiro hora=0, dia=1

			escreva("Bem-vindo! Digite o seu nome: ")
		     leia(nome) 

		 faca 
		 { 
		 	escreva("\nEscolha um dia para o evento [1/31]: ")
		 	leia(dia)
		 enquanto (dia <=0 ou dia > 31)
		 {
			escreva("\nData incorreta! Escolha uma data entre 1 e 31: ")
			leia(dia) 
		 }
		 dia-=1

		 	escreva("Escolha a hora do evento [0/23]: ")
		 	leia(hora)
		 enquanto (hora <0 ou hora >23)
		 {
		 	escreva("\nHora incorreta! Escolha entre 0 e 23h: ")
			leia(hora) 
		 }
		 
		 escreva("Informe o evento que acontecerá nessa data e hora: ")
		 leia(agenda[hora][dia])

		 escreva("Deseja continuar? (1)Sim ou (2)Não?: ")
		 leia(resposta)
		 
		 } enquanto(resposta=='1')
		 
		 para(inteiro x= 0; x<31; x++)
		 {
			para(inteiro y=0; y<24;y++)
			{
			    se (agenda[y][x] != "")
			    {
				 escreva("\n",nome,". Dia ",x+1,", ",y,"h. Evento: ",agenda[y][x],"\n")	
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
 * @POSICAO-CURSOR = 908; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */