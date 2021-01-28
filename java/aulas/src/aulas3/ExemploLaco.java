package aulas3;

import java.util.Random;
import java.util.Scanner;

public class ExemploLaco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		/*
		 * 		A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e 
		 * 	número de filhos. A prefeitura deseja saber:   
			a) média do salário da população; 
			b) média do número de filhos; 
			c) maior salário; 
			d) percentual de pessoas com salário até R$100,00.
		 */
		final double habitantes = 20;
		double salario = 0.0, filhos = 0.0, totalSalario = 0, totalFilhos = 0, maiorSalario = 0, contador = 0, percentualSalario = 0.0, 
				mediaFilhos = 0.0,
				mediaSalario = 0.0;
		
			for (int i=0; i <= habitantes;i++) {
			filhos = random.nextInt(5);
			 salario = random.nextInt(1500);
			 
			 totalSalario += salario;
			 totalFilhos += filhos;
			 
			 if(salario == maiorSalario)
			 {
				 maiorSalario = salario; 
			 }
			 else if(salario <= 100)
			 {
				 contador++;
			 }
		}
		mediaSalario = totalSalario / habitantes;
		mediaFilhos = totalFilhos / habitantes;
		percentualSalario = ((contador / habitantes) * 100.00);
		System.out.printf("\n A media salarial dos habitantes é de: %.2f", mediaSalario);
		System.out.printf("\n A media do numero de filhos  dos habitantes é de: %.2f", mediaFilhos);
		System.out.printf("\n Percentual de pessoas abaixo dos R$ 100.00 é de: %f", percentualSalario);
		leia.close();
	}

}
