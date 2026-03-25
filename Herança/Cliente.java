public class Cliente{
    private int codigo;
    private String nome;
    private String endereco;

    public Cliente(int codigo, String nome, String endereco){
        this.codigo=codigo;
        this.nome=nome;
        this.endereco=endereco;

    }

    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void exibirInfo(){
        System.out.println("O código é "+getCodigo());
        System.out.println("O nome é "+getNome());
        System.out.println("O endereço "+getEndereco());
    }

    
}