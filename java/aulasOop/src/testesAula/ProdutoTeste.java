package testesAula;

import java.util.Locale;

public class ProdutoTeste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Produto produto1 = new Produto("1205", "Fones de Ouvidos");
		Produto produto2 = new Produto("Mega fione");
		Produto produto3 = new Produto("15454", 3540.45, "JBL");
		
		System.out.println("Nome: \t\t codigo:  valor: ");
		System.out.println(produto1.descricao + " " + produto1.codigo + "\t" + produto1.valorUnitario);
		
		
	}

}
