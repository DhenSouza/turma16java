package mainTesteExercicios;

import exercicio2Um.Exercicio3;
import exercicio2Um.Exercicio4;
import exercicio2Um.Exercicio5;
import exercicio2Um.Exercicio6;
import exercicio2Um.Exercicio7;
import exercicio2Um.Exercicio8;
import exercicio2Um.Exercicio9;

public class MainTesteImparPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercicio3 par = new Exercicio3();
		Exercicio4 quatro = new Exercicio4();
		Exercicio5 cinco = new Exercicio5();
		Exercicio6 six = new Exercicio6();
		Exercicio7 seven = new Exercicio7();
		Exercicio8 eight = new Exercicio8();
		Exercicio9 nine = new Exercicio9();
		
		
		
		par.inteiro(5);
		System.out.println(quatro.numero(3));
		System.out.println(cinco.soma(3, 2, 10));
		six.fatorial(5);
		seven.tabuada(5);
		
		System.out.println(eight.soma(10, 10));
		System.out.println(eight.subtracao(100, 50));
		System.out.println(eight.multiplicacao(10, 100));
		System.out.println(eight.divisao(50, 5));
		
		nine.vetor(6);
		
		System.out.println();
		
		
		
	}

}
