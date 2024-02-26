package Classes;

public class ContadorPessoas {
    private int numeroDePessoas = -0;

    public void adicionarPessoa() {
        numeroDePessoas++;
        System.out.println("Uma pessoa foi adicionada à sala. Total de pessoas na sala: " + numeroDePessoas);
    }

    public void removerPessoa() {
        if (numeroDePessoas > 0) {
            numeroDePessoas--;
            System.out.println("Uma pessoa foi removida da sala.");
        } else {
            System.out.println("A sala já está vazia. Não é possível remover mais pessoas.");
        }
    }

    public void limparSala() {
        numeroDePessoas = 0;
        System.out.println("Não há mais pessoas na sala.");
    }

    public void mostrarTotalPessoas() {
        System.out.println("Total de pessoas na sala: " + numeroDePessoas);
    }
}