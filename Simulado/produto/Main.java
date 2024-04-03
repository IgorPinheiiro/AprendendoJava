package produto;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("caneta","2,30",Tipo.ESCRITORIO);

        p.exibeProduto();
    }
}
