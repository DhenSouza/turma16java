package eCommerce;

import java.util.Scanner;

public class PartOswaldo {

	public static void main (String[] args) {
		char opcaoPagamento; 
		double valorTotal = 0.00, juros = 0.00;
		double valorProduto[] = {10.90 , 11.90, 12.90 , 13.50};
		int estoque[] = {10 , 10 , 10 , 10};
		int unidades = 0 , compra = 0;
		final int nItens = 0;
		int carrinho = 0;
		
		{
			Scanner leia = new Scanner(System.in);
			
			 System.out.println ( "========Livraria ============== \n");
					
				//	"VALOR DO IMPOSTO (9%): "(valorTotal*0.09), 2)"\n\n");
		System.out.print(carrinho,valorTotal,valorProduto,"\n");
			for(int i=0;i<nItens;i++){
				se (carrinho[i] != 0){
				System.out.println(carrinho[i],"\t\t",(precoA[i]*carrinho[i]),"\t",produtoA[i],"\n");
				}
			}

			System.out.println("\nTOTAL GERAL: ",valorTotal);
					System.out.println("\nOPÇÃO DE PAGAMENTO: ",opcaoPagamento);
					System.out.println("\nTOTAL A SER PAGO:",valorTotal,"\n");
					System.out.println("\nVolte sempre!");
			
		}
	
			
		}
}


