package aulas4;

import java.util.Scanner;

public class TesteVetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
		int[] arrayDois = {43,42,4,8,55,21,2,45};
		
		float[] nota = new float[5];
		
		//TAMANHO DO ARRAY / VETOR
		
		if (arrayDois.length > 8 )
		{
			System.out.println("O tamanho do ArrayDois é MAIOR que 8. ");
		}else
		{
			System.out.println("O tamanho do ArrayDois é MENOR que 8. ");
		}
		System.out.println("\n O tamanho do arrayUm é de: " + arrayUm.length);
		
		// UTILIZAÇÃO DO FOR-EACH
		
		String[] cars = {"Volvo", "", "Ford","Mazda"};
		
		for(String i : cars) 
		{
			System.out.println(i);
		}
		
		//POPULANDO UM ARRAY
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Entre com uma Nota: ");
			nota [i]= leia.nextFloat();
		}
		//APRESENTANDO UM ARRAY
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Nota: " + (i+1) + " = " + nota[i]);
		}
		leia.close();
	}

}
