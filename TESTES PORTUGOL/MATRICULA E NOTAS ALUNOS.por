programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		cadeia alunos[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS"
		,"ATHOS GIOM DE PAIVA MESQUITA","CANDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA",
		"DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA","DENISE BRITO ANJOS",
		"FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS","FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ",
		"GUSTAVO DE SOUZA GUILHEN","GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS",
		"JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI","KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA",
		"LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT","LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS",
		"MARIA NAZARE CORTEZ LIMA","MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI",
		"MILTON JUNIOR CAVALCANTE DA PENHA","NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO","PAOLA ALENCAR LISBOA",
		"RAPHAEL EUZÉBIO SCAZITI","RENATO ANDRÉ NASCIMENTO SILVA","RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES",
		"VICTOR DE MORAIS ARAUJO"}
		
		inteiro notas [40]
		cadeia matricula[40],  situacao
		cadeia selecionaMatricula
		caracter continua = 'S'
		
		escreva("Matriculo \t\t Aluno \n")
		 para (inteiro x=0;x<40; x++)
		 {
		 	
		 	matricula[x] = "G16-"+(x+1)
		 	escreva(matricula[x],"\t",alunos[x],"\n")
		 	
		 }
		enquanto (continua == 's' ou continua == 'S')
		{
		 escreva("Digite a matricula do aluno que deseja: ")
		 leia(selecionaMatricula)
		para (inteiro i=0;i<40; i++)
		{
			se(selecionaMatricula == matricula[i])
			{
				escreva("Voce selecionou o aluno: ", alunos[i])
				escreva("Informe a Nota de 1 a 10: ")
				leia(notas[i])
				enquanto(notas[i] < 0 ou notas[i] > 10)
				{
					escreva("Nota invalida, digite uma nota de 1 a 10: ")
				}

				escreva("Deseja cadastrar outra nota? [S/N]")
				leia (continua)

			
			}
		}

		} 
			escreva("Matricula\tNota\tSituação\tAluno\n")
		para(inteiro i = 0; i <40; i++)
		{
			se(notas[i] <  5 e notas[i] > 0)
			{
				situacao = "Reprovado"
			}
			senao se(notas[i] >= 5 e notas[i] <=8)
			{
				situacao = "Em analise"
			}
			senao se(notas[i] > 8  )
			{
				situacao = "Aprovado"
			}
			senao
			{
				situacao = "Não avaliado"
			}
			matricula[i] = "G16-" + (i+1)
			escreva(matricula[i],"\t",notas[i],"\t", situacao, "\t", alunos[i], "\n")
		}
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2056; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */