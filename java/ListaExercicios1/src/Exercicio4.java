import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double A,B,C,D,S,R;
		
		System.out.println("Informe o valor de A: ");
		A = ler.nextInt();
		
		System.out.println("\n Informe o valor de B: ");
		B = ler.nextInt();
		
		System.out.println("\n Informe o valor de C: ");
		C = ler.nextInt();
		
		R =  Math.pow(A+B,2); //OU A+B ^ 2
		S =  Math.pow(B+C,2); // OU B+C ^ 2
		
		D = ((R+S)/2);
		
		System.out.println("\n O VALOR DE R: " + R + "\n O valor de S: " + S + "\n O Valor de D: " + D);
		
		ler.close();
	}

}
