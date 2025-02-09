package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {

    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

    public static void main(String[] args) {
        int somaDosQuadrados = numeros.stream().map(n -> n*n).reduce(0, Integer::sum);
        System.out.println(somaDosQuadrados);
    }
}
