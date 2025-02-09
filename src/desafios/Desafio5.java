package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {

    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        double media = numeros.stream().filter(n -> n>5).mapToDouble(n -> n).average().orElse(0);
        System.out.println(media);
    }
}
