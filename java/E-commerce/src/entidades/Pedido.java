package entidades;

public class Pedido {

	private double totalGeral = 0;
	private double totalComDesconto = 0;
	private String formaPagamento;
	private double valorParcelas;
	private int quantidadeParcelas;
	private double valorImposto = 0;

	public double getTotalComDesconto() {
		return totalComDesconto;
	}
	
	public void setTotalComDesconto(double total) {
		this.totalComDesconto = total;
	}
	
	public double getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(double totalGeral) {
		this.totalGeral += totalGeral;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double getValorParcelas() {
		return valorParcelas;
	}

	public void setValorParcelas(double valorParcelas) {
		this.valorParcelas = valorParcelas;
	}
	
	public int getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(int quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}
	
	public double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(double valorImposto) {
		this.valorImposto = getTotalComDesconto() * (valorImposto / 100);
	}
	
	private void pagarAvista(){
		setTotalComDesconto(totalGeral - (totalGeral*0.1));
	}
	private void pagarCartao(int parcelas) {
		totalComDesconto = totalGeral;
		
		if (parcelas == 1 ) {
			totalComDesconto *= 1;
			setQuantidadeParcelas(parcelas);
			setValorParcelas(totalComDesconto / getQuantidadeParcelas());
		}
		if (parcelas == 2) {
			totalComDesconto += 0.1;
			setQuantidadeParcelas(parcelas);
			setValorParcelas(totalComDesconto / getQuantidadeParcelas());
		}
		if (parcelas == 3) {
			totalComDesconto += 0.15;
			setQuantidadeParcelas(parcelas);
			setValorParcelas(totalComDesconto / getQuantidadeParcelas());
		}
	}
	public boolean formaPagamento(int opcao) {
		boolean resultado = true;
		
		if(opcao == 1) {
			pagarAvista();
			setFormaPagamento("A vista 10% Desconto");
		}
		else if (opcao == 2) {
			pagarCartao(1);
			setFormaPagamento("A vista Crédito - Sem Desconto");
		}
		else if (opcao == 3){
		pagarCartao(2);
		setFormaPagamento("2X no Crédito - Acrécimo de 10%");
		}
		else if(opcao == 4) {
			pagarCartao(3);
			setFormaPagamento("3x no Crédito - Acrécimo de 15%");
		}
		else {
			resultado = false;
		}
		return resultado;
	}
}
