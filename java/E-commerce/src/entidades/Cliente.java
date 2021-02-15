package entidades;

import java.util.Scanner;

public class Cliente {
	Scanner leia = new Scanner(System.in);
	private String nome;
	private char genero;
	
	public Cliente() {
	}
	public Cliente(String nome, char genero) {
		this.nome = nome;
		this.genero = genero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero() {
		Scanner leia = new Scanner(System.in);
		char genero = leia.next().toUpperCase().charAt(0);
		while (genero != 'F' && genero != 'M' && genero != 'O') {
			System.out.print("Opção inválida. Por favor, digite F para feminino, M para masculino ou O para outros: ");
			genero = leia.next().toUpperCase().charAt(0);
	}
		this.genero = genero;
	}
	
	public String tratamentoGenero() {
		String apelido = "";
		if (genero == 'F') {
			apelido = "Sra. ";
		}
		else if (genero == 'M') {
			apelido = "Sr. ";
		}
		else {
			apelido = "Srx. ";
		}
		return apelido;
	}

}
