package Classes;

public class Churrasco {

    public void verificarConsumo(int idade, boolean vegetariana){
        if (idade >= 0 && idade < 3){
            System.out.println("Não consomem carne!");
        }
        else if (vegetariana) {
            System.out.println("Vegetarianos não consomem carne!");
        } else if(idade >= 4 && idade <= 12){
            System.out.println("Pessoas nessa idade consomem 1kg de carne!");
        }
            else if (idade > 13) {
            System.out.println("Pessoas nessa idade consomem 2kg de carne!");
        }
    }
}
