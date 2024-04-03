package semaforo;

public class MainTest {
    public static void main(String[] args) {
        Semaforo sem = new Semaforo(Estado.VERDE);

        sem.mudarEstado();
        sem.mudarEstado();
        sem.mudarEstado();
        sem.mostrarEstado();
        sem.indicar();
    }
}
