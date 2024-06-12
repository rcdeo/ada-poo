import Animais.Cachorro;

public class Main {

    public static void main(String[] args) {

        /*
         * byte	  -128 to 127
         * short   -32,768 to 32,767
         * int     -2,147,483,648 to 2,147,483,647
         * long    -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         * float   Sufficient for storing 6 to 7 decimal digits
         * double	Sufficient for storing 15 decimal digits
         * char	Stores a single character/letter or ASCII values
         * boolean	true or false
         * */

        // usando o construtor padrao
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Rex");
        cachorro1.setCor("Brown");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);
        cachorro1.setTamanhoDoRabo(5);

//        cachorro1.latir(); // void
//        System.out.println("O cachorro pegou uma " + cachorro1.pegar() + "."); // return string

        System.out.println("O cachorro está " + cachorro1.interagir("carinho") + ".");
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir") + ".");
        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha") + ".");
        System.out.println("O cachorro está " + cachorro1.interagir("") + ".");

        // usando o construtor adicionado
        Cachorro cachorro2 = new Cachorro("Max", "Black", 35, 40.5, 15, "nada");
        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getCor());

    }
}