package Classes;

public class telaClass {
	double area, perimetro;
	double lado;
	
	
	
	void calculoArea(double lado) {
		area = Math.pow(lado, 2);
		System.out.println("A area é de: " + area + " cm quadrados");
	}
	
	void calculoPerimetro(double lado) {
		perimetro = lado * 4;
		System.out.println("O perimetro é de: " + perimetro + " cm ");
		
	}
}
