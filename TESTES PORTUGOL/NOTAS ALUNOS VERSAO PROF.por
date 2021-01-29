programa
{
	
	funcao inicio()
	{

		inteiro notas[40]
		cadeia matriculas[40]
		cadeia matricula
		inteiro indice=0
		caracter opcao='1'
		cadeia status
		//entradas
		//G0-1 REGRA DE MATRICULA
		//populando o vetor de matriculas
		para (inteiro x=0; x<40; x++)
		{
			matriculas[x]="G0-"+(x+1)
		}
		//mostra na tela os nomes e matriculas
		escreva("TURMA DO GRUPO G0-ZERO CONSCIENTE\n")
		linha()
		escreva("MAT\t ALUNO\n")
		para(inteiro x=0; x<40; x++)
		{
			escreva(matriculas[x],"\t ", alunos[x],"\n")
			
		}
		faca
			{
			escreva("Digite a matricula do aluno para inserir a nota: ")
			leia(matricula)
			para (inteiro x=0; x<40; x++)
			{
				se (matricula==matriculas[x])
				{
					indice = x
				}
			}
			escreva("Aluno - ",alunos[indice]," informa a nota: ")
			leia(notas[indice])
			escreva("Continua 1-sim ou 2-nao? ")
			leia(opcao)
		} enquanto (opcao =='1')
		limpa()
		escreva("TURMA DO GRUPO G0-ZERO CONSCIENTE\n")
		linha()
		escreva("MAT\t NOTA\t STATUS\t NOME\n")
		para(inteiro x=0; x<40; x++)
		{
			se (notas[x]==0)
			{
				status = ""
			}
			senao se (notas[x]<5)
			{
				status = "REPROVADO"
			}
			senao se (notas[x] <=8)
			{
				status = "EM ANALISE"
			}
			senao
			{
				status = "APROVADO"
			}
			escreva(matriculas[x],"\t ",notas[x]," \t",status," \t",alunos[x],"\n")
			
		}
		
		
	}
	//fora do codigo principal
	funcao linha()
	{
		para (inteiro y=0; y<60; y++)
		{
			escreva("═")//ASCII
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */