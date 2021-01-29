package aulas4;

import java.util.Scanner;

public class ProjetoAgenda {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String[][] agenda = new String[24][31];
		String evento = "";
		char continua;
		int data, hora;
		
		while(true)
		{
			do
			{
				System.out.println("Informe a Data que deseja: 1 a 31 ");
				data = leia.nextInt();
				
				while(data <= 0 || data > 31)
				{
					System.out.println("Data invalida digite novamente! Informe a Data que deseja: 1 a 31 ");
					data = leia.nextInt();
				}
				
				System.out.println("Informe a hora do Evento:  0 - 23H ");
				hora = leia.nextInt();
				
				while(hora < 0 || hora > 23)
				{
					System.out.println("Data Invalida ! Informe a hora do Evento:  0 - 23H ");
					hora = leia.nextInt();
				}
				leia.nextLine();
				System.out.println("Descrição Evento:  ");
				agenda[hora][data-1] = leia.nextLine();
				
				System.out.println("Deseja continuar S/N? ");
				continua = leia.next().toUpperCase().charAt(0);
			}while(continua == 'S');
			
			System.out.println("Deseja Visualizar os eventos? : S/N");
			continua = leia.next().toUpperCase().charAt(0);
			
			if(continua == 'S')
			{
				System.out.println("Seus eventos são: ");
				for(int linha=0; linha<24;linha++)
				{
					for(int coluna=0; coluna<31;coluna++)
					{
						if(agenda[linha][coluna] != null)
						{
							System.out.printf("Dia %d  - Hora %d - Tarefa: %s \n ", linha, coluna, agenda[linha][coluna]);
						}
					}
				}
			}
			System.out.println("\n Deseja continuar S/N? ");
			continua = leia.next().toUpperCase().charAt(0);
			if(continua == 'N')
			{
				break;
			}
		}
	}

}
