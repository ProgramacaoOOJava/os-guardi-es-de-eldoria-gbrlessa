public class Mago extends Personagem {
    double inteligencia;

    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase, double inteligencia) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.inteligencia = inteligencia;
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Inteligência: " + inteligencia);
    }

    public void usarHabilidadeEspecial() {
        System.out.println("\nMago " + nome + " lança Bola de fogo!!!");
    }
}
