package collection;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main(String[] args) {
		Set<Aluno> conjunto = new HashSet<Aluno>();
		
		Aluno a = new Aluno("Betano Log", "Java", 6.8);
		Aluno b = new Aluno("Nick Pouco", "Linux", 7.8);
		Aluno c = new Aluno("Luizania cirug", "SI", 8);
		Aluno d = new Aluno("Vigario Paulista", "HTML", 5.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}
}
