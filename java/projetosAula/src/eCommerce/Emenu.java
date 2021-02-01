package eCommerce;

import java.util.Scanner;

public class Emenu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		do
		{
			System.out.println("\t ||MENU|| \t");
			System.out.println("\n1 - Produtos ");
			System.out.println("2 - ");
			System.out.println("3 - ");
			System.out.println("4 - ");
			System.out.println("5 - ");
			System.out.printf("Selecione a opção que deseja: ");
			opcao = leia.nextInt();
			
			switch (opcao) 
			{
			case 1:
				produtos();
				break;
			case 2:
				
				break;
			case 3:
				//adicionarCarrinho();
				break;
			case 4:
				
				break;
			default:
				System.out.println("Opção invalida, tente novamente! ");
				break;
			}
			return;
		} while (true);
	
	}
	
	public static void produtos() {
		Scanner leia = new Scanner(System.in);
		String produto [] = {"LivroA","LivroB","LivroC","LivroD","LivroE", "LivroF", "LivroG", "LivroH", "LivroI", "LivroJ"};
		String nome;
		char sexo;
		int [] posicaoProduto = new int [10];
		String codProduto [] = {"101","102","103","104","105", "106", "107", "108", "109", "110"};
		double [] valorProduto = new double [10];
		int [] estoqueTotal = new int [10];
		
		

	        System.out.println("# \t CODIGO \t PRODUTO \t PREÇO \t\t QUANTIDADE");
	        for(int i=0; i<10; i++) {
	            System.out.printf("\n %d \t %s \t\t %s \t R$ %.2f \t Qtd:  %d",posicaoProduto[i], codProduto[i], valorProduto[i], estoqueTotal[i]);
	      
		System.out.println("Informe Primeiro Nome: ");
		nome = leia.next();
		
		System.out.println("Informe o Genero que se identifica: M - Mulher / H - Homem / E - outros ");
		sexo = leia.next().toUpperCase().charAt(0);
		
		while (sexo != 'M' && sexo != 'H' && sexo != 'E')
		{
			System.out.println("Incorreto, informe:  M - Mulher / H - Homem / E - outros");
			sexo = leia.next().toUpperCase().charAt(0);
		}
		if(sexo == 'M')
		{
			System.out.printf("Olá Sra %s Escolha uma opção a seguir: ", nome);
		}
		
		else if(sexo == 'H')
		{
			System.out.printf("Olá Sr %s: ", nome);
		}
		else
		{
			System.out.printf("Olá SrE %s: ", nome);
			
		}
	        }
	
	/*public static void adicionarCarrinho()
	{
		final int add = 10;
		int [] addProduto = new int [add];
		
		for(int i=0;i<add;i++)
		{
			carrinho();
		}
	}
	
	public static void carrinho() {
		int produto = 10;
	}*/

	}
	}
