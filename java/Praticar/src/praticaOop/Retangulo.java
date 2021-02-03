package praticaOop;

public class Retangulo {

	public double base;
	public double altura;
	
	public double Area()
	{
		double area = 0.00;
		
		area = base * altura;
		return area;
	}
	
	public double perimetro()
	{
		Double perimetro = (2 * (base + altura));
		return perimetro;
	}
	
	public double diagonal()
	{
		Double diagonal = Math.sqrt((Math.pow(this.base, 2)+Math.pow(this.altura, 2)));
		return diagonal;
	}
	
	
}
