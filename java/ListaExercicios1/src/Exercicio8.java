import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		final double pDistribuidor = 28;
		final double imposto = 45;
		double custoFabrica, custoConsumidor, valorDistribuidor, valorImposto;
		
		System.out.println("Informe o custo de fabrica do veiculo: ");
		custoFabrica = ler.nextDouble();
		
		valorDistribuidor = (custoFabrica + (custoFabrica* pDistribuidor));
		
		valorImposto = (custoFabrica + (custoFabrica * imposto /100));
		
		custoConsumidor = custoFabrica + valorDistribuidor + valorImposto;
		
		System.out.println("O valor final ao consumidor é de: " + custoConsumidor);
	}

}
