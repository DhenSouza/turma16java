package exemploHeranca1;

import exemploHeranca.Pessoa;

public class MainPessoaHeranca {

	public static void main(String[] args) {

		Pessoa denilson = new Pessoa ("Denilson", 555);
		Funcionario pedro = new Funcionario("Pedro", 222, "T.I");
		Pessoa jubileu = new Funcionario("jubileu", 333, "R.H");
		Pessoa jeremias = new Cordenador("jeremias", 1010, "OOP");
		
		System.out.println(denilson.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(jubileu.getMatricula());
		System.out.println(jeremias.getNome());
	}

}
