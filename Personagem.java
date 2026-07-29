public abstract class Personagem {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Método construtor da classe Personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }
    // Método de exibição dos personagens
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---\n"
        + "\nNome: " + nome
        + "\nClasse: " + classe
        + "\nNível: " + nivel
        + "\nPontos de Vida: " + pontosDeVida
        + "\nPoder Base: " + poderBase);
    }

    public abstract void usarHabilidadeEspecial();
}

