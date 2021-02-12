package exercicio2Um;

import java.util.Scanner;

public class Exercicio9 {

	
	public int vetor(int n) {
		Scanner leia = new Scanner(System.in);
		int [] um = new int [n];
		int [] dois = new int [n];
		int [] resultado = new int [n];
		int quad1 = 0;
		int quad2 = 0;
		 
		 
		for(int soma : um) {
			System.out.println();
		}
		 for(int i = 0; i < n; i++)
		 {
			 System.out.println("Digite os numeros do vetor Um: ");
			 um [i] = leia.nextInt();
			 
		 }
		 
		 for(int i = 0; i < n; i++)
		 {	 
			 System.out.println("Digite os nuemros do vetor Dois: ");
			 dois [i] = leia.nextInt();
			 
		 }
		 for(int soma1 : um)
		 {	 
			 quad1 += soma1;
		 }
		 /*
		 for(int i = 0; i < n; i++)
		 {	 
			 System.out.printf("Resultado da soma de A + B dos vetores é de: %d\n" , resultado[i]);
		 }*/
		 for(int soma2 : dois) {
				quad2 += soma2;
			}
		 System.out.print("Resultado da soma é: %d" + (quad1 + quad2));
		return n; 
		 
	}
}
