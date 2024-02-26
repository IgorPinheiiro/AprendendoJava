package Classes;

public class MassaCorporal {
	double altura;
	double peso;
	double IMC;
	
	
	
	public void calculoCorpo() {
		IMC = (peso/Math.pow(altura, 2));
		System.out.println("O imc e: " + IMC);
		
		
	}
	
	void MostraResultado() {
		if (IMC >= 25){
			System.out.println("Acima do peso");
		}
		else if (IMC >= 18 && IMC < 25) {
			System.out.println("No peso ideal");
		}
		else if (IMC < 18) {
			System.out.println("Abaixo do peso");
		}
	}
	

}
