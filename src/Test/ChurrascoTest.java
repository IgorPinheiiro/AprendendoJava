package Test;
//Introducao, construtores e enumeracoes
//Exercicio 1. Dada a classe Pessoa que possui os atributos: String nome,
//String sexo, int idade, boolean vegetariana. Faca agora uma classe Churrasco que possua:
// Atributos: qtdCarne(double); Metodo: verificarConsumo(): Recebe via parametro uma Pessoa
// e com isto define a consumacao media de carne (quantidade de carne consumida)
// pessoas de 0 a 3 anos nao consomem, vegetarianos tambem nao. Pessoas de 4 a 12 anos consomem 1 kilo de carne
// e de 13 anos em diante 2 kilos de carne.
import Classes.Churrasco;
import Classes.Pessoa;

public class ChurrascoTest {
    public static void main(String[] args) {
        Pessoa pes = new Pessoa("Sam", "Masculino", 22, false );
        Churrasco C = new Churrasco();
        C.verificarConsumo(pes.idade, pes.vegetariana);
    }
}



