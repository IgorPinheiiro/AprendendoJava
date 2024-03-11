package aula04;

public class Foo {
	public int x; //não se utiliza atributos publicos -> utilizar private (sempre) (pode  ser visto por todo mundo)
	private int y; //só pode ser usado no mesmo package
	int z; //apenas a propria classe
	
	void fazerAlgo() {
		y = 7;
		System.out.println(y);
	}
}
