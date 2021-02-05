package collection;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[] args) {
		Map<String, Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno a = new Aluno("Betano Log", "Java", 6.8);
		Aluno b = new Aluno("Nick Pouco", "Linux", 7.8);
		Aluno c = new Aluno("Luizania cirug", "SI", 8);
		Aluno d = new Aluno("Vigario Paulista", "HTML", 5.5);
		
		mapa.put("Betano Log",a);
		mapa.put("Nick Pouco",b);
		mapa.put("Luizania cirug",c);
		mapa.put("Vigario Paulista",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Vigario Paulista"));
		
		Collection<Aluno> alunos = mapa.values();
		
		for(Aluno e : alunos)
		{
			System.out.println(e);
		}
	}
}
