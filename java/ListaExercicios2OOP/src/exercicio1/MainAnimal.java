package exercicio1;

import java.util.Scanner;

public class MainAnimal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String [] animal = new String [] {"Cachorro", "Cavalo", "Preguica"};
		int [] contador = new int [3];
		String [] racas = new String [3];
		
		for(int i=0; i<3; i++)
		{
		System.out.println(animal[i]);
		System.out.println("Informe quantos anos o animal tem: ");
		 contador [i]= leia.nextInt();
		leia.nextLine();
		
		System.out.println("O animal tem raca? S/N");
		char pergunta = leia.next().toUpperCase().charAt(0);
		
		if(pergunta == 'S') {
			System.out.println("Informe a Raça do animal se ele obtiver tal classificatoria: ");
			 racas[i] = leia.next();
			 
			 Cachorro cachorro = new Cachorro (animal[i], contador[i], racas[i]);
			 System.out.println("Nome:" + cachorro.getNome() + " Idade: " + cachorro.getIdade()+ " Raca: " + racas[i]);
			 linha(1);
				System.out.println("Nome:" + cachorro.getNome());
				System.out.println(cachorro.emitirSom());
				System.out.println(cachorro.movimentar());
			 Cavalo cavalo = new Cavalo (animal[i], contador[i], racas[i]);
			 System.out.println("Nome:" + cavalo.getNome() + " Idade: " + cavalo.getIdade() + " Raca: " + racas[i]);
			 System.out.println(cavalo.emitirSom());
				System.out.println(cavalo.movimentar());
			
		}
		else if (pergunta == 'N')
		{
			 Preguica preguica = new Preguica (animal[i], contador[i]);
			 System.out.println("Nome:" + preguica.getNome() + " Idade: " + preguica.getIdade());
			 System.out.println(preguica.emitirSom());
			System.out.println(preguica.movimentar());
		}
		}
		
	/*Cachorro cachorro = new Cachorro ("cachorro", 5, "Bulldog");
	
	Cavalo cavalo = new Cavalo ("Cavalo", 10, "Mustang");
	
	Preguica preguica = new Preguica ("Preguiça", 3, "Abtrata");
	
	
	System.out.println("Nome:" + cachorro.getNome() + " Idade: " + cachorro.getIdade() + " Raca: " + cachorro.getRaca());
	System.out.println("Nome:" + cavalo.getNome() + " Idade: " + cavalo.getIdade() + " Raca: " + cavalo.getRaca());
	System.out.println("Nome:" + preguica.getNome() + " Idade: " + preguica.getIdade() + " Raca: " + preguica.getRaca());
	System.out.println("\n");
	
	System.out.println("Nome:" + cachorro.getNome());
	System.out.println(cachorro.emitirSom());
	System.out.println(cachorro.movimentar());
	cachorro.movimentar();
	System.out.println("\n");
	
	System.out.println("Nome:" + cavalo.getNome());
	System.out.println(cavalo.emitirSom());
	System.out.println(cavalo.movimentar());
	System.out.println("\n");
	
	System.out.println("Nome:" + preguica.getNome());
	System.out.println(preguica.emitirSom());
	System.out.println(preguica.movimentar());
	
	*/
	}
	
	public static void linha(int linha) {
		for(int i=0; i<10;i++) {
			System.out.println("═");
		}
	}

}
