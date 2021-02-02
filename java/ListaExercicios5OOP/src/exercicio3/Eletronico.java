package exercicio3;

import java.util.Scanner;

public class Eletronico {
	
	public String nome;
	public String modelo;
	public int codProduto;



public void  produto()
{
	Scanner leia = new Scanner (System.in);
	System.out.println("Informe o nome do produto: ");
	nome = leia.next();
	
	System.out.println("Informe o modelo do produto: ");
	modelo = leia.next();
	
	System.out.println("Informe o codigo do produto: ");
	codProduto = leia.nextInt();
	
	leia.close();
}

public void mostrarTela ()
{
System.out.println("\n Nome Produto: " + nome + " "+ "Modelo: "+  modelo +  " "+ "Codigo: " + codProduto);
}

}