import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Grupo {
    private String nomeDoGrupo;
    private List<Personagem> membros;

    public Grupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
        this.membros = new ArrayList<>();
    }

    public String getNomeDoGrupo() {
        return nomeDoGrupo;
    }

    public void adicionarMembro(Personagem personagem) {
        membros.add(personagem);
    }

    public void listarMembros() {
        System.out.println("\n--- Membros do Grupo " + nomeDoGrupo + " ---");
        for (Personagem p : membros) {
            p.exibirStatus();
        }
        System.out.println("---------------------------");
    }

    public void batalhar(Personagem a, Personagem b) {

        double poderA = a.calculaPoderTotal();
        double poderB = b.calculaPoderTotal();

        if (poderA > poderB) {
            System.out.println(a.getNome() + " venceu! Poder total: " + poderA);
        } else if (poderA < poderB) {
            System.out.println(b.getNome() + " venceu! Poder total: " + poderB);
        } else {
            System.out.println("Empate! Os personagens possuem a mesma quantidade de poder total!");
        }
    }

    public void ordenarMembrosPorNivel() {
        Collections.sort(this.membros);
    }

    public List<Personagem> getMembros() {
        return membros;
    }
}
