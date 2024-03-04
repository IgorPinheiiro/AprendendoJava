package Classes;

public class Carro {
    int velocidade;

    public Carro(){
        velocidade = 300;
    }
     public void acelerarCarro(){
        velocidade += 15;
        if (velocidade > 300){
            System.out.println("O limite de velocidade foi atingido");
            velocidade = 300;
        }
     }

    public void frearCarro(){
        velocidade -= 5;
        if (velocidade  < 0){
            System.out.println("A velocidade minima foi atingida, o carro deve parar.");
            velocidade = 0;
        }
    }

    public void mostrarVelocidade(){
        System.out.println("A velocidade atual do carro é de: " + velocidade + " Km/h");
    }
}
