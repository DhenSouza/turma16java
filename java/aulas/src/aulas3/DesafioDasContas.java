package aulas3;

import java.util.Scanner;

public class DesafioDasContas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int contador = 1;
		char opcao = 's';
		
		System.out.print("Deseja emitir o Tal�o? S/N: ");
		opcao = leia.next().charAt(0);
		while(contador <= 3 && (opcao == 'S' || opcao == 's')){
			System.out.printf("----TAL�O DE CHEQUE----\n");
			System.out.printf("Valor:___________________\t\t\n");
			
			System.out.printf("Voc� pode emitir mais %d tal�es", (3 - contador));
			if(contador == 3) {
				System.out.println("\nAcabaram seus cheques");
			}else {
				System.out.println("\nGostaria de emitir mais um?: ");
				opcao = leia.next().charAt(0);
				contador++;		
			}
			System.out.println("Obrigado.");
			
		leia.close();
		}
	}
}


