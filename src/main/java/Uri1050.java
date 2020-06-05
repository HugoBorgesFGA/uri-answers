import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Uri1050 {
    public static void main(String[] args) {
        final Map<Integer, String> cityByDDD = new HashMap<Integer, String>(){{
           put(61, "Brasilia");
           put(71, "Salvador");
           put(11, "Sao Paulo");
           put(21, "Rio de Janeiro");
           put(32, "Juiz de Fora");
           put(19, "Campinas");
           put(27, "Vitoria");
           put(31, "Belo Horizonte");
        }};

        final Scanner scanner = new Scanner(System.in);
        Integer ddd = scanner.nextInt();

        System.out.println(
                Optional.ofNullable(cityByDDD.get(ddd))
                        .orElse("DDD nao cadastrado")
        );
    }
}
