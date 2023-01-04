import java.util.List;

public class Eleitor extends Pessoa {

    // permite que cada eleitor vote em mais de um candidato
    public List<Candidato> votosRealizados;

    public Eleitor(String nome) {
        this.nome = nome;
    }

}
