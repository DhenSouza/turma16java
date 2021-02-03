package BANK16;

import java.util.Locale;
import java.util.Scanner;

public class TesteMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		char op;
		double valor;
		System.out.println("Digite numero da Conta: ");
		String numero = leia.next();
		
		System.out.println("Digite o CPF: ");
		String cpf = leia.next();
		System.out.println("Digite A data: ");
		int dia = leia.nextInt();
		while(dia <=0 || dia >31) {
			System.out.println("ata invalida, digite novamente: dia 1 a 31 ");
			dia = leia.nextInt();
		}
		
		Poupanca conta1 = new Poupanca(numero, cpf, dia);
		
		for(int i=1; i<3; i++) 
		{
			System.out.println("Digite D-Debito ou C-Credito: ");
			
			 op=leia.next().toUpperCase().charAt(0);
			 System.out.println("Digite o Valor");
			 valor = leia.nextDouble();
			 
			 if(op == 'D')
			 {
				 conta1.debitar(valor);
			 }
			 else if (op == 'C')
			 {
				 conta1.creditar(valor);
			 }
			 else
			 {
				 System.out.println("Opção invalida!");
			 }
			 System.out.println("Saldo atual: " + conta1.getSaldo());
		}
		
		System.out.println("Digite o dia de Hoje");
		dia = leia.nextInt();
		
		conta1.aniversario(dia);
		System.out.printf("Saldo Atual: %.2f", conta1.getSaldo());
		leia.close();
	}

}
