package POO.Veículo;

public class VeiculoApp {
    public static void main(String[] args) {
        VeiculoCarro carro = new VeiculoCarro("Toyota", 2020, 4);
        VeiculoMoto moto = new VeiculoMoto("Honda", 2019, 600);

        System.out.println("Dados do Carro:");
        carro.exibirDados();

        System.out.println("\nDados da Moto:");
        moto.exibirDados();
    }
}