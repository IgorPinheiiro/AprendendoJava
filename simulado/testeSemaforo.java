package simulado;

public class testeSemaforo {

	public static void main(String[] args) {
		Semaforo sem = new Semaforo(estados.AMARELO);
		
	
		sem.mudarProximo();
		sem.mudarProximo();
		sem.mostrarEstado();
		sem.indicar();
		
		
		
	}

}
