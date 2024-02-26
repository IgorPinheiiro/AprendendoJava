package Test;

import Classes.ContadorPessoas;

import java.util.Scanner;

public class ContadorPessoasTest {
    public static void main(String[] args) {

        ContadorPessoas Count = new ContadorPessoas();

        boolean loopRodando = true ;

        Scanner sc = new Scanner(System.in);

        while (loopRodando){
            System.out.println("Entre com uma opção");
            System.out.println("1. Adiciona uma Pessoa");
            System.out.println("2. Remove uma Pessoa");
            System.out.println("3. Limpa o total");
            System.out.println("4. Mostra a quantidade total");
            System.out.println("5. Sair do programa");

            String StrUserInput = sc.next();

            int intUserInput = Integer.parseInt(StrUserInput);

            if(intUserInput == 1){
                System.out.println("Adicionando 1 Pessoa");
                Count.adicionarPessoa();
            }
            else if(intUserInput == 2){
                System.out.println("Removendo 1 Pessoa");
                Count.removerPessoa();
            }
            else if(intUserInput == 3){
                System.out.println("Limpando o Contador");
                Count.limparSala();
            }
            else if(intUserInput == 4){
                Count.mostrarTotalPessoas();
            }
            else if( intUserInput == 5){
                    loopRodando = false;
            }
            else{
                loopRodando = false;
            }

        }



    }


}