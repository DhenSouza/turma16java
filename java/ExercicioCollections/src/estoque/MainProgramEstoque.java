package estoque;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainProgramEstoque {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List <String> produtos = new ArrayList<>();
		
		// Adicionar na Lista
		
		produtos.add("Corte de Espinhos e Rosas");
		produtos.add("Corte de Nevoa e Furia");
		produtos.add("Corte de Asas e Ruinas");
		
		System.out.println("Livros em estoque: ");
		for(String checar : produtos) {
			System.out.println(checar);
		}
		linha(80);
		System.out.println("\n");
		
		// Remover um item da lista
		System.out.println("Livro Removido: Corte de Nevoa e Furia ");
		produtos.remove("Corte de Nevoa e Furia");
		
		for(String checar : produtos) {
			System.out.println(checar);
		}
		
		linha(80);
		System.out.println("\n");
		
		//atualizar a lista;
		
		System.out.println("Livro atualizado de Corte de Asas e Ruinas para A Rainha Vermelha ");
		produtos.set(1, "A rainha Vermelha");
		for(String checar : produtos) {
			System.out.println(checar);

		}
	}
	
	public static void linha(int linha) {
		for(int i=0; i<100;i++) {
			System.out.print("═");
		}
	}
}
