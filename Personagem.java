public abstract class Personagem implements Comparable<Personagem> {
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

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

    //Método auxiliar para calcular o poder total
    public double calculaPoderTotal() {
        return nivel * poderBase;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Personagem outro) {
        if (this.nivel > outro.nivel) {
            return 1;
        } else if (this.nivel < outro.nivel) {
            return -1;
        } else {
            return 0;
        }
    }

    public abstract void usarHabilidadeEspecial();
}

