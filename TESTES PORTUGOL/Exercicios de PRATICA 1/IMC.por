programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		/*
		 * 	O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar
			uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / (
			altura )2
			Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de
			acordo com a tabela abaixo.
			IMC em adultos Condição
			Abaixo de 18,5 Abaixo do peso
			Entre 18,5 e 25 Peso normal
			Entre 25 e 30 Acima do peso
			Acima de 30 obeso
		 */

		 real altura = 0.00, peso = 0.00, IMC = 0.00

		 escreva("══ Calculo de IMC ══ \n")

		 escreva("Informe a sua altura: ")
		 leia(altura)

		 escreva("Informe o seu Peso: ")
		 leia(peso)

		 IMC = peso / (Mat.potencia(altura,2.00))

		 escreva("\n", Mat.arredondar(IMC, 2))

		 se(IMC < 18.5)
		 {
		 	escreva("\n Voce esta abaixo do peso ")
		 }
		 senao se(IMC >= 18.5 e IMC < 25)
		 {
		 	escreva("\n Voce esta no peso normal ")
		 }
		 senao se(IMC >= 25 e IMC < 30)
		 {
		 	escreva("\n Voce esta acima do peso ")
		 } 
		 senao 
		 {
		 	escreva ("\n Voce está Obeso ")
		 }

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 986; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */