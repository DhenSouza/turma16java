programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

	//ATIVIDADE 2
	/* Elabore um sistema que leia as variáveis C e N, respectivamente código e 
	 * número de horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	 *Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário 
	 *zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e 
	 o salário excedente.
	 */

	
		inteiro codigo
		real numeroTrabalho, calculoSalario, excesso = 0.00
		escreva("Digite sua Funcional: ")
		leia(codigo)
		escreva("Digite as horas trabalhadas: ")
		leia(numeroTrabalho)

		calculoSalario = (numeroTrabalho * 10)

		se (numeroTrabalho > 50)
		{
			excesso = (numeroTrabalho - 50) * 20
			escreva("O seu salario é R$" + calculoSalario + "voce ganhou de extra: " + excesso )
			escreva("Seu Salario é: R$ " + calculoSalario)
		}
		senao 
		{
			excesso = 0
			escreva("O seu Salario sem o Excedente é " + excesso)
			escreva("\n Seu Salario é: R$ " + calculoSalario)
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1095; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */