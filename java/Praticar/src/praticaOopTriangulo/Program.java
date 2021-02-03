package praticaOopTriangulo;

import java.util.Locale;
import java.util.Scanner;

import praticaOop.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double areaX = 0.00;
		double areaY = 0.00;
		//Triangulo x,y;
		Triangulo x = new Triangulo();
		Triangulo  y = new Triangulo();
		
		System.out.println("Informe o valor do Triangulo X: ");
		x.ladoA = leia.nextDouble();
		x.ladoB = leia.nextDouble();
		x.ladoC = leia.nextDouble();
		
		System.out.println("Informe o valor do Triangulo Y: ");
		y.ladoA = leia.nextDouble();
		y.ladoB = leia.nextDouble();
		y.ladoC = leia.nextDouble();
		
		areaX = x.area();
		
		areaY = y.area();
		
		System.out.printf("Area do Triangulo X: %.4f ", areaX);
		System.out.printf("Area do Triangulo Y: %.4f\n", areaY);
		
		if(areaX > areaY)
		{
			System.out.println("O maior valor é do Triangulo X!! ");
		}
		else
		{
			System.out.println("O maior valor é do Triangulo Y!! ");
		}
		
		leia.close();
	}

}
