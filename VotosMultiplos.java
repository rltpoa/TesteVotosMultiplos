import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class VotosMultiplos {

    public static void main(String[] args) {

        int quantidadeEleitores = 5;
        int quantidadeCandidatos = 3;

        List<Eleitor> votantes = criaPessoas(quantidadeEleitores, Eleitor.class);
        votantes.forEach(votante -> System.out.println(votante.nome));

        List<Candidato> candidatos = criaPessoas(quantidadeCandidatos, Candidato.class);
        candidatos.forEach(votante -> System.out.println(votante.nome));

        System.out.println(candidatos.get(0).votosRecebidos);

    }

    public static <T> List<T> criaPessoas(int quantidade, Class<T> tipo) {
        String prefixo = tipo.equals(Candidato.class) ? "candidato" : "votante";
        List<T> novaLista = new ArrayList<T>();
        IntStream.range(1, quantidade + 1)
                .forEach(x -> novaLista.add(
                        tipo.equals(Candidato.class) ? (T) new Candidato(prefixo + String.valueOf(x))
                                : (T) new Eleitor(prefixo + String.valueOf(x))));
        return novaLista;
    }

}
