package POO.Veículo;

public class VeiculoCarro extends Veiculo {
    private int portas;

    public VeiculoCarro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Portas: " + getPortas());
    }
}