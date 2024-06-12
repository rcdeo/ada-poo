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

    }
}