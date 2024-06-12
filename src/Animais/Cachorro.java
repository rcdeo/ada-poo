package Animais;

public class Cachorro extends Animal {

    // atributos
    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    // construtor (definido pelo usuario)
    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito, int tamanhoDoRabo) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        this.tamanhoDoRabo = tamanhoDoRabo;
        numeroDeCachorros++;
    }

    // metodos
    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String pegar() {
        return "bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
        }

        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar(){
        System.out.println("Au, Au, Au");;
    }
}
