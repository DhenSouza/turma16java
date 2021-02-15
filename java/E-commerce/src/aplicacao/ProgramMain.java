package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Carrinho;
import entidades.Cliente;
import entidades.Pedido;
import entidades.Produto;


public class ProgramMain {
	public static Scanner leia = new Scanner(System.in);
	public static Cliente cliente = new Cliente();
	public static Pedido pedido = new Pedido();
	public static List<Produto> produtos = new ArrayList<>();
	public static List<Carrinho> carrinho = new ArrayList<>();

	
	public static void linha(int linha) {
		for(int i=0; i<linha; i++) {
			System.out.print("═");
		}
	}
	
	public static void renovaStock() {
		for(Produto itens: produtos) {
			if(itens.getEstoque() == 0) {
				itens.setEstoque(10);
				linha(80);
				System.out.println("Produto " + itens.getDescricao());
				System.out.println("O ESTOQUE FOI RENOVADO COM SUCESSO !");
			}
		}
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		produtos.add(new Produto(1, "God of War", 10, 250));
		produtos.add(new Produto(2, "The Last of Us Part II", 10, 300));
		produtos.add(new Produto(3, "Assassin's Creed Valhalla", 10, 175));
		produtos.add(new Produto(4, "Hades", 10, 100));
		produtos.add(new Produto(5, "Tony Hawk's Pro Skater 1+2", 10, 250));
		produtos.add(new Produto(6, "Crash Bandicoot 4: It's About Time", 10, 150));
		produtos.add(new Produto(7, "Batman Arkham Knight", 10, 80));
		produtos.add(new Produto(8, "Marvel's Spider Man: Miles Morales", 10, 250));
		produtos.add(new Produto(9, "Final Fantasy VII Remake", 10, 250));
		produtos.add(new Produto(10, "Demon's Souls", 10, 300));
		linha(80);
		System.out.println(" \n\t\t BOMBA GAMES !");
		System.out.println(" \t\t UM ESTOURO DE DIVERSÃO !!!");
		menu();
	}
	
	public static void  menu () {
		linha(80);
		System.out.print("\nPor gentileza, informe seu nome: ");
		cliente.setNome(leia.next());
		System.out.print("Agora, informe seu genero: F para feminino, M para masculino ou O para outros: ");
		cliente.setGenero();
		System.out.printf("%s %s, cadastro efetuado com sucesso.\n", cliente.tratamentoGenero(), cliente.getNome());
		linha(80);
		System.out.print("\n\t\t\t     || MENU|| \n\n");
		System.out.println("|Codigo |\t|Opções|");
		System.out.println("1\t|\tCadastro");
		System.out.println("2\t|\tComprar");
		System.out.println("3\t|\tVer Carrinho");
		System.out.println("4\t|\tVer Produtos");
		System.out.println("5\t|\tSair");
		System.out.print("\nPor favor, selecione a opção: ");
		
		int opcao = checkInt();
		
			
		switch(opcao)
		{
		case 1: 
			
			break;
		case 2: 
			
			break;
		case 3: 
			exibirCarrinho();
			break;
		case 4: 
			
			break;
		case 5: 
			System.out.println("Programa Encerrado !");
			System.exit(0);
			break;
		}
}
	public static void exibirCarrinho() {
		if(carrinho.isEmpty()) {
			System.out.println("Carrinho está Vazio !!!");
			menu();
		}
		else {
			System.out.printf("Lojas BOMBA GAMES, vamos explodir o %s com as melhores ofertas !", cliente.tratamentoGenero());
		}
		System.out.println("\nCÓDIGO \t\t PRODUTO \t\t QUANTIDADE \t\t PREÇO \t\t SUBTOTAL\n");
		for(Carrinho itemCarrinho: carrinho) {
			System.out.println(itemCarrinho.getCodigo() + "\t\t" + itemCarrinho.getDescricao() + "\t\t"
					+ itemCarrinho.getQuantidade() + "\t\t\t" + itemCarrinho.getPreco() + "\t\t"
					+ itemCarrinho.getSubtotal());
			linha(80);
		}
		System.out.print("\n\t\t\t     >> Opções do Carrinho<< \n\n");
		System.out.println("| |\t|Opções|");
		System.out.println("1\t|\tAlterar Item");
		System.out.println("2\t|\tRemover Item");
		System.out.println("3\t|\tMenu");
		System.out.println("4\t|\tFinalizar Compra");
		System.out.print("\nPor favor, selecione a opção que deseja no Carrinho: ");
		int opcao = checkInt();
		
		switch(opcao)
		{
		case 1: 
			
			break;
		case 2: 
			
			break;
		case 3: 
			menu();
			break;
		case 4: 
			
			break;
		default:
			exibirCarrinho();
			
		}
	}
	
	public static int checkInt() {
		while (!leia.hasNextInt()) {
			System.out.println("> Digite um valor valido:");
			leia.next();
		}
		int checked = leia.nextInt();
		return checked;
	}

}
