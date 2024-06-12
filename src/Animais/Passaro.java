package Animais;

public class Passaro extends Animal {

    // atributos
    static int numeroDePassaros;

    // construtor
    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        numeroDePassaros++;
    }

    // metodos
    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Piu, Piu, Piu");
    }
}
