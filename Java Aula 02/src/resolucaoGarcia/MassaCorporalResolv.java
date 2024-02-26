package resolucaoGarcia;

public class MassaCorporalResolv {

	double peso, altura;
	String nome;
	
	void calcularIMC() {
		double imc = peso / (altura * altura);
		if (imc >= 25) {
			System.out.println(nome + "acima do peso" );
		}
		if (imc >= 18 && imc < 25) {
			System.out.println(nome + "no peso ideal");
		}
		if (imc < 18) {
			System.out.println(nome + "Abaixo do peso");
		}
	}
}
