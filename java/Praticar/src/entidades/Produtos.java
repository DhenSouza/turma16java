package entidades;

public class Produtos {

	public String nome;
	public double preco;
	public int quantidade;
	
	
	public double totalValorEstoque() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+ ", $ "
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidades, Total: $ "
				+ String.format("%.2f", totalValorEstoque());
	}
}
