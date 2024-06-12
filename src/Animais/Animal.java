package Animais;

public class Animal {

    // atributos (comum a todos os animais)
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    // construtor
    public Animal(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    // metodos (comum a todos os animais)
    protected void comer() {
    }

    protected void dormir() {
    }

    public void soar() {
        System.out.println("Cri, Cri, Cri");
    }
}
