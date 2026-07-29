public class Guerreiro extends Personagem {
    double forca;

    public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase, double forca) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Força: " + forca);
    }

    public void usarHabilidadeEspecial() {
        System.out.println("\nGuerreiro " + nome +" ataca com Espada Flamejante!!!");
    }
}
