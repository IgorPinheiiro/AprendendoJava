package aula04;

public class Aluno {
	String Nome;
	Curso Curso;
	String ra;
	
	public Aluno(String Nome, String ra, Curso Curso){
		this.Nome = Nome;
		this.ra = ra;
		this.Curso = Curso;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Curso getCurso() {
		return Curso;
	}

	public void setCurso(Curso curso) {
		Curso = curso;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	
	
	
	
}