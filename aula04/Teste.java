package aula04;

public class Teste {

	public static void main(String[] args) {
		Foo f = new Foo();
		f.x = 8;
		System.out.println(f.x);
		//f.z = 7;
		//System.out.println(f.z); z não é acessivel dentro da classe Teste -> pois é default e não visivel fora da classe Foo

	}

}
