package revisaoLista3;

import java.util.Scanner;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		
		final double habitantes = 20;
		double salario, filhos, totalFilhos = 0.0, totalSalario = 0.0, mediaSalario = 0.0, mediaFilhos = 0.0, maiorSalario = 0.0,cont = 0.0;
		double percSalario = 0.0;
	
		for(int i=0; i<habitantes; i++)
		{
			 filhos = random.nextInt(5);
			 salario = random.nextInt(1500);
			 
			 System.out.println(" ª " + (i+1) + " Salario: " + salario + " Filhos: " + filhos);
			totalSalario += salario;
			totalFilhos += filhos ;
			
			if (salario == maiorSalario) {
				
				maiorSalario = salario;
			}
			
			else if(salario <= 100) {
				cont ++;
			}
		}
		
		mediaSalario = totalSalario / habitantes;
		mediaFilhos = totalFilhos / habitantes;
		percSalario = ((cont / habitantes) * 100.00);
		
		System.out.printf("\n A media de salario da População é de: %.2f", mediaSalario);
		System.out.printf("\n A media de filhos  da População é de: %.2f", mediaFilhos);
		System.out.printf("\n A Porcentagem de salario da População com ate R$ 100.00 é de: %.2f", percSalario);
		
		leia.close();
	}

}
