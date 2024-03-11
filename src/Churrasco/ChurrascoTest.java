package Churrasco;

public class ChurrascoTest {
    public static void main(String[] args) {
        Pessoa pes = new Pessoa("Sam", "Masculino", 22, false );
        Churrasco C = new Churrasco();
        C.verificarConsumo(pes.idade, pes.vegetariana);
    }
}



