package aula04;

public class Main {
	public static void main (String[] args) {
		Aluno a = new Aluno("Matheus", "0050205111192", Curso.SI);
		System.out.println(a.getNome());
		System.out.println(a.getRa());
		System.out.println(a.getCurso());
	}
}
