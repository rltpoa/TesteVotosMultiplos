import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class VotosMultiplos {

    public static void main(String[] args) {

        int quantidadeVotantes = 5;
        int quantidadeCandidatos = 3;

        List<Eleitor> votantes = criaVotantes(quantidadeVotantes);
        votantes.forEach(votante -> System.out.println(votante.nome));

        List<Candidato> candidatos = criaCandidatos(quantidadeCandidatos);
        candidatos.forEach(votante -> System.out.println(votante.nome));

    }

    public static List<Candidato> criaCandidatos(int quantidade) {
        List<Candidato> novaLista = new ArrayList<Candidato>();
        IntStream.range(1, quantidade + 1)
                .forEach(x -> novaLista.add(new Candidato("candidato" + String.valueOf(x))));
        return novaLista;
    }

    public static List<Eleitor> criaVotantes(int quantidade) {
        List<Eleitor> novaLista = new ArrayList<Eleitor>();
        IntStream.range(1, quantidade + 1)
                .forEach(x -> novaLista.add(new Eleitor("votante" + String.valueOf(x))));
        return novaLista;
    }

    // public static List<Pessoa> criaPessoas(int quantidade, String tipo) {
    //     List<Pessoa> novaLista = new ArrayList<Pessoa>();
    //     if (tipo.equals("candidato")) {
    //         novaLista = new ArrayList<Candidato>();
    //         IntStream.range(1, quantidade + 1)
    //                 .forEach(x -> novaLista.add(new Candidato("candidato" + String.valueOf(x))));
    //         return novaLista;
    //     }
    //     if (tipo.equals("eleitor")) {
    //         novaLista = new ArrayList<Eleitor>();
    //         IntStream.range(1, quantidade + 1)
    //                 .forEach(x -> novaLista.add(new Eleitor("votante" + String.valueOf(x))));
    //     }
    //     return novaLista;
    // }

}
