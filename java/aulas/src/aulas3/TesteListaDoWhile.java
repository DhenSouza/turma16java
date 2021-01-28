package aulas3;

import java.util.Scanner;

public class TesteListaDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char opcao;
		System.out.println("Continua Sim ou Não: S/N: ");
		opcao = leia.next().charAt(0);
		
		do {
			System.out.println("Voce esta dentro do while!! ");
			System.out.println("Continuamos? S/N:  ");
			
			opcao = leia.next().charAt(0);
		}while(opcao == 'S');
		
		System.out.println("Fim de programa!!! ");
		leia.close();

	}

}
