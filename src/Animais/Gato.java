package Animais;

public class Gato extends Animal {

    // atributos
    static int numeroDeGatos;

    // construtor
    public Gato(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        numeroDeGatos++;
    }

    // metodos
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Miau, Miau, Miau");
    }
}
