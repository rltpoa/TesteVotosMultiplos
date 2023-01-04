import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class VotosMultiplos {

    public static void main(String[] args) {

        int quantidadeVotantes = 5;
        int quantidadeCandidatos = 3;

        List<Pessoa> votantes = criaPessoas(quantidadeVotantes, PessoaTipo.ELEITOR);
        votantes.forEach(votante -> System.out.println(votante.nome));

        List<Pessoa> candidatos = criaPessoas(quantidadeCandidatos, PessoaTipo.CANDIDATO);
        candidatos.forEach(votante -> System.out.println(votante.nome));

        System.out.println(candidatos.get(0).votosRecebidos);

    }

    public static List<Pessoa> criaPessoas(int quantidade, PessoaTipo tipo) {
        List<Pessoa> novaLista = new ArrayList<Pessoa>();
        IntStream.range(1, quantidade + 1)
                .forEach(x -> novaLista.add(
                        tipo.equals(PessoaTipo.CANDIDATO) ? new Candidato("candidato" + String.valueOf(x))
                                : new Eleitor("votante" + String.valueOf(x))));
        return novaLista;
    }

}
