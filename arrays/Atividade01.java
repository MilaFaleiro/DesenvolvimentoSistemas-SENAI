import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String [] carros = new String [10];
            
            //Cadastro de carros
            for (int i = 0; i < carros.length; i++) {
                System.out.println("Digite o nome do carro " + (i + 1) + ":");
                carros[i] = sc.nextLine();
            }
            
            //Lista de carros cadastrados
            System.out.println("\nCarros cadastrados:");
            listar(carros);
            
            //Alteração de um carro
            System.out.println("\nDigite o número do carro que deseja alterar (1-10):");
            int posAlterar = sc.nextInt();
            sc.nextLine();
            if (posAlterar >= 1 && posAlterar <= carros.length) {
                System.out.println("Digite o novo nome do carro:");
                carros[posAlterar - 1] = sc.nextLine();
                System.out.println("Carro alterado com sucesso!");
            } else {
                System.out.println("Posição inválida!");
            }  System.out.println("\nLista após alteração:");
            listar(carros);
            
            //Remoção de um carro
            System.out.print("\nDigite a posição para remover: ");
            int posRemover = sc.nextInt();
            
            if (posRemover >= 0 && posRemover < carros.length) {
                
                // deslocar elementos
                for (int i = posRemover; i < carros.length - 1; i++) {
                    carros[i] = carros[i + 1];
                }
                
                carros[carros.length - 1] = null;
            } else {
                System.out.println("Posição inválida!");
            }
            
            System.out.println("\nLista após remoção:");
            listar(carros);
        }
    }
    // método para listar
    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }
}
