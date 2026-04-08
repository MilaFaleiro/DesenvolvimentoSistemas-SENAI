import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de animal (cachorro/gato):");
        int escolha = scanner.nextInt();

        Animal animalSelecionado;
        if (escolha == 1) {
            animalSelecionado = new Cachorro();
        } else if (escolha == 2) {
            animalSelecionado = new Gato();
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        animalSelecionado.fazerSom();
        scanner.close();
    }
}
