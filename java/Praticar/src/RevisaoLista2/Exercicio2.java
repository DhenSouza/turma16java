package RevisaoLista2;

import java.util.Scanner;

public class  Exercicio2 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	final double excedenteHora = 20;
	double codigo = 0,numero,calculoSalario,excesso;
	
	System.out.println("informe a Funcional do funcionario: ");
	codigo = leia.nextDouble(); 
	System.out.println("informe as Horas Trabalhadas: ");
	numero = leia.nextDouble(); 
	
	System.out.println("Codigo funcionario: %f " + codigo);
	
	calculoSalario = numero * 10;
	if(numero > 50)
	{
		excesso = ((numero - 50) * excedenteHora);
		System.out.printf("O seu Salario é de: R$ %.2f ", calculoSalario);
		System.out.printf( "\n Voce ganhou de extra: %.2f", excesso);
	}
	else if(numero <= 50)
	{
		excesso = 0;
		System.out.println("Esta Zerado de Horas ! " + excesso);
		
	}
	
	
	leia.close();
}

}
