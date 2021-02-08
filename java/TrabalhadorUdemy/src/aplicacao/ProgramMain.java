package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Departamento;
import entidades.HorasContratos;
import entidades.Trabalhador;
import entidades.Enums.LevelTrabalho;
public class ProgramMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entra como o nome do Departamento:");
		String departamento = leia.nextLine();
		
		System.out.println("Informe as informações do trabalhador.");
		System.out.println("Nome: ");
		String nome = leia.nextLine();
		System.out.println("Level  ");
		String levelTrabalho = leia.nextLine();
		System.out.println("Salario Base: ");
		double salarioBase = leia.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nome, LevelTrabalho.valueOf(levelTrabalho), salarioBase, new Departamento(departamento));
		
		System.out.println("Quantos contratos o trabalhador vai ver?");
		int n = leia.nextInt();
		
		for(int i=1; i<=n; i++)
		{ 
			System.out.println("Entre com os contratos: #" + i + "data: ");
			System.out.print("Data (DD/MM/YYYY: ");
			Date dataContrato = sdf.parse(leia.next());
			System.out.print("Valor Por Hora: ");
			double valorPorHora = leia.nextDouble();
			System.out.print("Duração (Horas): ");
			int horas = leia.nextInt();
			HorasContratos contrato = new HorasContratos(dataContrato, valorPorHora, horas);
			trabalhador.addContratos( contrato);
		}
		System.out.println();
		
		System.out.println("Entre com o mes e ano para calcular: (MM/YYYY)");
		String mesEano = leia.next();
		
		int mes = Integer.parseInt(mesEano.substring(0,2));
		int ano = Integer.parseInt(mesEano.substring(3));
		
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
		System.out.println("Efetuado em: " + mesEano + " : " + String.format("%.2f", trabalhador.calcSalario(ano, mes)));
		
		leia.close();
	}

}
