package aula05;

public class Disciplina {
	private String nome, cod;
	private Tipo tipo;

	public Disciplina(String nome, String cod, Tipo tipo) {
		this.nome = nome;
		this.cod = cod;
		this.tipo = tipo;

	}
	
	public void mostrar() {
		System.out.println("Materia: " + nome);
		System.out.println("Codigo: " + cod);
		System.out.println("Tipo: " + tipo);
		
	}
	
	public boolean isProfissionalizante() {
		return tipo == Tipo.PROFISSIONALIZANTE;
	}
	
	public boolean isBasica() {
		return tipo == Tipo.BASICA;
	}
	
	public boolean isLingua() {
		return tipo == Tipo.LINGUAS;
	}

	public String getnome() {
		return nome;
	}


	
}

