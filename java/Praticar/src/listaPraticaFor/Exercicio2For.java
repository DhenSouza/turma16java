package listaPraticaFor;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */
		
		int N = 0;
		int  cont_out = 0;
		int cont_in = 0;
		System.out.println("Informe o numero da Contagem: 1 a 10");
		N = leia.nextInt();
		 for (int i = 0; i < N; i++) {
             if (i >= 10 && i <= 20) {
                 cont_in = cont_in + 1;
             }
             else {
                 cont_out = cont_out + 1;
             }
		 }
		 
		 System.out.println("Os numeros no intervalo de 10 a 20 são: " + cont_in);
		 System.out.println("Os numeros fora do intervalo de 10 a 20 são: " + cont_out);
		leia.close();
	}

}
