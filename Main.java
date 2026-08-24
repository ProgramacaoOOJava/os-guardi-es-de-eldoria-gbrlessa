
public class Main {
    public static void main(String[] args) {

        // Criação dos grupos
        Grupo magos = new Grupo ("Magos");
        Grupo guerreiros = new Grupo ("Guerreiros");

        //Criação dos personagens
        Mago drake = new Mago("Drake", "Mago", 240, 350, 360.0, 120.0);
        Mago jorge = new Mago("Jorge", "Mago", 103, 150, 170.0, 40.0);
        Guerreiro dory = new Guerreiro("Dory", "Guerreiro", 290, 890, 210.0, 190.0);
        Guerreiro claudia = new Guerreiro("Claudia", "Guerreiro", 130, 680, 150.0, 160.0);

        //Adicionando os personagens aos grupos
        magos.adicionarMembro(drake);
        magos.adicionarMembro(jorge);
        guerreiros.adicionarMembro(dory);
        guerreiros.adicionarMembro(claudia);

        //Ordenando os grupos por nível
        magos.ordenarMembrosPorNivel();
        guerreiros.ordenarMembrosPorNivel();
        
        //Lista os membros
        magos.listarMembros();
        guerreiros.listarMembros();

        //Realiza batalha dos grupos
        System.out.println("\n --- Início da Batalha ---");
        Arena arena = new Arena();
        arena.batalharGrupos(magos, guerreiros);
    }
}
