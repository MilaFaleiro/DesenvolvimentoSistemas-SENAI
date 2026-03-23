import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto p = new Produto();

        System.out.print("Digite o nome do produto: ");
        p.nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        p.preco = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        p.quantidade = scanner.nextInt();

        System.out.println("\nDados do produto:");
        p.exibirDados();

        scanner.close();
    }
}
