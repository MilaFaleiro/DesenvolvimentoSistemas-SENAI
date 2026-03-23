public class Produto {
    String nome;
    double preco;
    int quantidade;

    void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
