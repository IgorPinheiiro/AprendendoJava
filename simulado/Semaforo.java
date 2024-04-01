package simulado;

public class Semaforo {
	private estados estado;
	
	public Semaforo(estados estado){
		this.estado = estado;;
	
	}
	
	void mudarProximo() {
		switch(estado) {
		case VERDE: 
			estado = estados.AMARELO;
			break;
		case AMARELO:
			estado = estados.VERMELHO;
			break;
		case VERMELHO:
			estado = estados.VERDE;
			break;
		}
	}
	void mostrarEstado() {
		System.out.println("O Semaforo esta: " + estado);
	}
	void indicar() {
		switch(estado) {
		case VERDE: 
			System.out.println("O carro deve seguir");
			break;
		case AMARELO:
			System.out.println("O carro deve aguardar o vermelho ou passar antes do vermelho");
			break;
		case VERMELHO:
			System.out.println("O carro deve parar");
			break;
		}
		
	}

	public estados getEstado() {
		return estado;
	}

	

}
