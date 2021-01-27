import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Double n1,n2,n3, media = 0.0; 
		
		System.out.println("\n Informe a nota do Primeiro Aluno: ");
		n1 = ler.nextDouble();
		
		System.out.println("\n Informe a nota do Segundo Aluno: ");
		n2 = ler.nextDouble();
		
		System.out.println("\n Informe a nota do Terceiro Aluno: ");
		n3 = ler.nextDouble();
		
		media = ((n1 * 2)+ (n2 * 3) + (n3 * 5) /3);
		
		System.out.println("\n A media do aluno é de: " + media);
		
		ler.close();
	}

}
