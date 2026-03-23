public class Carros {

    private String modelo;
    private String marca;
    private int anoFabricacao;


    public Carros (String modelo, String marca, int anoFabricacao){
        this.modelo=modelo;
        this.marca=marca;
        this.anoFabricacao=anoFabricacao;
    }

    public String getModelo(){
        return modelo;
    }


    public String getMarca(){
        return marca;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public void setMarca(String marca){
    this.marca=marca;
    }
    public void setAnofabricacao(int anoFabricacao){
    this.anoFabricacao=anoFabricacao;
    }

}
