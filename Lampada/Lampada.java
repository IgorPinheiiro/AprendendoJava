package Lampada;

public class Lampada {
    private estadoLampada estado;
    private static int qtdAcendimentos;
    private static int qtdApagada;


    public void Lampada(boolean acesa, int qtdApagada, int qtdAcendimentos) {
        this.estado = estadoLampada.Acesa;
        this.qtdAcendimentos = qtdAcendimentos;
        this.qtdApagada = qtdApagada;
    }

    public void click() {
        if (estado == estadoLampada.Apagada) {
            estado = estadoLampada.Acesa;
            qtdAcendimentos++;
        } else {
            estado = estadoLampada.Apagada;
            qtdApagada++;
        }
    }

    public static void qtdAcendimentos() {
        System.out.println("A lampada foi acesa: " + qtdAcendimentos + " vezes.");
        System.out.println("A lampada foi apagada: " + qtdApagada + " vezes. ");
    }

    public void checaEstado() {
        if (estado == estadoLampada.Acesa) {
            System.out.println("A lampada esta acesa.");
        } else {
            System.out.println("A lampada esta apagada.");
        }
    }
}