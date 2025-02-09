package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {

    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 17);

    public static void main(String[] args) {
        List<Integer> primos = numeros.stream().filter(n -> {
            if(n == 1) return false;
            for (int i = 1; i < n; i++) {
                if(n % i == 0 && i != 1){
                    return false;
                }
            }
            return true;
        }).toList();
        System.out.println(primos);
    }
}
