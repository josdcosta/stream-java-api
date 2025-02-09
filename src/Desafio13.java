import java.util.Arrays;
import java.util.List;

public class Desafio13 {

    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        List<Integer> listaIntervalo = numeros.stream().filter(n -> n >= 5 && n < 10).toList();
        System.out.println(listaIntervalo);
    }
}
