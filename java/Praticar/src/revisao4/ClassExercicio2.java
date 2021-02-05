package revisao4;

import java.util.Scanner;

public class ClassExercicio2 {

	private double altura;
	private double massa;
	private double imc;
	
	
	public void usuario() {
		Scanner leia  = new Scanner(System.in);
		System.out.println("Informe sua altura");
		altura = leia.nextDouble();
		
		System.out.println("Informe sua massa");
		massa = leia.nextDouble();
	}
	public double imc() {
		imc = massa / Math.pow(altura, 2);
		return imc;
	}

	public double getImc() {
		return imc;
	}
	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getMassa() {
		return massa;
	}


	public void setMassa(double massa) {
		this.massa = massa;
	}
	
	
}
