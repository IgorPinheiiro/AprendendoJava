package aula05;

import java.util.ArrayList;


public class Professor {

	private String nome;
	private ArrayList<Disciplina> disciplinas;

	public Professor(String nome) {
		this.nome = nome;
		disciplinas = new ArrayList<Disciplina>();
	}

	public void atribuir(Disciplina d) {
		disciplinas.add(d);
	}

	public void largar(Disciplina d) {
		disciplinas.remove(d);
	}



	public void listar() {
		/*
		 * System.out.println("Nome: " + nome); for(int i=0; i < disciplinas.size();
		 * i++) { disciplinas.get(i).mostrar(); }
		 */
		for (Disciplina disciplina : disciplinas) {
			disciplina.mostrar();
		}
	}

	public void listarProfissionalizante() {
		System.out.println("Nome: " + nome);
		for (Disciplina d : disciplinas) {
			if (d.isProfissionalizante()) {
				d.mostrar();
			}
		}
	}

	public void listarBasica() {
		System.out.println("Nome: " + nome);
		for (Disciplina d : disciplinas) {
			if (d.isBasica()) {
				d.mostrar();
			}
		}
	}

	public void listarLingua() {
		System.out.println("Nome: " + nome);
		for (Disciplina d : disciplinas) {
			if (d.isLingua()) {
				d.mostrar();
			}
		}
	}

	public void recebeDisciplina(String Nome) {
		for (Disciplina d : disciplinas) {
			if (d.getnome() == Nome) {
					d.mostrar();
			}
		}

	}
}

														