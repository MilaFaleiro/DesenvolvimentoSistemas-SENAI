public class CarrosApp {
    public static void main(String[] args) {
        Carros c1 = new Carros("S10" , "Ram", 2025);
        Carros c2 = new Carros( "Cybertruck" , "Tesla" , 2024);
        Carros c3 = new Carros( "SENNA GTR" , "MacLaren", 2027);

        System.out.println("O Modelo Do carro é: "+c1.getModelo());
        System.out.println("A marca do carro é: "+c1.getMarca());
        System.out.println("O Ano de Fabricação é: "+c1.getAnoFabricacao());
        
        System.out.println("O Modelo Do carro é: "+c2.getModelo());
        System.out.println("A marca do carro é: "+c2.getMarca());
        System.out.println("O Ano de Fabricação é: "+c2.getAnoFabricacao());
        
        System.out.println("O Modelo Do carro é: "+c3.getModelo());
        System.out.println("A marca do carro é: "+c3.getMarca());
        System.out.println("O Ano de Fabricação é: "+c3.getAnoFabricacao());

       


    }

}
