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

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Puppy";
        cachorro1.cor = "Brown";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;

        System.out.println(cachorro1);

    }
}
