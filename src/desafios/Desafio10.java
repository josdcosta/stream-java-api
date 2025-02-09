package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio10 {

    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

    public static void main(String[] args) {
        Map<String, List<Integer>> multiplosDe3ou5 = numeros.stream().filter(n -> n%2!=0 && (n%3==0 || n%5==0)).collect(Collectors.groupingBy(n -> {
            if(n%3 == 0 & n%5 == 0) return "Multiplo de 3 e 5";
            if(n%3 == 0) return "Multiplo de 3";
            return "Multiplo de 5";
        }));
        System.out.println(multiplosDe3ou5);
    }
}
