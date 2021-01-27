import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double diasDoAno = 365.00, diasDoMes = 30.00, dias,meses,idade,total;
		
		System.out.println("Informe os anos da pessoa: ");
		idade = ler.nextDouble();
		
		System.out.println("Informe os meses: ");
		meses = ler.nextDouble();
		
		System.out.println("Informe os dias: ");
		dias = ler.nextDouble();
		
		total = ((idade * diasDoAno) + (meses * diasDoMes) + dias);
				
				System.out.printf("Os dias totais são: %.2f" , total);
	}
}
