import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Spike", "Cinza", 35, 40.5, "nada", 15);
        Gato gato1 = new Gato("Frajola", "Preto", 20, 5, "nada");
        Passaro passaro1 = new Passaro("Piu-Piu", "Amarelo", 10, 0.5, "nada");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}