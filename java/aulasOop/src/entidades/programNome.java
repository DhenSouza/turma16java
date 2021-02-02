package entidades;

import java.util.Scanner;

public class programNome {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Pessoa pessoa1 = new Pessoa("Maria","Antonia", "Silva");
		
		System.out.println(pessoa1.getNomeCompleto());
		leia.close();
	}

}
