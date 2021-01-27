package revisaoLista3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero = 233;
		
		do
		{
			if(numero < 300 || numero > 400 ) 
			{
				numero += 5;
				System.out.println(numero);
			}
			else if(numero >= 300 && numero <= 400)
			{
				numero += 3;
				System.out.println(numero);
			}
		}while(numero <= 456);
		
		
		leia.close();
	}

}
