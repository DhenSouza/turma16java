package aulas;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,soma;
		
		System.out.println("Informe o valor de A:");
		a = ler.nextInt();
		
		System.out.println("Informe o valor de B:");
		b = ler.nextInt();
		
		soma = a+b;
		
		System.out.println(soma);
		
		ler.close();
	}

}
