import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Pessoa> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println("5 - Pesquisar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    alterar();
                    break;
                case 4:
                    remover();
                    break;
                case 5:
                    pesquisar();
                    break;
            }

        } while (opcao != 0);
    }

    static void cadastrar() {
        System.out.println("1 - Aluno | 2 - Professor");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        if (tipo == 1) {
            System.out.print("Matrícula: ");
            String matricula = sc.nextLine();
            lista.add(new Aluno(nome, idade, matricula));
        } else {
            System.out.print("Disciplina: ");
            String disciplina = sc.nextLine();
            lista.add(new Professor(nome, idade, disciplina));
        }

        System.out.println("Cadastrado com sucesso!");
    }

    static void listar() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("\nÍndice: " + i);
            lista.get(i).exibirDados();
        }
    }

    static void alterar() {
        listar();
        System.out.print("Digite o índice para alterar: ");
        int i = sc.nextInt();
        sc.nextLine();

        Pessoa p = lista.get(i);

        System.out.print("Novo nome: ");
        p.setNome(sc.nextLine());

        System.out.print("Nova idade: ");
        p.setIdade(sc.nextInt());
        sc.nextLine();

        if (p instanceof Aluno) {
            System.out.print("Nova matrícula: ");
            ((Aluno) p).setMatricula(sc.nextLine());
        } else if (p instanceof Professor) {
            System.out.print("Nova disciplina: ");
            ((Professor) p).setDisciplina(sc.nextLine());
        }

        System.out.println("Alterado com sucesso!");
    }

    static void remover() {
        listar();
        System.out.print("Digite o índice para remover: ");
        int i = sc.nextInt();
        lista.remove(i);
        System.out.println("Removido com sucesso!");
    }

    static void pesquisar() {
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        for (Pessoa p : lista) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                p.exibirDados();
            }
        }
    }
}

