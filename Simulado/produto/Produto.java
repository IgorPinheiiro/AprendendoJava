package produto;

public class Produto {
    private String produtoNome, preco;
    private Tipo tipo;

    public Produto(String produtoNome, String preco, Tipo tipo){
        this.produtoNome = produtoNome;
        this.preco = preco;
        this.tipo = tipo;
    }

    void exibeProduto(){
        System.out.println("produtoNome:  " + produtoNome);
        System.out.println("preço:  " + preco);
        System.out.println("tipo:  " + tipo);

    }

}
