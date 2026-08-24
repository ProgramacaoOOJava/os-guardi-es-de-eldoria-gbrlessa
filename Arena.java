import java.util.List;

public class Arena {
    public void batalharGrupos(Grupo g1, Grupo g2) {
        List<Personagem> time1 = g1.getMembros();
        List<Personagem> time2 = g2.getMembros();

        int rounds = Math.min(time1.size(), time2.size());

        for (int i = 0; i < rounds ; i++) {
            g1.batalhar(time1.get(i), time2.get(i));
        }
    }
}
