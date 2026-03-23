public class PessoaApp {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ("Camilla" , 20);
        Pessoa p2 = new Pessoa ( "Chloe" , 3);

        System.out.println("O nome da pessoa é: "+p1.getNome());
        System.out.println("A Idade da pessoa é: "+p1.getIdade());

        p1.setNome("Mia");
        p1.setIdade( 82);

        System.out.println("O nome da pesssoa é:" +p2.getNome());
        System.out.println("A idade da pesssoa é:" +p2.getIdade());

        p2.setNome( "Anderson");
        p2.setIdade(59);


    }

}
