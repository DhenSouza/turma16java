package listaPraticaVetor;

//import java.util.Random;
import java.util.Scanner;

public class ExercicioPratica4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Random random = new Random();
		
		final double TAMANHO = 5;
		double [] numeros = new double[10];
		double soma = 0.00, media = 0.00;
		
		for(int i = 0;i<TAMANHO;i++)
		{
			System.out.println("Digite os numeros do Vetor: ");
			numeros[i] = leia.nextDouble();
			soma += numeros[i];
		}
		
		for(int i = 0;i<TAMANHO;i++)
		{
			System.out.println(numeros[i]);
			
		}
		media = soma / 10;
		System.out.println("A media é :" + media);
		
		for(int i = 0;i<TAMANHO;i++)
		{
			if(numeros[i] < media)
			System.out.println(numeros[i]);
			
		}
		leia.close();
	}

}
