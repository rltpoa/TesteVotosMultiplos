import java.util.Map;

public class Eleitor extends Pessoa {

    public Map<String, Candidato> votosRealizados;

    public Eleitor(String nome) {
        this.nome = nome;
    }

}
