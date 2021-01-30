package listaPraticaWhile;

import java.util.Scanner;

public class Exercicio1WhilePratica {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */
		
		int senha = 2002; 
		
		while(true)
		{
			System.out.println("Digite sua Senha: ");
			senha = leia.nextInt();
			
			if (senha != 2002) {
				System.out.print("Senha Invalida! \n ");
			}
			else {
				System.out.print("\n Bem vindo ao Inferno S2 ");
				break;
			}
		}
		leia.close();
	}

}
