package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {

    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 17);

    public static void main(String[] args) {
        Map<String, List<Integer>> agruparImparPar = numeros.stream().collect(Collectors.groupingBy(n -> {
            if(n%2 == 0) return "Par";
            return "Impar";
        }));
        System.out.println(agruparImparPar);
    }
}
