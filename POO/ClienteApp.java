public class ClienteApp {
    public static void main(String[] args) {
        ClientePf pf = new ClientePf("Camilla Gomes ", "Rua A, 123", "123.456.789-00");
        ClientePj pj = new ClientePj("Empresa XYZ", "Avenida B, 456", "12.345.678/0001-00");

        System.out.println("Cliente PF:");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Endereço: " + pf.getEndereco());
        System.out.println("CPF: " + pf.getCpf());

        System.out.println("\nCliente PJ:");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Endereço: " + pj.getEndereco());
        System.out.println("CNPJ: " + pj.getCnpj());

        pf.atualizarDados("Camilla Faleiro", "Rua C, 789");
        pj.atualizarDados("Empresa ABC", "Avenida D, 012");
        
        System.out.println("\nDados atualizados:");
        System.out.println("Cliente PF:");
        System.out.println("Nome: " + pf.getNome());   
    }
    
}
