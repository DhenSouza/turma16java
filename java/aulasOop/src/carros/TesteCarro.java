package carros;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Carro meuCarro = new Carro();
		
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Del Rey";
		
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();
		meuCarro.acelera(30);
		
		System.out.println(meuCarro.velocidadeAtual);
		
		meuCarro.pegaMarcha();
	}

}
