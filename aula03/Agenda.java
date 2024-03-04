package aula03;

public class Agenda {
	int diaNumero;
	DiasDaSemana dia;
	
	Agenda(int DiaNumero, DiasDaSemana dia){
		this.diaNumero = diaNumero;
		this.dia = dia;
	}
	void mostrarTarefa() {
		switch(dia) {
		
		case DOMINGO:	System.out.println("PEIXAO");
					break;
					
		case SEGUNDA:	System.out.println("JAVA");
					break;
		
		case QUARTA: 	System.out.println("SQL");
					break;
		
		case SEXTA: 		System.out.println("SEGURANÇA");
					break;
					
		default: System.out.println("PHODAS*");
	
		}
	}
}
