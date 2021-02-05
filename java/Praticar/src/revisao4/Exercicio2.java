package revisao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia  = new Scanner(System.in);
		ClassExercicio2  gg = new  ClassExercicio2();
		gg.usuario();
		gg.imc();
		System.out.println(gg.getImc());
		leia.close();

	}

}
