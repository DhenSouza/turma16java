package exercicio1;

public class Cliente {

	private String nome;
	private String cpf;
	private String endereco;
	
	public Cliente (String nomeCliente, String cpfCliente, String enderecoCliente)
	{
		nome = nomeCliente;
		cpf = cpfCliente;
		endereco = enderecoCliente;
		
	}
	
	public String mostraTela() 
	{
		String mostraTela = nome + " " + cpf + " " + endereco;
		return mostraTela;
	}
}
