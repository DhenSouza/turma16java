import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double x1,x2,y1,y2,d;
		double soma1,soma2,potencia1,potencia2,resultado,raiz;
		
		System.out.println("Informe um valor para o X1: ");
		x1 = ler.nextDouble();
		
		System.out.println("Informe um valor para o X2: ");
		x2 = ler.nextDouble();
		
		System.out.println("Informe um valor para o Y1: ");
		y1 = ler.nextDouble();
		
		System.out.println("Informe um valor para o Y2: ");
		y2 = ler.nextDouble();
		
		soma1 = (x1+x2); soma2 = (y1+y2);
		
		potencia1 = Math.pow(soma1, 2); potencia2 = Math.pow(soma2, 2);
		
		resultado = potencia1 + potencia2;
		
		raiz = Math.sqrt(resultado);
		
		System.out.println("O resultado é: " + raiz);
	}

}
