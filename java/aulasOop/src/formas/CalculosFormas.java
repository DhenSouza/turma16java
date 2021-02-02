package formas;

import java.util.Locale;
import java.util.Scanner;

public class CalculosFormas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Define o tipo de padronização
		Scanner leia = new Scanner(System.in); // Instanciou o teclado - classe Scanner
		Triangulo tri1 = new Triangulo(); // criou 1 triangulo
		Triangulo tri2 = new Triangulo();
		
		
		System.out.println("Digite a base do primeiro triangulo: ");
		tri1.base = leia.nextDouble();
		System.out.println("Digite a altura do primeiro triangulo: ");
		tri1.altura = leia.nextDouble();
		tri1.area();
		System.out.println("\n SEGUNDO CASO");
		System.out.println("Digite a base do segundo triangulo: ");
		tri2.base = leia.nextDouble();
		System.out.println("Digite a altura do segundo triangulo: ");
		tri2.altura = leia.nextDouble();
		tri2.area();
		
		leia.close();
	}

}
