import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Spike", "Cinza", 35, 40.5, "nada", 15);
        Gato gato1 = new Gato("Frajola", "Preto", 20, 5, "nada");
//        Animal gato2 = new Gato("Tom", "Cinza", 20, 5, "nada");

        Passaro passaro1 = new Passaro("Piu-Piu", "Amarelo", 10, 0.5, "nada");

//        Petshop petshop = new Petshop();
//
//        petshop.darBanho(passaro1);
//        System.out.println(passaro1.getEstadoDeEspirito());
//
//        petshop.deixarNoHotel(gato1);
//        System.out.println(gato1.getEstadoDeEspirito());
//
//        petshop.tosar(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

        int a1; // int, long, byte = 0
        float a2; // float e double = 0.0
        boolean a3; // boolean (default) = false
        char ch; // char = vazio
        String str; // default de qualquer objeto = null

        float x = 3.00f;
        double y = 5.5d;

        float z = x + (float) y; // casting
        System.out.println(z);

        int a = 23_567_098; // pode utilizar sublinhado no lugar de ponto para o número ser mais legível

    }
}