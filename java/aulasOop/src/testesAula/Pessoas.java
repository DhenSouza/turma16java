package testesAula;

public class Pessoas {

		//ATRIBUTOS
		public String nome;
		public char sexo;
		public int anoNascimento;
		public boolean estaViva;
		
		//CONSTRUTORES - pedreiros da classe
		
		public Pessoas(String nome ,boolean estaViva) {
			this.nome = nome;
			this.estaViva = estaViva;
		}
			
		public Pessoas(String nome) 
		{
			this.nome = nome;
		}

}
