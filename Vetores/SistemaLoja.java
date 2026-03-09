import java.util.Scanner;

public class SistemaLoja {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // Regra: Capacidade máxima de 5 produtos
            String[] nomes = new String[5];
            int[] estoque = new int[5];
            
            // Regra: Controlar cadastros com variável qtd
            int qtd = 0; 
            int opcao;
            
            while (true) {
                System.out.println("\n=== Lojinha do seu Jão ===");
                System.out.println("1 - Cadastrar produto");
                System.out.println("2 - Listar produtos");
                System.out.println("3 - Pesquisar produto");
                System.out.println("4 - Alterar produto");
                System.out.println("5 - Remover produto");
                System.out.println("6 - Sair do sistema");
                System.out.print("Opção: ");
                opcao = sc.nextInt();
                sc.nextLine(); // limpar buffer
                
                if (opcao == 6) {
                    System.out.println("Tchauzinho, volte sempre!!");
                    break;
                }
                
                switch (opcao) {
                    case 1: // CADASTRAR PRODUTO
                        if (qtd == nomes.length) {
                            System.out.println("Lista cheia! Limite de 5 produtos atingido.");
                            break;
                        }
                        
                        System.out.print("Digite o nome do produto: ");
                        nomes[qtd] = sc.nextLine();
                        
                        System.out.print("Digite a quantidade em estoque: ");
                        estoque[qtd] = sc.nextInt();
                        sc.nextLine(); // limpar buffer
                        
                        qtd++;
                        System.out.println("Produto cadastrado com sucesso!");
                        break;
                        
                    case 2: // LISTAR PRODUTOS
                        if (qtd == 0) {
                            System.out.println("Nenhum produto cadastrado.");
                            break;
                        }
                        
                        System.out.println("\nProdutos cadastrados:");
                        for (int i = 0; i < qtd; i++) {
                            // Exibe índice, nome e quantidade
                            System.out.println("Índice " + i + " | " + nomes[i] + " - Quantidade: " + estoque[i]);
                        }
                        break;
                        
                    case 3: // PESQUISAR PRODUTO
                        if (qtd == 0) {
                            System.out.println("Nenhum produto cadastrado.");
                            break;
                        }
                        
                        System.out.print("Digite o nome do produto para pesquisar: ");
                        String busca = sc.nextLine();
                        
                        int posBusca = -1;
                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(busca)) {
                                posBusca = i;
                                break;
                            }
                        }
                        
                        if (posBusca == -1) {
                            System.out.println("Produto não encontrado.");
                        } else {
                            System.out.println("Encontrado: " + nomes[posBusca] + " - Quantidade: " + estoque[posBusca]);
                        }
                        break;
                        
                    case 4: // ALTERAR PRODUTO
                        if (qtd == 0) {
                            System.out.println("Nenhum produto cadastrado.");
                            break;
                        }
                        
                        System.out.print("Digite o nome do produto que deseja alterar: ");
                        String nomeAlterar = sc.nextLine();
                        
                        int posAlt = -1;
                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(nomeAlterar)) {
                                posAlt = i;
                                break;
                            }
                        }
                        
                        if (posAlt == -1) {
                            System.out.println("Produto não encontrado.");
                        } else {
                            System.out.print("Novo nome do produto: ");
                            String novoNome = sc.nextLine();
                            
                            System.out.print("Nova quantidade em estoque: ");
                            int novoEstoque = sc.nextInt();
                            sc.nextLine();
                            
                            nomes[posAlt] = novoNome;
                            estoque[posAlt] = novoEstoque;
                            
                            System.out.println("Produto alterado com sucesso!");
                        }
                        break;
                        
                    case 5: 
                        if (qtd == 0) {
                            System.out.println("Nenhum produto cadastrado.");
                            break;
                        }
                        
                        System.out.print("Digite o nome do produto para remover: ");
                        String nomeRemover = sc.nextLine();
                        
                        int posRem = -1;
                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                                posRem = i;
                                break;
                            }
                        }
                        
                        if (posRem == -1) {
                            System.out.println("Produto não encontrado.");
                        } else {
                            
                            for (int i = posRem; i < qtd - 1; i++) {
                                nomes[i] = nomes[i + 1];
                                estoque[i] = estoque[i + 1];
                            }
                            
                           
                            nomes[qtd - 1] = null;
                            estoque[qtd - 1] = 0;
                            
                            qtd--;
                            System.out.println("Produto removido com sucesso!");
                        }
                        break;
                        
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            }
        }
    }
}