import Animais.Cachorro;

public class Main {

    public static void main(String[] args) {

        // construtor
        Cachorro cachorro1 = new Cachorro("Rex", "Black", 35, 40.5, 15, "nada");
        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("Max", "Black", 35, 40.5, 15, "nada");
        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());

        // endereco de memoria
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

    }
}