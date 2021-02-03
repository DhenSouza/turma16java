package praticaOopRetangulo;

import java.util.Locale;
import java.util.Scanner;

import praticaOop.Retangulo;

public class MainRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Retangulo A = new Retangulo ();

		double calculoArea = 0.00, calculoPerimetro = 0.00, calculoDiagonal=0.00;
		System.out.println("Informe os Valores do Retangulo: ");
		A.altura = leia.nextDouble();
		A.base = leia.nextDouble();
		
		calculoArea = A.Area();
		calculoPerimetro = A.perimetro();
		calculoDiagonal = A.diagonal();
		
		System.out.printf("Area retangulo %.4f ", calculoArea);
		System.out.printf("Perimetro retangulo %.4f ", calculoPerimetro);
		System.out.printf("Diagonal retangulo %.4f ", calculoDiagonal);
		leia.close();
	}

}
