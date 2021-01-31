package proBank;

import java.util.Scanner;

public class ProjetoBank {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double valorMovimento;
		int tipo;
		char movimento;
		boolean sair = false;
		double retorno[] = new double[2];
		String conta = ""; 

		while (!sair) {
			double extratoValor[] = new double[11];
			String descricao[] = new String[11];
			double saldo = 0.0;
			char continua = 'S';
			int contador = 0;
			System.out.printf("\nBanco G6-Nation\n");
			System.out.println("Trabalhando por voc�!");

			System.out.println("1 - CONTA POUPAN�A");
			System.out.println("2 - CONTA CORRENTE");
			System.out.println("3 - CONTA ESPECIAL");
			System.out.println("4 - CONTA EMPRESA");
			System.out.println("5 - SAIR");
			System.out.printf("Selecione o tipo de conta: ");
			tipo = ler.nextInt();
			while (tipo > 5 || tipo < 1) {
				System.out.println("Digite uma op��o v�lida: ");
				tipo = ler.nextInt();
			}
			conta = definir(tipo);

			while ((continua == 'S') && contador < 10 && tipo != 5) {
				System.out.printf("CONTA %s\n\n", conta);
				System.out.print("Selecione o movimento - D/C: ");
				movimento = ler.next().toUpperCase().charAt(0);
				while (movimento != 'C' && movimento != 'D') {
					System.out.print("Selecione uma op��o v�lida [D/C]: ");
					movimento = ler.next().toUpperCase().charAt(0);
				}
				if (saldo == 0) {
					while (movimento == 'D') {
						System.out.print("Voc� n�o possui saldo, selecione Credito: ");
						movimento = ler.next().toUpperCase().charAt(0);
					}
				}
				System.out.print("Valor: R$");
				valorMovimento = ler.nextDouble();
				if (movimento == 'D') {
					while (saldo - valorMovimento < 0) {
						System.out.println("Valor indisponivel, digite um valor disponivel: R$");
						valorMovimento = ler.nextDouble();
					}
					saldo -= valorMovimento;
				} else {
					saldo += valorMovimento;
				}
				extratoValor[contador] = valorMovimento;
				System.out.print("Descri��o: ");
				if(movimento == 'D') {
					descricao[contador] = ler.next() + " --- D�bito";					
				}else {
					descricao[contador] = ler.next() + " --- Cr�dito";		
				}
				System.out.printf("Saldo atual: R$%.2f", saldo);
				System.out.print("\nContinua? S/N: ");
				continua = ler.next().toUpperCase().charAt(0);
				contador++;
			}

			switch (tipo) {
			case 1:
				retorno = poupanca(saldo);// KEVIN
				if(retorno[1] == 1) {
					extratoValor[10] = retorno[0] - saldo;
					descricao[10] = "Rendimento --- Cr�dito";
				}
				break;
			case 2:
				corrente(saldo); // DENILSON
				break;
			case 3:
				retorno = especial(saldo); // DEBORA
				if(retorno[1] == 1) {
					extratoValor[10] = retorno[0] - saldo;
					descricao[10] = "Limite especial --- Cr�dito";
				}
				break;
			case 4:
				retorno = empresa(saldo); // FERNANDO
				if(retorno[1] == 1) {
					extratoValor[10] = retorno[0] - saldo;
					descricao[10] = "Empr�stimo --- Cr�dito";
				}
				break;
			case 5:
				sair = true;
				break;
			}
			
			System.out.println("\n-------EXTRATO-------\n\n");
			for(int i = 0;i < 11; i++) {
				if(descricao[i] != null) {
					System.out.printf(descricao[i] + "\n");
					System.out.printf("Valor do movimento: R$%.2f", extratoValor[i]);
					System.out.println();
				}
			}
		}
	}

	public static double[] poupanca(double saldoAtual) {
		char continua;
		int cont = 0;
		Scanner ler = new Scanner(System.in);

		saldoAtual = saldoAtual + saldoAtual * 0.0005;

		System.out.println("Deseja ver a corre��o monet�rio S/N?");
		continua = ler.next().toUpperCase().charAt(0);

		if (continua == 'S') {
			System.out.printf("Seu saldo � de R$%.2f", saldoAtual);
			cont++;
		}
		double retorno[] = {saldoAtual, cont};
		return retorno;
	}

	public static void corrente(double saldoAtual) {
		Scanner leia = new Scanner(System.in);
		int contador = 1;
		char opcao = 'S';

		System.out.print("Deseja emitir o Tal�o? S/N: ");
		opcao = leia.next().toUpperCase().charAt(0);
		while (contador <= 3 && opcao == 'S') {
			System.out.printf("----TAL�O DE CHEQUE----\n");
			System.out.printf("Valor:___________________\t\t\n");

			System.out.printf("Voc� pode emitir mais %d tal�es", (3 - contador));
			if (contador == 3) {
				System.out.println("\nAcabaram seus cheques");
			} else {
				System.out.println("\nGostaria de emitir mais um? [S/N]: ");
				opcao = leia.next().toUpperCase().charAt(0);
				contador++;
			}
			System.out.println("Obrigado.");
		}
	}

	public static double[] especial(double saldoAtual) {
		Scanner ler = new Scanner(System.in);
		char limiteEspecial;
		int cont = 0;
		double valorLimite, limite = 1000.0;
		System.out.println("Deseja utilizar o limite especial? S/N: ");
		limiteEspecial = ler.next().toUpperCase().charAt(0);
		if (limiteEspecial == 'S') {
			System.out.printf("Qual o valor? (limite atual: %.2f): R$", limite);
			valorLimite = ler.nextDouble();
			while (valorLimite > limite || valorLimite < 0) {
				if (valorLimite < 0) {
					System.out.print("Digite um valor v�lido: R$");
					valorLimite = ler.nextDouble();
				} else {
					System.out.printf("Digite um valor dentro de seu limite(R$%.2f)", limite);
					valorLimite = ler.nextDouble();
				}

			}
			saldoAtual += valorLimite;
			System.out.printf("\nSaldo: R$%.2f", saldoAtual);
			System.out.println();
			cont++;
		}
		double retorno[] = {saldoAtual, cont};
		return retorno;

	}

	public static double[] empresa(double saldoAtual) {
		Scanner ler = new Scanner(System.in);
		char emprestimo;
		int cont = 0;
		double valorEmprestimo, limite = 10000.0;
		System.out.println("Deseja fazer um emprestimo? S/N: ");
		emprestimo = ler.next().toUpperCase().charAt(0);
		if (emprestimo == 'S') {
			System.out.printf("Qual o valor? (limite atual: %.2f): R$", limite);
			valorEmprestimo = ler.nextDouble();
			while (valorEmprestimo > limite || valorEmprestimo < 0) {
				if (valorEmprestimo < 0) {
					System.out.print("Digite um valor v�lido: R$");
					valorEmprestimo = ler.nextDouble();
				} else {
					System.out.printf("Digite um valor dentro de seu limite(R$%.2f)", limite);
					valorEmprestimo = ler.nextDouble();
				}
			}
			saldoAtual += valorEmprestimo;
			System.out.printf("\nSaldo: R$%.2f", saldoAtual);
			System.out.println();
			cont++;

		}
		double retorno[] = {saldoAtual, cont};
		return retorno;

	}

	public static String definir(int tipo) {
		String tipoConta = "";
		switch (tipo) {
		case 1:
			tipoConta = "POUPAN�A";
			break;
		case 2:
			tipoConta = "CORRENTE";
			break;
		case 3:
			tipoConta = "ESPECIAL";
			break;
		case 4:
			tipoConta = "EMPRESA";
			break;
		default:
			// sair
			break;
		}
		return tipoConta;
	}
	}


