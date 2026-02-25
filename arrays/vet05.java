
import java.util.Scanner;

public class vet05 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        String [] nomes = new String[3];

        for(int i=0; i < nomes.length; i++){
            System.err.println("Digite o nome " + (i+1) + ": ");
            nomes[i] = sc.nextLine();
        }
        System.out.println("o nome é: "+nomes[nomes.length-1]);
        
    }
}
