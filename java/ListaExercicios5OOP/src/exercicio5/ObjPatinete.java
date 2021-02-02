package exercicio5;


public class ObjPatinete {

	public static void main(String[] args) {
		Patinete patinete = new Patinete();
		
		patinete.cor = "Vermelho";
		patinete.modelo = "Bandeirantes";
		
		patinete.velocidadeAtual = 0;
		patinete.velocidadeMaxima = 80;
		
		patinete.mostrarTela();
		
		System.out.println("Velocidade do patinete: ");
		patinete.acelera(30);
		
		System.out.println(patinete.velocidadeAtual);

	}

}
