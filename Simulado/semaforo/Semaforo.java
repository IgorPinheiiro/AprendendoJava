package semaforo;

//Exerc´ıcio 2. Desenvolva uma classe chamada Semaforo, representando um
//sem´aforo de tr´afego, com as seguintes especifica¸c˜oes:
//• Um campo privado chamado estado que armazena o estado atual do
//sem´aforo. O estado do sem´aforo pode ser ”Verde”, ”Amarelo” ou ”Vermelho”.
//• Um m´etodo mudarProximo() que altera o estado do sem´aforo para o pr´oximo
//estado na sequˆencia padr˜ao (Verde -¿ Amarelo -¿ Vermelho -¿ Verde).
//• Um m´etodo mostrarEstado() que imprime o estado atual do sem´aforo.
//• Um m´etodo indicar() que indica o que um carro deve fazer de acordo
//com o estado.

import static semaforo.Estado.*;

public class Semaforo {
    private Estado estado;


    public Semaforo(Estado estado){
    this.estado = estado;
    }

    void mudarEstado(){
        switch (estado){
            case VERDE:
                estado = AMARELO;
                break;
            case AMARELO:
                estado = VERMELHO;
                break;
            case VERMELHO:
                estado = VERDE;
                break;
        }


    }

    void mostrarEstado(){
        System.out.println("O estado atual é: " + estado);
    }

    void indicar(){
        switch (estado){
            case VERDE:
                System.out.println("O carro deve seguir");
                break;
            case AMARELO:
                System.out.println("Acelera que vai fechar");
                break;
            case VERMELHO:
                System.out.println("O carro deve parar");
                break;

        }


    }
}
