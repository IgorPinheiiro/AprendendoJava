package Test;


import Classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro Car = new Carro();
        for(int i=0; i < 20/* acidione a quantidade de vezes que quer frear ou acelerar */ ; i++){
            Car.frearCarro(); //substituir por acelerar ou frear
        }

        Car.mostrarVelocidade();
    }


}






// Classe carro, o carro só pode ter velocidade maior que 0 e menor que 300. ao acelerador +15 e ao freiar -5.