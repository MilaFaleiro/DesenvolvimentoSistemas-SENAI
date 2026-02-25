public class vet03 {
    public static void main(String[] args) {
        int [] numeros = {10,20,30,40,50};

       for(int i = 0; i < numeros.length; i++){
           System.out.println("Posição " + i + ": " + numeros[i]);
       }
       for(int num : numeros){
           System.out.println(num);
       }
    }
}
