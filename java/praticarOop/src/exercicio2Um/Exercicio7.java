package exercicio2Um;

public class Exercicio7 {

	public int tabuada(int num)
	{
		
		for(int i=0; i<num; i++)
		{
			System.out.println("Tabuada do: " + num);
			System.out.println(i + " x " + num + " = ");
			System.out.println(i * num);
		}
		return num;
	}
}
