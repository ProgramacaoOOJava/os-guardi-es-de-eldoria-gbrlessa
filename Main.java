
public class Main {
    public static void main(String[] args) {

        Grupo grupo1 = new Grupo ("Magos");
        Grupo grupo2 = new Grupo ("Guerreiros");
        Mago drake = new Mago("Drake", "Mago", 240, 350, 360.0, 120.0);
        Mago jorge = new Mago("Jorge", "Mago", 103, 150, 170.0, 40.0);
        Guerreiro dory = new Guerreiro("Dory", "Guerreiro", 290, 890, 210.0, 190.0);
        Guerreiro claudia = new Guerreiro("Claudia", "Guerreiro", 130, 680, 150.0, 160.0);

        grupo1.adicionarMembro(drake);
        grupo1.adicionarMembro(jorge);
        grupo2.adicionarMembro(dory);
        grupo2.adicionarMembro(claudia);

        grupo1.ordenarMembrosPorNivel();
        grupo2.ordenarMembrosPorNivel();
        
        grupo1.listarMembros();
        grupo2.listarMembros();
    }
}
