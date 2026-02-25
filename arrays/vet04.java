public class vet04 {
    public static void main(String[] args) {
        
        String [] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Pedro";

        for(int i=0; i < nomes.length; i++){
            System.out.println("O nome é " + i + ": " + nomes[i]);
        }
        
        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
