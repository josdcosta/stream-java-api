import java.util.Arrays;
import java.util.List;

public class Desafio14 {

    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 17);

    public static void main(String[] args) {
        List<Integer> maiorPrimo = numeros.stream().distinct().filter(n -> {
            if(n == 1) return false;
            for (int i = 1; i < n; i++) {
                if(n % i == 0 && i != 1){
                    return false;
                }
            }
            return true;
        }).sorted(Integer::compareTo).toList().reversed();
        System.out.println(maiorPrimo.getFirst());
    }
}
