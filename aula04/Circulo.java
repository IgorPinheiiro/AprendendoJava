package aula04;

public class Circulo {
	private double raio;
	private double Perim;
	private double Area;
	static double pi = Math.PI;
	
	public Circulo(double raio, double Perim, double Area) {
		this.raio = raio;
		this.Perim = Perim;
		this.Area = Area;
	}

	public double getPerim() {
		return (2*pi)*raio;
	}

	public double getArea() {
		return pi*raio*raio;
	}
	
}

