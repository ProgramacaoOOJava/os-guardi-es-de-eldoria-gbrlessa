public class Main {
    public static void main(String[] args) {
        // Instanciação dos personagens
        Personagem luke = new Personagem("Luke", "Arqueiro", 52, 150, 57.5);
        Personagem dory = new Personagem("Dory", "Mago", 92, 90, 89);

        // Exibição dos status dos personagens
        luke.exibirStatus();
        dory.exibirStatus();
    }
}
