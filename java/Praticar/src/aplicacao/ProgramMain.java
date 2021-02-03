package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class ProgramMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Produtos prod = new Produtos();
		
		
		System.out.println("Entre com data do produto:");
		
		System.out.println("Nome:");
		prod.nome = leia.next();
		
		System.out.println("Preço: ");
		prod.preco = leia.nextDouble();
		
		System.out.println("Quantidade no Estoque: ");
		prod.quantidade = leia.nextInt();
		
		System.out.println(prod);
		
		leia.close();
	}

}
