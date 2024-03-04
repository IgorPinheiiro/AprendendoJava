package aula03;

public class cachorro {
	String nome, raca;
	
	
	
	public cachorro(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}

	void latir() {
		System.out.println(nome + ": auau" );
	}
	
	void mostrarRaca() {
		System.out.println(raca);
	}
}
