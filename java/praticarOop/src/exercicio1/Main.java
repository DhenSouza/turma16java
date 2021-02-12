package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Carro chevet = new Carro();
		
		chevet.setModelo("Chevet");
		chevet.setAno(2021);
		chevet.setVelocidadeAtual(0);
		chevet.setVelocidadeMaxima(350);
		
		
		chevet.liga();
		chevet.acelera(320);
		
		System.out.println(chevet.getVelocidadeMaxima());
		chevet.mudarMarcha();
		leia.close();
	}

}
