package revisaoLista3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		System.out.println("Informe um valor: ");
		numero = leia.nextInt();
		while(numero <= 100)
		{
			numero *= 3;
			System.out.println(numero);
		}
		System.out.println(".");
		leia.close();
	}

}
