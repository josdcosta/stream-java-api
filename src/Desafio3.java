import java.util.Arrays;
import java.util.List;

public class Desafio3 {

    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        boolean positivos = numeros.stream().allMatch(n -> (n >= 0));
        if(positivos){
            System.out.println("Todos positivos!");
        } else {
            System.out.println("Algum não é positivo!");
        }
    }
}
