package POO.Veículo;

public class VeiculoMoto extends Veiculo {
    private int cilindradas;

    public VeiculoMoto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindradas: " + getCilindradas());
    }
    
    
}
