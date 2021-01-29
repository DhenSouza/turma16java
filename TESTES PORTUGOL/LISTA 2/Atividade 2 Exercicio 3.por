programa
{
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{

//Desenvolva um sistema em que: Leia 4 (quatro) números;
//Calcule o quadrado de cada um; Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	//ATIVIDADE 3
	
	
		real quad1, quad2, quad3, quad4, n1, n2, n3, n4

		escreva("Digite o valor para N1: ")
		leia (n1)
		escreva("Digite o valor para N2: ")
		leia (n2)
		escreva("Digite o valor para N3: ")
		leia (n3)
		escreva("Digite o valor para N4: ")
		leia (n4)

		quad1 = m.potencia(n1, 2.0)
		quad2 = m.potencia(n2, 2.0)
		quad3 = m.potencia(n3, 2.0)
		quad4 = m.potencia(n4, 2.0)

		se (quad3 >= 1000)
		{
			escreva("O quadrado de N3 é: " + quad3)
		}
		senao
		{
			escreva("o Quadrado de N1: " + quad1)
			escreva("o Quadrado de N2: " + quad2)
			escreva("o Quadrado de N3: " + quad3)
			escreva("o Quadrado de N4: " + quad4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 956; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */