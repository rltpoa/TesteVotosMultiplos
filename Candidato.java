import java.util.List;

public class Candidato extends Pessoa {

    // permite identificar os eleitores que votaram em cada candidato
    public List<Eleitor> votosRecebidos;

    public Candidato(String nome) {
        this.nome = nome;
    }

}
