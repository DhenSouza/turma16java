package eCommerce;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Emenu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		String produto [] = {"LivroA","LivroB","LivroC","LivroD","LivroE", "LivroF", "LivroG", "LivroH", "LivroI", "LivroJ"};
		String codProduto [] = {"101","102","103","104","105", "106", "107", "108", "109", "110"};
		String nome;
		char sexo;
		int [] posicaoProduto = new int [10];

		do
		{
			
			System.out.println("Informe seus dados para dar continuidade.");
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
			System.out.println("\t \n||MENU|| \t");
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
				Produtos();
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
	
	public static void Produtos()
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		char sexoUsuario;
		String nomeUsuario;
		int opcaoNavegacao, opcaoProdutoCarrinho = 0;
		double totalParcial = 0.0;
		
		pulaLinha();
		System.out.println("\t\t\t BOOKPLUS Ltda.");
		pulaLinha();
		
	
				// POSICAO
				int posicaoProduto[] = new int[10];
						
				for (int i=0; i<posicaoProduto.length; i++){
						posicaoProduto[i] = (1+i);
					}
		
				// CODIGO
				String codProduto[] = new String[10];
						
				for (int i=0; i<codProduto.length; i++){
						codProduto[i] = ("l0"+(i+1));
					}
						
				// DESCRICAO
				String descricaoProduto[] = {"LivroA", "LivroB", "LivroC", "LivroD", "LivroE", "LivroF",
				"LivroG", "LivroH", "LivroI", "LivroJ"};	
				
				// ESTOQUE TOTAL
				int estoqueTotal[] = new int [10]; 
				
				for(int i=0; i < estoqueTotal.length; i++) {
					estoqueTotal[i] = 10;
				}
				
				// VALOR PRODUTO
				double valorProduto[] = new double[10];
				double aux=10.00;
				
				for(int i=0; i <valorProduto.length; i++) {
					valorProduto[i] = aux;
					aux++;
				}
				
				mostraProdutos(posicaoProduto, codProduto, descricaoProduto, estoqueTotal, valorProduto);
				
				System.out.println("\n");
				pulaLinha();
				System.out.println("\n1 - ADICIONAR PRODUTOS AO CARRINHO"
						+ "\n2 - EXIBIR CARRINHO"
						+ "\n3 - FINALIZAR COMPRA"
						+ "\n4 - ENCERRAR SESSÃO");
				System.out.println("\nInforme a opção que deseja: ");
				opcaoNavegacao = leitor.nextInt();
				
				switch(opcaoNavegacao)
				{
					case 1:
						
						System.out.println("\n\nSelecione o número do produto que deseja adicionar ao carrinho: ");
						opcaoProdutoCarrinho = leitor.nextInt();
						totalParcial = carrinhoCompra(opcaoProdutoCarrinho);
						System.out.println("\nO total parcial é de R$ " + totalParcial);
						break;
					case 2:
						// mostrar carrinho
						break;
					case 3:
						// mostrar carrinho
						break;
					case 4:
						// mostrar carrinho
						break;
				}
		
				System.out.println("\n\nSelecione o produto que deseja adicionar ao carrinho: ");
		
	}
	
	// --------------------------------------------------------------------------
	
	public static void mostraProdutos(int posicaoProduto[], String codProduto[], String descricaoProduto[], 
			int estoqueTotal[], double valorProduto[]) {
		
		System.out.println("# \t CODIGO \t PRODUTO \t PREÇO \t\t QUANTIDADE");
		for(int i=0; i<10; i++) {
			System.out.printf("\n %d \t %s \t\t %s \t R$ %.2f \t Qtd:  %d",posicaoProduto[i], codProduto[i],
					descricaoProduto[i], valorProduto[i], estoqueTotal[i]);
		}
		
	}
	
	// --------------------------------------------------------------------------
	
	public static void pulaLinha()
	{
		for (int i = 0; i < 80; i++)
		{
			System.out.print("=");
		}
		System.out.println();
	}
	
	// --------------------------------------------------------------------------
	
	static double carrinhoCompra(int num)
	{
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		// POSICAO
		int posicaoProduto[] = new int[10];
				
		for (int i=0; i<posicaoProduto.length; i++){
				posicaoProduto[i] = (1+i);
			}

		// CODIGO
		String codProduto[] = new String[10];
				
		for (int i=0; i<codProduto.length; i++){
				codProduto[i] = ("l0"+(i+1));
			}
				
		// DESCRICAO
		String descricaoProduto[] = {"LivroA", "LivroB", "LivroC", "LivroD", "LivroE", "LivroF",
		"LivroG", "LivroH", "LivroI", "LivroJ"};	
		
		// ESTOQUE TOTAL
		int estoqueTotal[] = new int [10]; 
		
		for(int i=0; i < estoqueTotal.length; i++) {
			estoqueTotal[i] = 10;
		}
		
		// VALOR PRODUTO
		double valorProduto[] = new double[10];
		double aux=10.00;
		
		for(int i=0; i <valorProduto.length; i++) {
			valorProduto[i] = aux;
			aux++;
		}
		
		double[] carrinhoCompra = new double[10];
		
		double quantidadeProduto;
		
		System.out.print("\nAgora informe a quantidade que deseja adicionar: ");
		quantidadeProduto = leitor.nextDouble();
		carrinhoCompra[num] = quantidadeProduto * valorProduto[num];
		
		return carrinhoCompra[num];
	}
	
	}
	
