package RevisaoLista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float poluente = 0;
		
		System.out.println("Informe o nivel de poluição de 0.05 a 0.25: ");
		poluente = leia.nextFloat();
		
		if(poluente >= 0.05 && poluente < 0.25)
		{
			System.out.printf("nivel aceitavel ");
		}
		else if(poluente >= 0.30 && poluente < 0.40) {
			System.out.println("Grupo 1 de industrias Suspendam suas atividads Imediatamente! ");
		}
		else if(poluente >= 0.40 && poluente <0.50) {
			System.out.println("Grupo 1 e 2 de industrias Suspendam suas atividads Imediatamente! ");
		}
		else if(poluente >= 0.5) {
			System.out.println("Todos os Grupos Suspendam suas atividads Imediatamente! ");
		}
		leia.close();
	}

}
