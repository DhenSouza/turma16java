package Exercicios;


public class Exercicio1 {

	public static void main(String[] args) {
		
		for( int i = 1000; i <= 1999;i++) 
		{
			if(i % 11 == 5)
			{
				System.out.printf (" Numero:  %d / 11 tem como resto 5\n",i);  
			}
		}
	}

}
