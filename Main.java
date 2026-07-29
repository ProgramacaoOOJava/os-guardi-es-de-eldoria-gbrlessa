public class Main {
    public static void main(String[] args) {
        // Instanciação dos personagens
        Mago luke = new Mago("Luke", "Mago", 100, 250, 127.5, 540);
        Guerreiro thorin = new Guerreiro("Thorin", "Guerreiro", 78, 590, 115, 340);

        luke.exibirStatus();
        luke.usarHabilidadeEspecial();

        thorin.exibirStatus();
        thorin.usarHabilidadeEspecial();

        Personagem[] personagens = new Personagem[2];
        personagens[0] = new Mago("Drake","Mago", 59, 350, 98, 260);
        personagens[1] = new Guerreiro("Garen", "Guerreiro", 86, 380, 99, 280);

        for (Personagem p : personagens) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
        }
    }
}
