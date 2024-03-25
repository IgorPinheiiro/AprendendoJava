package aula05;

public class Main {

	public static void main(String[] args) {
	Disciplina d1 = new Disciplina("JavaScript", "ISW-008", Tipo.PROFISSIONALIZANTE);
	
	Disciplina d2 = new Disciplina("Servidores 1", "IDS-001", Tipo.PROFISSIONALIZANTE);
	
	Disciplina d3 = new Disciplina("Calculo", "IAG-003", Tipo.BASICA);
	
	Professor p = new Professor("Garcia");
	
	p.atribuir(d1);
	p.atribuir(d2);
	p.atribuir(d3);
	p.listarProfissionalizante();
	p.listarBasica();
	p.listarLingua();
	
	}
	

}
