package exercicio1;

import java.util.Scanner;

public class ObjetoCliente {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Cliente people = new Cliente("Luiza", "12345678", "Rua lagonis");
		
		System.out.println(people.mostraTela());
		
		leia.close();
	}

}
