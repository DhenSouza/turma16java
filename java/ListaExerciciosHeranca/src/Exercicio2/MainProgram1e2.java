package Exercicio2;

import Exercicio3.Empregado;
import Exercicio4.Administrador;
import Exercicio5.Operario;
import Exercicio6.Vendedor;

public class MainProgram1e2 {

	public static void main(String[] args) {

		Fornecedor magazine = new Fornecedor("Magazine", "Sapopemba", "1140028922", 10000, 5000);
		
		System.out.println("\tNome: " + magazine.getNome());
		System.out.println("\tEndereço: " + magazine.getEndereco());
		System.out.println("\ttelefone: " + magazine.getTelefone());
		
		magazine.setValorCredito(10000);
		System.out.println("\tO Valor do seu credito atual: "+ magazine.getValorCredito());
		System.out.println("\tValor de sua Divida atual: " + magazine.getValorDivida());
		
		magazine.obterSaldo();
		
		System.out.println("\tA diferença da Divida depois de pegar: " + magazine.obterSaldo());
		linha(80);
		
		Empregado judas = new Empregado ("Judas", "Sao Mateus", "11 946521365", 1533);
		System.out.println("\n\tNome: " + judas.getNome());
		System.out.println("\tEndereço: " + judas.getEndereco());
		System.out.println("\ttelefone: " + judas.getTelefone());
		System.out.println("\tSalario: " + judas.getSalarioBase());
		judas.vencimentoSalario();
		
		System.out.println("\tSalario calculado:"+ judas.vencimentoSalario());
		linha(80);
		
		Operario lucas = new Operario("Lucas", "Av . São Joao", "11 98563641");
		System.out.println("\n\tNome: " + lucas.getNome());
		System.out.println("\tEndereço: " + lucas.getEndereco());
		System.out.println("\ttelefone: " + lucas.getTelefone());
		System.out.println("\tSalario: " + lucas.getSalarioBase());
		System.out.println("\t O valor de produção é de:: " + lucas.getValorProducao());
		lucas.calculoComissao();
		System.out.println("\t O valor da Comissão depois do calculo: " + lucas.getComissao());
		
		linha(80);
		Administrador ozob = new Administrador("Ozob", "AV sei la" , "11 954236524", 20000);
		System.out.println("\n\tNome: " + ozob.getNome());
		System.out.println("\tEndereço: " + ozob.getEndereco());
		System.out.println("\ttelefone: " + ozob.getTelefone());
		System.out.println("\tValor disponivel ao administrador: " + ozob.getAjudaDeCustos());
		ozob.ajuda();
		linha(80);
		Vendedor gilmar = new Vendedor("Gilmar", "Av tururu", "11 54654586");
		System.out.println("\n\tNome: " + gilmar.getNome());
		System.out.println("\tEndereço: " + gilmar.getEndereco());
		System.out.println("\ttelefone: " + gilmar.getTelefone());
		
		System.out.println("\t Valor calulado da comissão: " + gilmar.calculoComissao());
		
		
	}
	public static void linha(int Linha) {
		for(int linha = 0; linha <Linha; linha++) {
			System.out.print("═");
		}
	}
}
