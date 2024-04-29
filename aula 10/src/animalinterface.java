
public interface animalinterface {
	
	void emitirSom();
	
	default void respirar() {
		System.out.println("HMPF");
	}
	
	static void algoEstatico() {
		System.out.println("teste");
	}
}
