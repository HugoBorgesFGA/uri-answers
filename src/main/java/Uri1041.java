import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class Uri1041 {

    public static Map<BiPredicate<Double, Double>, String> getMessagesByPredicate() {

        final Map<BiPredicate<Double, Double>, String> result = new HashMap<>();

        result.put((x, y) -> (x > 0) && (y > 0), "Q1");
        result.put((x, y) -> (x < 0) && (y > 0), "Q2");
        result.put((x, y) -> (x < 0) && (y < 0), "Q3");
        result.put((x, y) -> (x > 0) && (y < 0), "Q4");
        result.put((x, y) -> (x == 0) && (y == 0), "Origem");
        result.put((x, y) -> (x == 0) && (y != 0), "Eixo Y");
        result.put((x, y) -> (x != 0) && (y == 0), "Eixo X");

        return result;
    }


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final Double x = scanner.nextDouble();
        final Double y = scanner.nextDouble();

        getMessagesByPredicate().entrySet().stream()
                                           .filter(pair -> pair.getKey().test(x, y))
                                           .findFirst()
                                           .ifPresent(pair -> System.out.println(pair.getValue()));
    }
}
