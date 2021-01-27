import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double segundos, minutos, horas;
		
		System.out.println("informe os Segundos");
		segundos = ler.nextDouble();
		
		horas = (segundos/3600);
		minutos = ((segundos % 3600) / 60);
		segundos = ((segundos%3600)%60);
		
		System.out.println(horas+" Horas\n");
		System.out.println(minutos+" Minutos\n");
		System.out.println(segundos+" Segundos \n");
	}

}
