package aula03;

public class calculadora {
	double valor1, valor2, valorFinal;
	
	calculadora(double valor1, double valor2){
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public void calcSoma(){
		valorFinal = valor1 + valor2;
		System.out.println("O valor é: " + valorFinal);
	}
	
	public void calcSub() {
		valorFinal = valor1 - valor2;
		System.out.println("O valor é: " + valorFinal);
	}
	
	public void calcMulti() {
		valorFinal = valor1 * valor2;
		System.out.println("O valor é: " + valorFinal);
		
	}
	
	public void calcDiv(){
		if(valor1 != 2) {
		valorFinal = valor1 / valor2;
		System.out.println("O valor é: " + valorFinal);
		} else {
			System.out.println("Erro, impossivel divir o valor por 0");
		}
		
	}
}
